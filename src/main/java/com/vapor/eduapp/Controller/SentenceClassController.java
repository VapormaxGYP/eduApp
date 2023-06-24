package com.vapor.eduapp.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXDrawer;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SentenceClassController implements Initializable {

    @FXML
    private JFXDrawer menuDrawer;

    @FXML
    private JFXDrawer contentDrawer, contentDrawer1, contentDrawer2, contentDrawer3, contentDrawer4, contentDrawer5;

    @FXML
    private ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5;

    @FXML
    private JFXHamburger menuHam1;

    @FXML
    private VBox menuBox, contentVbox, contentVbox1, contentVbox2, contentVbox3, contentVbox4, contentVbox5;

    @FXML
    private JFXButton adjBtn, nonsBtn, advBtn, classicStructBtn, withPrepBtn, whoseBtn, tharOrWhoBtn, asBtn, butBtn;

    @FXML
    private TabPane adjTabPane, nonsTabPane, advTabPane;

    HamburgerBackArrowBasicTransition arrowBasicTransition;

    List<JFXDrawer> drawers = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        adjTabPane.setVisible(false);
        advTabPane.setVisible(false);
        nonsTabPane.setVisible(false);

        menuDrawer.setSidePane(menuBox);
        contentDrawer.setSidePane(contentVbox);
        contentDrawer1.setSidePane(contentVbox1);
        contentDrawer2.setSidePane(contentVbox2);
        contentDrawer3.setSidePane(contentVbox3);
        contentDrawer4.setSidePane(contentVbox4);
        contentDrawer5.setSidePane(contentVbox5);

        drawers.add(contentDrawer);
        drawers.add(contentDrawer1);
        drawers.add(contentDrawer2);
        drawers.add(contentDrawer3);
        drawers.add(contentDrawer4);
        drawers.add(contentDrawer5);

        for(JFXDrawer drawer : drawers){
            drawer.close();
        }

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

    @FXML
    public void showClassic(){
        setDrawer(0);
    }

    @FXML
    public void clickWithPrepBtn(){
        setDrawer(1);
    }

    @FXML
    public void clickWhoseBtn(){
        setDrawer(2);
    }

    @FXML
    public void clickThatOrWhoBtn(){
        setDrawer(3);
    }

    @FXML
    public void clickAsBtn(){
        setDrawer(4);
    }

    @FXML
    public void clickButBtn(){
        setDrawer(5);
    }

    public void setDrawer(int index){
        int count = 0;

        while(count < drawers.size()){
            if(count != index){
                drawers.get(count).close();
            }
            count++;
        }

        JFXDrawer drawer = drawers.get(index);
        if(drawer.isOpened()){
            drawer.close();
        }
        else{
            drawer.open();
        }
    }
}
