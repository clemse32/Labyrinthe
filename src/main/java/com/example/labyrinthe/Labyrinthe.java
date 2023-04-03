package com.example.labyrinthe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Labyrinthe extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Labyrinthe.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1366, 768);
        stage.getIcons().add(new Image("file:Images/Logo.png"));
        stage.setTitle("Labyrinthe");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}