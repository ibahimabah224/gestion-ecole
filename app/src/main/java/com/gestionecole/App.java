package com.gestionecole;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
     @Override
    public void start(Stage stage) {
        Label label = new Label("Bonjour JavaFX !");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.setTitle("Demo JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
