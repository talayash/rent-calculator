package com.example.rentfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RentApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        URL resource = RentApplication.class.getResource("rent.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(resource);


        Scene scene = new Scene(fxmlLoader.load(), 363, 349);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}