package com.gestionecole;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // integration de la vue login.fxml
        // Parent root =
        // FXMLLoader.load(getClass().getResource("/view/fxml/login.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/view/fxml/viewDE/dashbord-de.fxml"));
        Scene scene = new Scene(root);
        // Intégration du fichier style.css
        scene.getStylesheets().add(getClass().getResource("/view/css/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("APPLICATION DE GESTION DE MON ECOLE");
        stage.setResizable(false);
        // Plein écran sans masquer la barre des tâches
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(screenBounds.getMinX());
        stage.setY(screenBounds.getMinY());
        stage.setWidth(screenBounds.getWidth());
        stage.setHeight(screenBounds.getHeight());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
