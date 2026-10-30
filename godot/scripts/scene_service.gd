extends Node

signal scene_change_started(path: String)
signal scene_change_finished(path: String)


func goto_scene(path: String) -> Error:
	if not ResourceLoader.exists(path, "PackedScene"):
		return ERR_FILE_NOT_FOUND
	scene_change_started.emit(path)
	var error := get_tree().change_scene_to_file(path)
	if error == OK:
		scene_change_finished.emit(path)
	return error
