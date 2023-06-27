package com.vapor.eduapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SentenceClassApplication extends Application {

    Stage stage = new Stage();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SentenceClassApplication.class.getResource("SentenceClass.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("三种从句");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public void showWindow() throws IOException {
        start(stage);
    }
}
