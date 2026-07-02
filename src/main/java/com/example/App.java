package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

public class App extends Application {

    private TextArea textArea = new TextArea();
    private BorderPane root = new BorderPane();
    // The initial random green hue (green channel 100-255), generated once per
    // program execution and reused on every selection of the menu option.
    private final int greenHue = 100 + new Random().nextInt(156);

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

        // Let the frame (root) background show through the text box, inset a little,
        // so the green hue is actually visible when the option is selected.
        BorderPane.setMargin(textArea, new Insets(15));
        textArea.setStyle("-fx-background-color: transparent; -fx-control-inner-background: transparent;");

        // 1. Show Date/Time
        showDateTime.setOnAction(e -> {
            textArea.appendText(LocalDateTime.now().toString() + "\n");
        });

        // 2. Save to file
        saveToFile.setOnAction(e -> {
            try (FileWriter writer = new FileWriter("log.txt")) {
                writer.write(textArea.getText());
            } catch (IOException ex) {
                textArea.appendText("Error writing file\n");
            }
        });

        // 3. Apply the initial random green hue to the frame background.
        //    The hue is fixed for this execution, so every selection shows the same green.
        changeColor.setOnAction(e -> {
            root.setStyle("-fx-background-color: rgb(0," + greenHue + ",0);");
        });

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
