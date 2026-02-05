module com.CodeLab {
    requires javafx.controls;
    requires javafx.fxml;

    // This allows JavaFX to access your code to draw the window
    opens com.CodeLab to javafx.fxml;

    // This allows other modules to use your code
    exports com.CodeLab;
}