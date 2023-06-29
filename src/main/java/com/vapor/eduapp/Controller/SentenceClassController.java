package com.vapor.eduapp.Controller;

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
            showDrawer,
            subjectDrawer, objectDrawer, predicativeDrawer, appositiveDrawer;

    @FXML
    private ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5,
                      showView, subjectView, objectView, predicativeView, appositiveView;

    @FXML
    private JFXHamburger menuHam1;

    @FXML
    private VBox menuBox, contentVbox, contentVbox1, contentVbox2, contentVbox3, contentVbox4, contentVbox5,
                 subjectVbox, objectVbox, predicativeVbox, apposiviteVbox;

    @FXML
    private Label gwAns, nonAns;

    @FXML
    private TabPane adjTabPane, nonsTabPane, advTabPane;

    HamburgerBackArrowBasicTransition arrowBasicTransition;

    List<JFXDrawer> adjDrawers = new ArrayList<>();
    List<JFXDrawer> nonDrawers = new ArrayList<>();

    Image prepImage1, prepImage2, prepImage3,
            whoseImage1, whoseImage2,
            twImage1, twImage2, twImage3,
            defAdjImage, infAdjImage, guideImage, vgImage,
            subjectImage1, subjectImage2, subjectImage3,
            objectImage1, objectImage2, objectImage3, objectImage4, objectImage5,
            predicativeImage1, predicativeImage2,
            appositiveImage1, appositiveImage2, appositiveImage3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        prepImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/withPrep.png")).toString());

        whoseImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/whose1.png")).toString());

        twImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/thatOrWho.png")).toString());

        defAdjImage = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/def.png")).toString());
        infAdjImage = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/inf.png")).toString());
        guideImage = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/guideWords.png")).toString());
        vgImage = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/vanguard.png")).toString());

        subjectImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/subject1.png")).toString());

        objectImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/object1.png")).toString());

        predicativeImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/predicative1.png")).toString());

        appositiveImage1 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/appositive1.png")).toString());

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

        subjectDrawer.setSidePane(subjectVbox);
        objectDrawer.setSidePane(objectVbox);
        predicativeDrawer.setSidePane(predicativeVbox);
        appositiveDrawer.setSidePane(apposiviteVbox);

        adjDrawers.add(contentDrawer);
        adjDrawers.add(contentDrawer1);
        adjDrawers.add(contentDrawer2);
        adjDrawers.add(contentDrawer3);
        adjDrawers.add(contentDrawer4);
        adjDrawers.add(contentDrawer5);

        nonDrawers.add(subjectDrawer);
        nonDrawers.add(objectDrawer);
        nonDrawers.add(predicativeDrawer);
        nonDrawers.add(appositiveDrawer);

        for(JFXDrawer drawer : adjDrawers){
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
    public void showVgWords(){
        showView.setImage(vgImage);

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
    public void showNonAns(){
        nonAns.setText("that, which, who, whose, when, where, why");
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
        setDrawer(0, adjDrawers);
    }

    @FXML
    public void clickWithPrepBtn(){
        setDrawer(1, adjDrawers);
    }

    @FXML
    public void clickWhoseBtn(){
        setDrawer(2, adjDrawers);
    }

    @FXML
    public void clickThatOrWhoBtn(){
        setDrawer(3, adjDrawers);
    }

    @FXML
    public void clickAsBtn(){
        setDrawer(4, adjDrawers);
    }

    @FXML
    public void clickButBtn(){
        setDrawer(5, adjDrawers);
    }

    @FXML
    public void changePrepPage1(){
        imageView1.setImage(prepImage1);
    }
    @FXML
    public void changePrepPage2(){
        prepImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/withPrep2.png")).toString());

        imageView1.setImage(prepImage2);
    }

    @FXML
    public void changePrepPage3(){
        prepImage3 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/withPrep3.png")).toString());

        imageView1.setImage(prepImage3);
    }

    @FXML
    public void changeWhosePage1(){
        imageView2.setImage(whoseImage1);
    }

    @FXML
    public void changeWhosePage2(){
        whoseImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/whose2.png")).toString());

        imageView2.setImage(whoseImage2);
    }

    @FXML
    public void changeTwPage1(){
        imageView3.setImage(twImage1);
    }

    @FXML
    public void changeTwPage2(){
        twImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/thatOrWho2.png")).toString());
        imageView3.setImage(twImage2);
    }

    @FXML
    public void changeTwPage3(){
        twImage3 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/adjSenPic/thatOrWho3.png")).toString());
        imageView3.setImage(twImage3);
    }

    @FXML
    public void showSubject(){
        setDrawer(0, nonDrawers);
    }

    @FXML
    public void showObject(){
        setDrawer(1, nonDrawers);
    }

    @FXML
    public void showPredicative(){
        setDrawer(2, nonDrawers);
    }

    @FXML
    public void showAppositive(){
        setDrawer(3, nonDrawers);
    }

    @FXML
    public void changeSubjectPage1(){
        subjectView.setImage(subjectImage1);
    }

    @FXML
    public void changeSubjectPage2(){
        subjectImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/subject2.png")).toString());
        subjectView.setImage(subjectImage2);
    }

    @FXML
    public void changeSubjectPage3(){
        subjectImage3 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/subject3.png")).toString());
        subjectView.setImage(subjectImage3);
    }

    @FXML
    public void changeObjectPage1(){
        objectView.setImage(objectImage1);
    }

    @FXML
    public void changeObjectPage2(){
        objectImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/object2.png")).toString());
        objectView.setImage(objectImage2);
    }

    @FXML
    public void changeObjectPage3(){
        objectImage3 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/object3.png")).toString());
        objectView.setImage(objectImage3);
    }

    @FXML
    public void changeObjectPage4(){
        objectImage4 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/object4.png")).toString());
        objectView.setImage(objectImage4);
    }

    @FXML
    public void changeObjectPage5(){
        objectImage5 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/object5.png")).toString());
        objectView.setImage(objectImage5);
    }

    @FXML
    public void changePredicativePage1(){
        predicativeView.setImage(predicativeImage1);
    }

    @FXML
    public void changePredicativePage2(){
        predicativeImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/predicative2.png")).toString());
        predicativeView.setImage(predicativeImage2);
    }

    @FXML
    public void changeAppositivePage1(){
        appositiveView.setImage(appositiveImage1);
    }

    @FXML
    public void changeAppositivePage2(){
        appositiveImage2 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/appositive2.png")).toString());
        appositiveView.setImage(appositiveImage2);
    }

    @FXML
    public void changeAppositivePage3(){
        appositiveImage3 = new Image(Objects.requireNonNull(MainApplication.class.getResource("/Picture/nonSenPic/appositive3.png")).toString());
        appositiveView.setImage(appositiveImage3);
    }

    public void setDrawer(int index, List<JFXDrawer> drawers){
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
