# JavaFX Menu Application

## Overview
This is a simple JavaFX desktop app I built using Maven in VS Code for a class assignment. The goal was to create a menu-driven interface that actually does a few useful (and slightly fun) things like showing the time, saving logs, and changing the background color.

It started as a “why is JavaFX not working” situation and slowly turned into a fully working application, which honestly felt pretty satisfying once everything finally ran correctly.

---

## What the App Does

The app has a top menu bar with four options:

### 🕒 Show Date and Time
Displays the current date and time in the text box. Basically a built-in timestamp button.

### 💾 Save to log.txt
Takes whatever is in the text area and saves it into a file called `log.txt`. If you keep clicking it, it keeps adding to the file.

### 🌿 Random Green Hue
This was the most interesting requirement. The app generates one random green shade when it starts, and that same color is used for the whole session. Restart the app and you get a new green vibe.

### 🚪 Exit
Closes the application.

---

## Tech Stack
- Java
- JavaFX
- Maven
- VS Code

---

## Project Structure
