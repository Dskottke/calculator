package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //der FXMLLoader lädt die FXML Datei
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //die scene wird mit dem root element aus der FXML Datei erstellt
        Scene scene = new Scene(fxmlLoader.load());
        //die Stage wird mit der Scene und dem Titel erstellt
        stage.setTitle("calculator");
        //die Stage wird mit der Scene und dem Titel erstellt
        stage.setScene(scene);
        //die Stage wird angezeigt
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}