## User Information Application
================================
### By: يوسف النحاس
#### ID: 2400468
========================================
📝 Description

This JavaFX application allows users to input and display their personal information in a clean, modern interface. The program collects:

Name

Age

Height (cm)

Weight (kg)

Data is displayed in a formatted pop-up when submitted.

🎨 Design Features

✔ Modern UI matching reference image✔ Arabic/English support✔ Responsive layout✔ Blue-themed button with hover effects✔ Consistent typography (Arial font)

🛠 Technical Details

Built with: Java 8 + JavaFX

Dependencies: javax.swing.JOptionPane for pop-ups

Class Structure:

Main class: UserInfoGUI

UI components: TextField, Button, VBox, GridPane

🚀 How to Run

Ensure Java 8+ is installed

Compile and execute:

javac --module-path [path-to-javafx] --add-modules javafx.controls UserInfoGUI.java
java --module-path [path-to-javafx] --add-modules javafx.controls UserInfoGUI

Replace [path-to-javafx] with your JavaFX SDK lib path

📜 Code Highlights

// Arabic UI Elements
Text logoText = new Text("يوسف النحاس");
logoText.setFont(Font.font("Arial", FontWeight.BOLD, 24));

// Formatted Output
String message = "-------------------------\n" +
                "الاسم: " + nameField.getText() + "\n" +
                "العمر: " + ageField.getText() + " سنة\n" +
                "-------------------------";

📧 Contact

Developer: يوسف النحاسID: 2400468For educational purposes only

Designed with attention to detail ✨

