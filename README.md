# Echo Music — Android 6 Port

An independently maintained Android 6 compatibility port of the original Echo Music app.

This repository contains the changes needed to build and run Echo Music on **Android 6.0 (Marshmallow, API 23)** and compatible devices. It is a community port, not the original Echo Music project.

## Credits

| Work | Credit |
|---|---|
| Original Echo Music app, design, features and creative work | [Echo Music team and original contributors](https://github.com/EchoMusicApp/Echo-Music) |
| Android 6 compatibility port, fixes, testing and maintenance | [Naitik Kumar (@kumaranaitik)](https://github.com/kumaranaitik) |

All original project rights and contributions remain with their respective creators. This port does not claim authorship of the original app.

## What this port changes

- Compatibility adjustments for Android 6.0 / API 23.
- Notification handling for Android versions that do not support notification channels.
- Android build and dependency configuration adjustments for legacy devices.
- Fixes and testing focused on app launch and playback on older Android hardware.

## Testing

The port has been tested on a Samsung SM-J700F running Android 6.0.1.

The following core functions were tested:
- App launch.
- Music search and online playback.
- Background playback.
- Playback notification controls.
- Album artwork display.

Results may vary on other devices and Android versions. This is not a guarantee that every original app feature works on every Android 6 device.

## Download

Download Android 6 port builds from this repository's [Releases page](https://github.com/kumaranaitik/Echo-Music-Android6/releases).

Only install APKs published in this repository's releases that you trust.

## Build from source

Clone this port:

```bash
git clone --branch android-6-port https://github.com/kumaranaitik/Echo-Music-Android6.git
cd Echo-Music-Android6
```

Configure your Android SDK path in `local.properties`:

```properties
sdk.dir=/path/to/your/android/sdk
```

For additional setup details, see [SETUP.md](SETUP.md).

## Original project

The original Echo Music project is maintained separately by its original developers:

[EchoMusicApp/Echo-Music](https://github.com/EchoMusicApp/Echo-Music)

This link is provided for attribution and reference only. **Installation instructions and port builds for this repository are available from the Releases page above**, not from the original project's releases.

## Disclaimer

This is an unofficial, independently maintained community port. It is not affiliated with, endorsed by, or an official release of the original Echo Music developers.

The original project's license and applicable third-party licenses continue to apply. See [LICENSE](LICENSE) for this repository's license information.
