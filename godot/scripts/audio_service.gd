extends Node

var music_enabled := true
var effects_enabled := true
var _music_player: AudioStreamPlayer
var _effects_player: AudioStreamPlayer


func _ready() -> void:
	_music_player = AudioStreamPlayer.new()
	_music_player.bus = &"Music"
	add_child(_music_player)
	_effects_player = AudioStreamPlayer.new()
	_effects_player.bus = &"Effects"
	add_child(_effects_player)


func play_music(stream: AudioStream, from_position := 0.0) -> void:
	if not music_enabled or stream == null:
		return
	_music_player.stream = stream
	_music_player.play(from_position)


func play_effect(stream: AudioStream) -> void:
	if effects_enabled and stream != null:
		_effects_player.stream = stream
		_effects_player.play()


func play_ui_confirm() -> void:
	# The remastered UI sound is assigned when the audio pass starts.
	pass
