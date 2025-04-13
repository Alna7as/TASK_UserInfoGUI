package userinfogui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class UserInfoGUI extends Application {
    
    // تعريف حقول الإدخال كمتغيرات على مستوى الكلاس
    private TextField nameField;
    private TextField ageField;
    private TextField heightField;
    private TextField weightField;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("يوسف النحاس - بيانات المستخدم");

        // Main container with white background
        VBox mainContainer = new VBox(15);
        mainContainer.setAlignment(Pos.TOP_CENTER);
        mainContainer.setPadding(new Insets(40, 50, 30, 50));
        mainContainer.setStyle("-fx-background-color: #ffffff;");

        // Header with logo
        Text logoText = new Text("يوسف النحاس");
        logoText.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        logoText.setFill(Color.web("#333333"));

        // Sign Up title
        Text signUpTitle = new Text("إدخال البيانات");
        signUpTitle.setFont(Font.font("Arial", FontWeight.BOLD, 18));
        signUpTitle.setFill(Color.web("#333333"));

        // Form container
        GridPane formGrid = new GridPane();
        formGrid.setVgap(10);
        formGrid.setHgap(10);
        formGrid.setAlignment(Pos.CENTER);

        // إنشاء حقول الإدخال
        nameField = createTextField("الاسم", "أدخل اسمك");
        ageField = createTextField("العمر", "أدخل عمرك");
        heightField = createTextField("الطول (سم)", "أدخل طولك");
        weightField = createTextField("الوزن (كجم)", "أدخل وزنك");

        formGrid.add(nameField, 0, 0);
        formGrid.add(ageField, 0, 1);
        formGrid.add(heightField, 0, 2);
        formGrid.add(weightField, 0, 3);

        // Horizontal line
        Separator separator = new Separator();
        separator.setPrefWidth(280);
        separator.setStyle("-fx-background-color: #e1e1e1;");

        // Submit button
        Button submitButton = new Button("عرض البيانات");
        submitButton.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        submitButton.setTextFill(Color.WHITE);
        submitButton.setStyle("-fx-background-color: #4285f4; -fx-background-radius: 4;");
        submitButton.setPrefWidth(280);
        submitButton.setPrefHeight(40);

        // Add all components to main container
        mainContainer.getChildren().addAll(
                logoText,
                signUpTitle,
                formGrid,
                separator,
                submitButton
        );

        // Event handler for the button
        submitButton.setOnAction(e -> {
            String message = "-------------------------\n" +
                            "بيانات المستخدم:\n" +
                            "-------------------------\n" +
                            "الاسم: " + nameField.getText() + "\n" +
                            "العمر: " + ageField.getText() + " سنة\n" +
                            "الطول: " + heightField.getText() + " سم\n" +
                            "الوزن: " + weightField.getText() + " كجم\n" +
                            "-------------------------";
            
            JOptionPane.showMessageDialog(null, message, "بيانات المستخدم", JOptionPane.INFORMATION_MESSAGE);
        });

        // Create scene and show stage
        Scene scene = new Scene(mainContainer, 350, 500);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private TextField createTextField(String labelText, String promptText) {
        TextField textField = new TextField();
        textField.setPromptText(promptText);
        textField.setFont(Font.font("Arial", 14));
        textField.setStyle("-fx-background-color: #f9f9f9; -fx-border-color: #dddddd; -fx-border-radius: 4;");
        textField.setPrefHeight(35);
        textField.setPrefWidth(280);
        return textField;
    }

    public static void main(String[] args) {
        launch(args);
    }
}