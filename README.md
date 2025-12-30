# VCB-Android-configuration-Application

Maxton Valve application for configuring the 185 controller.

## Overview

This Android application provides a user interface for configuring and managing Maxton Valve 185 controllers. The application allows users to connect to the controller and adjust its settings via a mobile device.

## Getting Started

### For First-Time Contributors

If you're looking to add your code to this repository for the first time, please read our comprehensive [CONTRIBUTING.md](CONTRIBUTING.md) guide. It includes:

- Step-by-step instructions for adding your initial code
- Git workflow best practices
- Android project setup guidelines
- Code organization and standards

### Quick Start for Adding Code

1. **Clone the repository:**
   ```bash
   git clone https://github.com/brcole/VCB-Android-configuration-Application.git
   cd VCB-Android-configuration-Application
   ```

2. **Create a feature branch:**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Add your code:**
   - Copy your Android project files to the repository
   - Ensure you have a proper `.gitignore` file (already provided)
   - Review the changes with `git status`

4. **Commit your changes:**
   ```bash
   git add .
   git commit -m "Initial Android project setup"
   ```

5. **Push and create a pull request:**
   ```bash
   git push -u origin feature/your-feature-name
   ```

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed instructions.

## Prerequisites

- Android Studio (latest stable version recommended)
- JDK 8 or higher
- Android SDK (minimum API level to be determined based on project requirements)
- Git

## Building the Project

Once the Android project is added:

```bash
# Build the project
./gradlew build

# Run tests
./gradlew test

# Create a debug APK
./gradlew assembleDebug
```

## Project Structure

```
VCB-Android-configuration-Application/
├── app/                    # Main application module (to be added)
├── gradle/                 # Gradle wrapper files (to be added)
├── .gitignore             # Android-specific git ignore rules
├── build.gradle           # Root build configuration (to be added)
├── settings.gradle        # Project settings (to be added)
├── CONTRIBUTING.md        # Contribution guidelines
├── LICENSE                # Project license
└── README.md              # This file
```

## Contributing

We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines on how to contribute to this project.

## License

This project is licensed under the terms specified in the [LICENSE](LICENSE) file.

## Support

For questions, issues, or suggestions:
- Open an issue on GitHub
- Review the [CONTRIBUTING.md](CONTRIBUTING.md) guide
- Check existing issues and discussions

## About

This application is designed to work with Maxton Valve's 185 controller, providing a convenient mobile interface for configuration and management tasks.
