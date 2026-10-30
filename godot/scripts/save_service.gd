extends Node

const SAVE_DIRECTORY := "user://saves"
const SETTINGS_PATH := "user://settings.json"
const SLOT_COUNT := 3
var _settings: Dictionary = {}


func _ready() -> void:
	DirAccess.make_dir_recursive_absolute(ProjectSettings.globalize_path(SAVE_DIRECTORY))
	_settings = _read_json(SETTINGS_PATH)


func save_slot(slot: int, state: Dictionary) -> Error:
	if slot < 0 or slot >= SLOT_COUNT:
		return ERR_INVALID_PARAMETER
	return _write_json(_slot_path(slot), state)


func load_slot(slot: int) -> Dictionary:
	if slot < 0 or slot >= SLOT_COUNT:
		return {}
	return _read_json(_slot_path(slot))


func set_setting(key: StringName, value: Variant) -> Error:
	_settings[String(key)] = value
	return _write_json(SETTINGS_PATH, _settings)


func get_setting(key: StringName, default_value: Variant = null) -> Variant:
	return _settings.get(String(key), default_value)


func _slot_path(slot: int) -> String:
	return "%s/save%d.json" % [SAVE_DIRECTORY, slot]


func _read_json(path: String) -> Dictionary:
	if not FileAccess.file_exists(path):
		return {}
	var file := FileAccess.open(path, FileAccess.READ)
	if file == null:
		return {}
	var parsed: Variant = JSON.parse_string(file.get_as_text())
	return parsed if parsed is Dictionary else {}


func _write_json(path: String, value: Dictionary) -> Error:
	var file := FileAccess.open(path, FileAccess.WRITE)
	if file == null:
		return FileAccess.get_open_error()
	file.store_string(JSON.stringify(value, "  "))
	return OK
