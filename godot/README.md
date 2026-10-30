# 第四阶段：Godot 4 新版工程

工程以 iPhone 12 横屏逻辑尺寸 `844×390` 为参考，使用 Godot 4 的响应式容器和设备安全区域。背景及游戏世界保持全屏，按钮和文字由 `SafeAreaContainer` 自动避开刘海、灵动岛及 Home 指示条。

## 运行与验证

```bash
godot --path godot --editor
godot --headless --path godot --script tests/test_stage4.gd
```

iOS 导出预设已经写入 `export_presets.cfg`，仅启用 ARM64 并强制左右横屏。真正导出 `.ipa` 仍需要 macOS、Xcode、Godot iOS 导出模板和 Apple 开发者签名。

## 工程结构

- `WorldLayer`：地图、角色和战斗画面，可延伸到屏幕边缘。
- `UILayer/SafeArea`：响应式 UI，所有交互元素保持在安全区域内。
- `InputRouter`：统一触摸、鼠标和键盘确认操作。
- `AudioService`：隔离音乐与音效总线。
- `SaveService`：三个存档槽，与旧版 `save0/save1/save2` 对应。
- `SceneService`：统一切换主菜单、地图、战斗和剧情场景。
- `ResourceCatalog`：优先加载高清资源，不存在时自动回退到原图。

## 导入原始资源

仓库中已有解析后的原始资源和五张高清试稿。执行下面的命令会把 PNG、MIDI 和已知高清替换复制到 Godot 工程；Godot 随后会自动生成导入数据：

```bash
godot --headless --path godot --script tools/sync_assets.gd
godot --headless --path godot --editor --quit
```

新增高清图时，在 `assets/asset_manifest.json` 中为同一资源 ID 配置 `legacy` 和 `hd` 路径。游戏代码只通过资源 ID 请求素材，高清图存在时会自动生效。
