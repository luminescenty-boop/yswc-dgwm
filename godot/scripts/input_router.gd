extends Node

signal action_pressed(action: StringName)
signal pointer_moved(position: Vector2)


func _unhandled_input(event: InputEvent) -> void:
	if event is InputEventScreenTouch and event.pressed:
		action_pressed.emit(&"confirm")
	elif event is InputEventMouseButton and event.button_index == MOUSE_BUTTON_LEFT and event.pressed:
		action_pressed.emit(&"confirm")
	elif event.is_action_pressed(&"ui_accept"):
		action_pressed.emit(&"confirm")
	elif event is InputEventScreenDrag:
		pointer_moved.emit(event.position)
	elif event is InputEventMouseMotion:
		pointer_moved.emit(event.position)
