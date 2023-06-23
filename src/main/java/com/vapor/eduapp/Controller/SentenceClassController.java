package com.vapor.eduapp.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXDrawer;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SentenceClassController implements Initializable {

    @FXML
    private JFXDrawer menuDrawer;

    @FXML
    private JFXHamburger menuHam1;

    @FXML
    private VBox menuBox;

    @FXML
    private JFXButton adjBtn, nonsBtn, advBtn;


    @FXML
    private TabPane adjTabPane, nonsTabPane, advTabPane;

    HamburgerBackArrowBasicTransition arrowBasicTransition;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        adjTabPane.setVisible(false);
        advTabPane.setVisible(false);
        nonsTabPane.setVisible(false);

        menuDrawer.setSidePane(menuBox);
        arrowBasicTransition = new HamburgerBackArrowBasicTransition(menuHam1);
        arrowBasicTransition.setRate(-1);

        menuHam1.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->{
            arrowBasicTransition.setRate(arrowBasicTransition.getRate() *-1);
            arrowBasicTransition.play();

            if(menuDrawer.isOpened()){
                menuDrawer.close();
            }
            else
                menuDrawer.open();
        });

    }

    @FXML
    public void abjOnClick(){
        adjTabPane.setVisible(true);
        advTabPane.setVisible(false);
        nonsTabPane.setVisible(false);
        System.out.println("adjBtn click");
    }

    @FXML
    public void nonsOnClick(){
        adjTabPane.setVisible(false);
        advTabPane.setVisible(false);
        nonsTabPane.setVisible(true);
        System.out.println("nonsOnClick");
    }

    @FXML
    public void advOnClick(){
        adjTabPane.setVisible(false);
        nonsTabPane.setVisible(false);
        advTabPane.setVisible(true);
        System.out.println("advOnClick");
    }
}
