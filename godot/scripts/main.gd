extends Node

@onready var status: Label = $UILayer/SafeArea/PageMargin/Page/Header/TitleGroup/Status
@onready var continue_button: Button = $UILayer/SafeArea/PageMargin/Page/Header/Continue


func _ready() -> void:
	continue_button.pressed.connect(_confirm)
	InputRouter.action_pressed.connect(_on_action_pressed)
	var reference_size := Vector2i(
			ProjectSettings.get_setting("display/window/size/viewport_width"),
			ProjectSettings.get_setting("display/window/size/viewport_height")
		)
	var window_size := DisplayServer.window_get_size()
	if window_size == Vector2i.ZERO:
		print("STAGE4_READY display=headless reference=", reference_size)
	else:
		print(
			"STAGE4_READY viewport=", get_viewport().get_visible_rect().size,
			" window=", window_size,
			" reference=", reference_size
		)


func _on_action_pressed(action: StringName) -> void:
	if action == &"confirm":
		_confirm()


func _confirm() -> void:
	status.text = "输入路由正常 · 可以接入原始游戏场景"
	AudioService.play_ui_confirm()
	SaveService.set_setting(&"stage4_smoke_test", true)
