# 解析结果目录

本目录保存阶段二、三的分析结果。原始安装包仍在仓库根目录，文件名为：

`java游戏亚瑟王朝之帝国崛起_大屏通用版(240x320).jar`

## 文件说明

| 路径 | 内容 |
| --- | --- |
| `stage-2-3-report.md` | 安装包、代码结构、资源统计、运行结果和后续可行性评估 |
| `stage-4-report.md` | Godot 4 工程、iPhone 横屏适配及自动化验收结果 |
| `behavior-baseline.md` | 已验证的启动、菜单、首关和原版操作基准 |
| `artifacts/decompiled/` | CFR 反编译得到的 Java 源码，仅用于分析原版行为 |
| `artifacts/extracted/` | 从 JAR 解出的 class、PNG、sprite、MIDI 和关卡数据 |
| `artifacts/png-dimensions.csv` | 每张 PNG 的文件路径、宽度、高度和通道信息 |
| `artifacts/freej2me-boot.png` | 原版启动/声音询问截图 |
| `artifacts/freej2me-menu.png` | 进入“新的征程”后的主菜单截图 |
| `artifacts/freej2me-newgame-next.png` | 首关地图和开场对话截图 |

## 如何查看

在仓库目录执行：

```bash
cd /workspace/yswc-dgwm
find analysis/artifacts/extracted -type f | sort
less analysis/stage-2-3-report.md
less analysis/behavior-baseline.md
```

查看某个精灵图或原始图片可以直接打开 `analysis/artifacts/extracted/` 下的 PNG。需要注意，很多 PNG 是单帧或精灵表，必须结合同名 `.sprite` 文件解释；它们不是独立的完整角色图。

反编译源码的入口通常从这些文件开始：

- `decompiled/GameMidlet.java`：应用生命周期。
- `decompiled/p.java`：Canvas、输入、游戏循环和 RMS 存档。
- `decompiled/e.java`：地图、战役、单位、任务和剧情主逻辑。
- `decompiled/a.java`：战斗场景。
- `decompiled/f.java`：菜单、对话框和 UI。
- `decompiled/i.java`、`j.java`、`l.java`：精灵和图片组合方式。
- `decompiled/c.java`：中文语言和剧情字符串。

`analysis/artifacts/decompiled/` 是自动反编译结果，变量名仍然经过混淆，不能当作原作者源码直接编译；后续移植会以它和运行行为基准为参考，重新组织成现代工程。
