# JavaFX Menu Application

A JavaFX desktop application built with Maven that demonstrates graphical user interface development, event-driven programming, file output, and interactive application controls.

## Overview

This project was developed for CSC372-1 Programming II to practice building a desktop application with JavaFX.

The application uses a menu-driven interface to provide several interactive functions, including displaying the current date and time, saving text to a log file, generating a random green background color, and exiting the application.

## Features

### Date & Time

Displays the current date and time in the application's text area.

### Save to Log

Saves the contents of the text area to `log.txt`.

The application appends new entries to the existing log rather than replacing previous entries.

### Random Green Background

Generates a random green color when the application starts and applies that color throughout the current session.

Each time the application is restarted, a new green shade is generated.

### Exit

Closes the application.

## User Interface

The application uses a menu bar to organize the available functions:

- Show Date and Time
- Save to `log.txt`
- Random Green Hue
- Exit

The menu-driven design provides a simple interface for interacting with the application's features.

## Technologies & Concepts

- Java
- JavaFX
- Maven
- Event-Driven Programming
- Graphical User Interface Development
- Menu Controls
- Event Handling
- File Output
- Text Areas
- Random Value Generation
- Git & GitHub

## Project Structure

The project follows a Maven-based structure.

```text
src/
└── main/
    └── java/
        └── com/
            └── example/
                └── App.java

pom.xml
log.txt
README.md
```

The `App.java` file contains the main JavaFX application, while `pom.xml` manages the Maven project configuration and JavaFX dependencies.
## How It Works

When the application launches, it creates the graphical user interface and generates a random green background color.

Users can then interact with the menu bar to perform different actions.

### Show Date and Time

The application retrieves and displays the current date and time.

### Save to Log

The contents of the text area are written to `log.txt`. Additional saves are appended to the existing file.

### Random Green Hue

A green color is generated when the application starts and remains consistent throughout that session.

### Exit

The application closes when the Exit option is selected.

## How to Run

This project requires a Java Development Kit and JavaFX.

Maven is used to manage the project configuration and dependencies.

From the project directory, run:

```bash
mvn clean javafx:run
```

If your local Java or JavaFX configuration differs from the project configuration, verify the Java and JavaFX settings in `pom.xml`.

## Development & Version Control

Git and GitHub were used throughout development to track changes and manage the project source code.

The application was developed incrementally while troubleshooting JavaFX configuration, user interface behavior, and application functionality.

## What I Learned

This project provided hands-on experience developing a desktop graphical user interface with JavaFX.

Key areas of learning included:

- Building a JavaFX application
- Creating and organizing GUI components
- Working with menu-driven interfaces
- Using event handlers to respond to user actions
- Writing application data to a file
- Managing dependencies with Maven
- Generating and working with random values
- Troubleshooting JavaFX configuration and application behavior
- Using Git and GitHub for version control

## Future Improvements

Potential future enhancements include:

- Adding additional menu options
- Improving the application's visual design
- Adding user-configurable background colors
- Adding timestamps automatically to log entries
- Providing a clear or reset function
- Adding additional file management functionality
- Improving error handling and user feedback

## Academic Context

Developed as a project for CSC372-1 Programming II through Colorado State University Online.

## Author

**Samantha Widell**

**Bachelor of Science in Computer Science**  
Colorado State University Online

Expected Graduation: 2028
