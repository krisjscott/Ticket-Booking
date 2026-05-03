# 🎟️ Ticket Booking System

A command-line ticket booking system built with **Java** and **Gradle**, structured as a multi-module project for clean separation of concerns.

---

## 📁 Project Structure

```
Ticket-Booking/
├── app/          # Main application entry point
├── list/         # Ticket listing and display logic
├── utilities/    # Shared helper/utility classes
├── buildSrc/     # Gradle build configuration and dependency management
├── settings.gradle
├── gradle.properties
└── gradlew / gradlew.bat
```

---

## ✨ Features

- Browse and list available tickets
- Book tickets through a simple interface
- Modular architecture separating app logic, listing, and utilities
- Built with Gradle for easy dependency management and builds

---

## 🛠️ Prerequisites

- **Java** 11 or higher
- **Gradle** (or use the included Gradle wrapper — no installation needed)

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/krisjscott/Ticket-Booking.git
cd Ticket-Booking
```

### 2. Build the project

```bash
# On macOS/Linux
./gradlew build

# On Windows
gradlew.bat build
```

### 3. Run the application

```bash
./gradlew :app:run

or

Just set the App as the main file for project from Project Structure
```

---

## 🧱 Modules

| Module | Description |
|---|---|
| `app` | Main application module — entry point and core booking flow |
| `list` | Handles listing and displaying available tickets |
| `utilities` | Shared utility classes used across modules |
| `buildSrc` | Centralized Gradle build logic and version management |

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository, make your changes, and open a pull request.

1. Fork the project
2. Create your feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m 'Add your feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request

---

## 📄 License

This project is open source. Feel free to use and modify it.

---

## 👤 Author

**Krish Kumar** — [GitHub Profile](https://github.com/krisjscott)

---

## 🗂️ System Design — Low Level Design (LLD)

The diagram below outlines the LLD for this project, including functional requirements, entity models, service layer, and app flow.

![Ticket Booking System LLD]<img width="1000" height="2540" alt="lld-whiteboard" src="https://github.com/user-attachments/assets/32d4bf7f-af54-494c-a8fa-59b5c38c736e" />

