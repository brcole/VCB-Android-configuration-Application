# VCB Android Configuration Application

An Android application for configuring the Maxton Valve 185 controller.

## Project Overview

This is a baseline Android application built with Kotlin and following modern Android development practices. The application provides an interface for configuring VCB (Valve Control Board) devices.

## Requirements

- Android Studio Arctic Fox (2020.3.1) or later
- Android SDK 24 (Lollipop) or higher
- Gradle 8.1.0+
- Kotlin 1.9.0+

## Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/brcole/VCB-Android-configuration-Application.git
   cd VCB-Android-configuration-Application
   ```

2. **Open in Android Studio:**
   - Launch Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned repository and select it

3. **Sync Gradle:**
   - Android Studio should automatically start syncing Gradle
   - If not, click "File" > "Sync Project with Gradle Files"

4. **Build the project:**
   ```bash
   ./gradlew build
   ```

5. **Run the application:**
   - Connect an Android device or start an emulator
   - Click the "Run" button in Android Studio or use:
   ```bash
   ./gradlew installDebug
   ```

## Project Structure

```
VCB-Android-configuration-Application/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/vcb/configuration/
│   │   │   │   └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   ├── values/
│   │   │   │   └── mipmap-*/
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md
```

## Features (Baseline)

- Modern Android architecture with ViewBinding
- Material Design components
- Kotlin-based implementation
- AndroidX support
- Ready for extension and customization

## Development

This is a baseline project ready to be extended with:
- Bluetooth connectivity for device communication
- Configuration UI for valve parameters
- Data persistence and state management
- Additional features as needed

## License

MIT License - see [LICENSE](LICENSE) file for details
