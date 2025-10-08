package org.example.veterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar la vista inicial, por ejemplo la de Propietario
//        FXMLLoader scene = new FXMLLoader();
//        scene.setLocation(Main.class.getResource("VeterinariaView.fxml"));
//        Parent root = scene.load();
//
//        primaryStage.setTitle("Sistema de Veterinaria");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // inicia JavaFX
    }
}
