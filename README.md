# BinlogReader

一个基于 **Compose Multiplatform** 的桌面端应用，用于**阅读 Binlog（二进制日志）**。
> 当前阶段只聚焦「阅读 / 浏览」，不涉及写入、导出或回放等能力。

---

## 特性（当前阶段）

- 读取并浏览 Binlog 内容（仅阅读）。
- 跨平台桌面 UI（JVM/桌面），专注简洁与可用性。

> 方向尚在探索中，功能会在后续逐步补齐。

---

## 快速开始

### 运行（开发模式）

在项目根目录执行：

- macOS / Linux / Windows
  ```bash
  ./gradlew :composeApp:run
