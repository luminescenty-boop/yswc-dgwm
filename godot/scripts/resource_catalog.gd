extends Node

const MANIFEST_PATH := "res://assets/asset_manifest.json"
var _entries: Dictionary = {}


func _ready() -> void:
	var file := FileAccess.open(MANIFEST_PATH, FileAccess.READ)
	if file == null:
		push_warning("Asset manifest is unavailable: %s" % MANIFEST_PATH)
		return
	var parsed: Variant = JSON.parse_string(file.get_as_text())
	if parsed is Dictionary:
		_entries = parsed


func path_for(asset_id: StringName) -> String:
	var entry: Dictionary = _entries.get(String(asset_id), {})
	var hd_path := String(entry.get("hd", ""))
	if not hd_path.is_empty() and ResourceLoader.exists(hd_path):
		return hd_path
	var legacy_path := String(entry.get("legacy", ""))
	return legacy_path if ResourceLoader.exists(legacy_path) else ""


func load_asset(asset_id: StringName) -> Resource:
	var path := path_for(asset_id)
	return load(path) if not path.is_empty() else null
