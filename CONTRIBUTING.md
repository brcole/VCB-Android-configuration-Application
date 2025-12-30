# Contributing to VCB Android Configuration Application

This guide explains how to add your code to this repository, whether you're making your initial code contribution or ongoing development.

## Initial Code Commit

If you're adding code to this repository for the first time, follow these steps:

### 1. Clone the Repository

```bash
git clone https://github.com/brcole/VCB-Android-configuration-Application.git
cd VCB-Android-configuration-Application
```

### 2. Create a New Branch

Always create a new branch for your work:

```bash
git checkout -b feature/your-feature-name
# or
git checkout -b initial-android-app
```

### 3. Add Your Android Project Files

For an Android application, you'll typically want to add:

```
VCB-Android-configuration-Application/
├── app/                    # Main application module
├── gradle/                 # Gradle wrapper files
├── .gitignore             # Git ignore file
├── build.gradle           # Root build configuration
├── settings.gradle        # Project settings
├── gradlew                # Gradle wrapper script (Unix)
├── gradlew.bat            # Gradle wrapper script (Windows)
└── README.md              # Updated with build instructions
```

### 4. Copy Your Code

Copy your Android project files to the repository:

```bash
# Example: copying from another location
cp -r /path/to/your/android/project/* .
```

### 5. Update .gitignore

Ensure you have a proper `.gitignore` file for Android projects to avoid committing build artifacts:

```gitignore
# Android Studio
*.iml
.gradle
.idea/
local.properties

# Build outputs
/build
/app/build
/captures
.externalNativeBuild
.cxx

# Android
*.apk
*.ap_
*.aab
*.dex

# Keystore files
*.jks
*.keystore
```

### 6. Review Your Changes

Check what files will be added:

```bash
git status
git diff
```

### 7. Stage Your Changes

Add the files you want to commit:

```bash
# Add all new files
git add .

# Or add specific files/directories
git add app/ gradle/ build.gradle settings.gradle gradlew
```

### 8. Commit Your Changes

Write a clear, descriptive commit message:

```bash
git commit -m "Initial Android project setup

- Add Android application structure
- Configure Gradle build system
- Set up project dependencies
- Add initial UI components"
```

### 9. Push Your Changes

Push your branch to GitHub:

```bash
git push -u origin feature/your-feature-name
```

### 10. Create a Pull Request

1. Go to the repository on GitHub
2. Click "Compare & pull request"
3. Add a description of your changes
4. Submit the pull request for review

## Ongoing Development

For subsequent contributions:

1. **Update your local repository:**
   ```bash
   git checkout main
   git pull origin main
   ```

2. **Create a new feature branch:**
   ```bash
   git checkout -b feature/new-feature
   ```

3. **Make your changes and commit:**
   ```bash
   git add .
   git commit -m "Descriptive commit message"
   ```

4. **Push and create a pull request:**
   ```bash
   git push -u origin feature/new-feature
   ```

## Best Practices

### Commit Messages
- Use clear, descriptive messages
- Start with a verb (Add, Update, Fix, Remove)
- Keep the first line under 50 characters
- Add detailed description if needed

### Code Organization
- Follow Android development best practices
- Organize code by feature or layer
- Keep classes focused and single-purpose
- Use meaningful variable and method names

### Testing
- Add unit tests for business logic
- Include instrumentation tests for UI components
- Ensure all tests pass before committing

### Documentation
- Update README.md with build instructions
- Document API endpoints and data models
- Add inline comments for complex logic
- Keep documentation up to date

## Android Project Setup

### Prerequisites
- Android Studio (latest stable version)
- JDK 8 or higher
- Android SDK (API level as per project requirements)

### Building the Project
```bash
# Using Gradle wrapper
./gradlew build

# Running tests
./gradlew test

# Creating a debug APK
./gradlew assembleDebug
```

### IDE Setup
1. Open Android Studio
2. Select "Open an Existing Project"
3. Navigate to the repository directory
4. Let Android Studio sync Gradle
5. Run the app on an emulator or device

## Getting Help

If you have questions or need help:
- Open an issue on GitHub
- Check existing issues and documentation
- Review Android development documentation

## Code Review Process

All code changes should be submitted via pull request:
1. Ensure code follows project conventions
2. All tests must pass
3. Update documentation as needed
4. Respond to review comments
5. Squash commits if requested

Thank you for contributing to the VCB Android Configuration Application!
