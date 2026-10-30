extends SceneTree

const SAFE_AREA_SCRIPT := preload("res://scripts/safe_area_container.gd")


func _init() -> void:
	_test_safe_area("iPhone 12", Vector2(2532, 1170), Rect2i(132, 0, 2268, 1107), Vector4(44, 0, 44, 21))
	_test_safe_area("iPhone 14 Pro", Vector2(2556, 1179), Rect2i(177, 0, 2202, 1116), Vector4(58, 0, 58, 21))
	_test_safe_area("iPhone 16 Pro Max", Vector2(2868, 1320), Rect2i(186, 0, 2496, 1257), Vector4(55, 0, 55, 19))
	print("STAGE4_TESTS_OK")
	quit(OK)


func _test_safe_area(label: String, window: Vector2, safe: Rect2i, expected: Vector4) -> void:
	var viewport := Vector2(844, 390)
	var actual: Vector4 = SAFE_AREA_SCRIPT.calculate_margins(safe, window, viewport)
	for index in 4:
		if absf(actual[index] - expected[index]) > 1.1:
			push_error("%s safe-area mismatch: %s != %s" % [label, actual, expected])
			quit(ERR_INVALID_DATA)
