package com.vapor.eduapp.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.vapor.eduapp.MainApplication;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXDrawer;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class SentenceClassController implements Initializable {

    @FXML
    private JFXDrawer menuDrawer;

    @FXML
    private JFXDrawer contentDrawer, contentDrawer1,
            contentDrawer2, contentDrawer3,
            contentDrawer4, contentDrawer5,
            showDrawer;

    @FXML
    private ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5,
                      showView;

    @FXML
    private HBox contentHbox, contentHbox1, contentHbox2, contentHbox3, contentHbox4, contentHbox5;

    @FXML
    private JFXHamburger menuHam1;

    @FXML
    private VBox menuBox, contentVbox, contentVbox1, contentVbox2, contentVbox3, contentVbox4, contentVbox5;

    @FXML
    private JFXButton adjBtn, nonsBtn, advBtn,
            adjGwAnsBtn,
            adjType1, adjType2,
            guidWordBtn,
            classicStructBtn, withPrepBtn, whoseBtn, tharOrWhoBtn, asBtn, butBtn,
            prepPage1Btn, prepPage2Btn, prepPage3Btn,
            whosePageBtn1, whosePageBtn2,
            thatWhoPageBtn1,thatWhoPageBtn2;

    @FXML
    private Label gwAns;

    @FXML
    private TabPane adjTabPane, nonsTabPane, advTabPane;

    HamburgerBackArrowBasicTransition arrowBasicTransition;

    List<JFXDrawer> drawers = new ArrayList<>();

    Image prepImage1, prepImage2, prepImage3,
            whoseImage1, whoseImage2,
            twImage1, twImage2, twImage3,
            defAdjImage, infAdjImage, guideImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        prepImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/withPrep.png")).toString());
        prepImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/withPrep2.png")).toString());
        prepImage3 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/withPrep3.png")).toString());

        whoseImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/whose1.png")).toString());
        whoseImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/whose2.png")).toString());

        twImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/thatOrWho.png")).toString());
        twImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/thatOrWho2.png")).toString());
        twImage3 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/thatOrWho3.png")).toString());

        defAdjImage = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/def.png")).toString());
        infAdjImage = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/inf.png")).toString());
        guideImage = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/guideWords.png")).toString());

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

        showDrawer.setSidePane(showView);
        showDrawer.close();

        drawers.add(contentDrawer);
        drawers.add(contentDrawer1);
        drawers.add(contentDrawer2);
        drawers.add(contentDrawer3);
        drawers.add(contentDrawer4);
        drawers.add(contentDrawer5);

        for(JFXDrawer drawer : drawers){
            drawer.close();
            drawer.setVisible(false);
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
    public void showDef() {

        showView.setImage(defAdjImage);

        if(showDrawer.isOpened()){
            showDrawer.close();
        }
        else{
            showDrawer.open();
        }
    }

    @FXML
    public void showGwAns(){
        gwAns.setText("9个");
    }

    @FXML
    public void showInf(){

        showView.setImage(infAdjImage);

        if(showDrawer.isOpened()){
            showDrawer.close();
        }
        else{
            showDrawer.open();
        }
    }

    @FXML
    public void showGuidWord(){

        showView.setImage(guideImage);

        if(showDrawer.isOpened()){
            showDrawer.close();
        }
        else{
            showDrawer.open();
        }

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

    @FXML
    public void changePrepPage1(){
        imageView1.setImage(prepImage1);
    }
    @FXML
    public void changePrepPage2(){
        imageView1.setImage(prepImage2);
    }

    @FXML
    public void changePrepPage3(){
        imageView1.setImage(prepImage3);
    }

    @FXML
    public void changeWhosePage1(){
        imageView2.setImage(whoseImage1);
    }

    @FXML
    public void changeWhosePage2(){
        imageView2.setImage(whoseImage2);
    }

    @FXML
    public void changeTwPage1(){
        imageView3.setImage(twImage1);
    }

    @FXML
    public void changeTwPage2(){
        imageView3.setImage(twImage2);
    }

    @FXML
    public void changeTwPage3(){
        imageView3.setImage(twImage3);
    }


    public void setDrawer(int index){
        int count = 0;

        while(count < drawers.size()){
            if(count != index){
                drawers.get(count).close();
                drawers.get(count).setVisible(false);
            }
            count++;
        }

        JFXDrawer drawer = drawers.get(index);
        if(drawer.isOpened()){
            drawer.close();
            drawer.setVisible(false);
        }
        else{
            drawer.setVisible(true);
            drawer.open();
        }
    }
}
