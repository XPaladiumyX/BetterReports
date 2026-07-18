# BetterReports - Unofficial Fork

> **This is NOT the official BetterReports plugin.** This is an unofficial fork that has been updated, fixed, and adapted for **SkyXNetwork** servers running **Paper 26.1.2** (Minecraft 26.1).
>
> Original plugin by [Timmy109](https://github.com/AusTechDev/BetterReports) — licensed under MIT.

## About

BetterReports is a lightweight Minecraft plugin that uses Discord webhooks for player and bug reports. This fork was created to fix compatibility issues with modern Paper versions (26.1+) and ensure everything runs correctly on SkyXNetwork's infrastructure.

## What Changed (vs. Original)

- **Paper 26.1.2 support** — Fixed crashes and API incompatibilities with Minecraft 26.1's new versioning scheme
- **Java 25 compatibility** — Updated build tooling (Gradle 9.3.1, Shadow 9.4.3) to compile against Java 25
- **New materials** — Added 60+ new 1.21+ materials to XMaterial (Trial Spawner, Vault, Mace, Copper variants, etc.)
- **Fixed XMaterial version parsing** — The version regex now correctly handles both old (`1.X.Y`) and new (`X.Y`) Bukkit version formats
- **Fixed deprecated API usage** — Replaced removed classes (`Potion`, `SpawnEggMeta`, `Enchantment.LUCK`) with modern equivalents
- **Updated dependencies** — Switched from Spigot 1.12 API to Paper 26.1.2 API

## Installation

1. Download `BetterReports-2.0.8.jar` from the `build/libs/` directory
2. Place the JAR in your server's `plugins/` folder
3. Restart your server
4. Configure the plugin via `plugins/BetterReports/config.yml`

## Requirements

- **Server software:** Paper 26.1.2 (or compatible)
- **Minecraft version:** 26.1
- **Java version:** 25+

## Building from Source

```bash
./gradlew clean build
```

The compiled JAR will be in `build/libs/BetterReports-2.0.8.jar`.

## License

BetterReports is licensed under the MIT license. See [LICENSE](LICENSE.md) for details.
