package com.vapor.eduapp.Controller;

import com.vapor.eduapp.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainController {

    @FXML
    Button buttonEnter, exitButton;

    @FXML
    public void enterLearn() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(MainApplication.class.getResource("SentenceClass.fxml")));

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setFullScreen(true);
        stage.setTitle("三大类限定从属分句");
        stage.show();
    }

    @FXML
    public void exitSystem(){
        System.exit(0);
    }


}