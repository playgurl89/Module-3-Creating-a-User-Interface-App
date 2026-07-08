package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class App extends Application {

    private TextArea textArea = new TextArea();
    private BorderPane root = new BorderPane();

    // Generate one random green hue for the entire execution of the program.
    // Hue values between 90° and 150° stay within the green color family.
    private final double hue = 90 + new Random().nextDouble() * 60;
    private final Color greenColor = Color.hsb(hue, 1.0, 1.0);

    @Override
    public void start(Stage stage) {

        // Menu
        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Options");

        MenuItem showDateTime = new MenuItem("Show Date/Time");
        MenuItem saveToFile = new MenuItem("Save to log.txt");
        MenuItem changeColor = new MenuItem("Random Green Hue");
        MenuItem exit = new MenuItem("Exit");

        menu.getItems().addAll(showDateTime, saveToFile, changeColor, exit);
        menuBar.getMenus().add(menu);

        // Layout
        VBox top = new VBox(menuBar);
        root.setTop(top);
        root.setCenter(textArea);

        // Let the frame background show through
        BorderPane.setMargin(textArea, new Insets(15));
        textArea.setStyle(
                "-fx-background-color: transparent; " +
                "-fx-control-inner-background: transparent;"
        );

        // 1. Show Date/Time
        showDateTime.setOnAction(e ->
                textArea.appendText(LocalDateTime.now() + "\n")
        );

        // 2. Save to file
        saveToFile.setOnAction(e -> {
            try (FileWriter writer = new FileWriter("log.txt")) {
                writer.write(textArea.getText());
            } catch (IOException ex) {
                textArea.appendText("Error writing file\n");
            }
        });

        // 3. Apply the randomly generated green hue.
        // The same green hue is used every time during this execution.
        changeColor.setOnAction(e ->
                root.setBackground(
                        new Background(
                                new BackgroundFill(
                                        greenColor,
                                        CornerRadii.EMPTY,
                                        Insets.EMPTY
                                )
                        )
                )
        );

        // 4. Exit
        exit.setOnAction(e -> stage.close());

        // Scene
        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("User Interface App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
