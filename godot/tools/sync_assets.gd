extends SceneTree

const LEGACY_SOURCE := "../analysis/artifacts/extracted"
const HD_SOURCE := "../analysis/samples/hd-preview"
const HD_MAPPINGS := {
	"logo-gameLogo-hd.png": "logo/gameLogo.png",
	"menu-main-hd.png": "pic/menumain.png",
	"cg3-hd.png": "cg/cg3.png",
	"battle-background-hd.png": "fight/bf_0.png",
	"woods-background-hd.png": "pic/woods_bg.png",
}
var copied := 0


func _init() -> void:
	var project_root := ProjectSettings.globalize_path("res://")
	_sync_tree(project_root.path_join(LEGACY_SOURCE), project_root.path_join("assets/legacy"))
	for source_name: String in HD_MAPPINGS:
		_copy_file(
			project_root.path_join(HD_SOURCE).path_join(source_name),
			project_root.path_join("assets/hd").path_join(HD_MAPPINGS[source_name])
		)
	print("ASSET_SYNC_OK copied=", copied)
	quit(OK)


func _sync_tree(source: String, destination: String) -> void:
	var directory := DirAccess.open(source)
	if directory == null:
		push_error("Asset source is missing: %s" % source)
		return
	for filename in directory.get_files():
		if filename.get_extension().to_lower() in ["png", "mid", "midi"]:
			_copy_file(source.path_join(filename), destination.path_join(filename))
	for child in directory.get_directories():
		_sync_tree(source.path_join(child), destination.path_join(child))


func _copy_file(source: String, destination: String) -> void:
	if not FileAccess.file_exists(source):
		push_warning("Skipping missing asset: %s" % source)
		return
	DirAccess.make_dir_recursive_absolute(destination.get_base_dir())
	var error := DirAccess.copy_absolute(source, destination)
	if error != OK:
		push_error("Could not copy %s (error %d)" % [source, error])
		return
	copied += 1
