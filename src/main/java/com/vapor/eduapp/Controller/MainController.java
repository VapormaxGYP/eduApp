package com.vapor.eduapp.Controller;

import com.vapor.eduapp.MainApplication;
import com.vapor.eduapp.SentenceClassApplication;
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
        SentenceClassApplication sentenceClassApplication = new SentenceClassApplication();
        sentenceClassApplication.showWindow();
    }

    @FXML
    public void exitSystem(){
        System.exit(0);
    }


}