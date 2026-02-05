# CodeLab

**CodeLab** is a desktop-based interactive application designed to introduce beginning programmers to core programming fundamentals. By focusing on **JavaScript** as the primary instructional language, learners gain industry-relevant skills and the ability to generalize programming concepts to other languages.

## Project Overview
Traditional tutorials often rely on passive instruction. CodeLab differs by providing a **structured, engaging environment** for learning programming concepts and understanding how the same logic is implemented across multiple languages.

### Key Features
* **Interactive Exercises:** Complete guided lessons on variables, conditionals, loops, and functions.
* **Simulated Environment:** View program output and results immediately within the app.
* **Cross-Language Comparison:** A signature feature allowing side-by-side comparison of JavaScript logic with **Python, C, C++, and Java**.
* **Conceptual Explanations:** Highlights both syntactical and logic-based differences to prepare users for a career in programming.

## Tech Stack & Core Tech Choices
* **Language:** Java 17 (LTS) — Chosen for robust desktop performance and modularity.
* **UI Framework:** JavaFX 17.0.10 — Utilized to create a high-fidelity, multi-pane desktop interface.
* **Build System:** Maven — Ensures consistent dependency management and portability.
* **Architecture:** Modular Java (JPMS) — Uses `module-info.java` for strict encapsulation and security.

## Prerequisites
* **Operating System:** macOS (Optimized for 17.0.10 to prevent AppKit reactivation issues), Windows, or Linux.
* **Java Development Kit:** JDK 17.
* **Build Tool:** Maven (integrated in IntelliJ IDEA).

## Build and Run Instructions

### 1. Clone the Repository
### git clone https://github.com/nq-98/CodeLab/
### cd CodeLab

### 2. Maven Configuration
### This project uses Maven for dependency management. To download the required JavaFX 17.0.10 libraries:

### Open the project in IntelliJ IDEA.

### Open the pom.xml file.

### Click the Load Maven Changes icon (the blue refresh icon in the top-right corner) to sync the project.

### 3. Run the Application
### You can run the application directly from your IDE:

### Navigate to src/main/java/com/codelab/CodeLabApp.java.

### Right-click the file and select Run 'CodeLabApp.main()'.
