package com.CodeLab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CodeLabApp extends Application {

    @Override
    public void start(Stage stage) {
        // Left side: The JavaScript learning area
        VBox jsArea = new VBox(new Label("JavaScript Editor (Primary Learning)"));
        jsArea.setStyle("-fx-background-color: #1e1e1e; -fx-padding: 20;");

        // Right side: The comparison area (Python/C/Java)
        VBox compareArea = new VBox(new Label("Cross-Language Comparison"));
        compareArea.setStyle("-fx-background-color: #252526; -fx-padding: 20;");

        // SplitPane allows the user to see them side-by-side
        SplitPane splitPane = new SplitPane(jsArea, compareArea);
        splitPane.setDividerPositions(0.5);

        Scene scene = new Scene(splitPane, 900, 600);
        stage.setTitle("CodeLab - Interactive Fundamentals");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}