class_name SafeAreaContainer
extends MarginContainer

## Converts the device safe rectangle (screen pixels) into the logical Godot
## canvas. Only UI is inset; world and background layers remain edge-to-edge.


func _ready() -> void:
	_apply_device_safe_area()
	get_viewport().size_changed.connect(_apply_device_safe_area)


func _apply_device_safe_area() -> void:
	var viewport_size := get_viewport().get_visible_rect().size
	var window_size := Vector2(DisplayServer.window_get_size())
	var safe_rect := DisplayServer.get_display_safe_area()
	set_safe_area(safe_rect, window_size, viewport_size)


func set_safe_area(safe_rect: Rect2i, window_size: Vector2, viewport_size: Vector2) -> void:
	var margins := calculate_margins(safe_rect, window_size, viewport_size)
	add_theme_constant_override("margin_left", roundi(margins.x))
	add_theme_constant_override("margin_top", roundi(margins.y))
	add_theme_constant_override("margin_right", roundi(margins.z))
	add_theme_constant_override("margin_bottom", roundi(margins.w))


static func calculate_margins(
	safe_rect: Rect2i,
	window_size: Vector2,
	viewport_size: Vector2
) -> Vector4:
	if safe_rect.size.x <= 0 or safe_rect.size.y <= 0:
		return Vector4.ZERO
	if window_size.x <= 0.0 or window_size.y <= 0.0:
		return Vector4.ZERO
	var scale := Vector2(viewport_size.x / window_size.x, viewport_size.y / window_size.y)
	var left := maxf(0.0, safe_rect.position.x * scale.x)
	var top := maxf(0.0, safe_rect.position.y * scale.y)
	var right := maxf(0.0, (window_size.x - safe_rect.end.x) * scale.x)
	var bottom := maxf(0.0, (window_size.y - safe_rect.end.y) * scale.y)
	return Vector4(left, top, right, bottom)
