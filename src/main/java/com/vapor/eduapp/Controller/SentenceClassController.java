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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.net.URISyntaxException;
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
            subjectDrawer, objectDrawer, predicativeDrawer, appositiveDrawer,
            timeDrawer, posDrawer, causeDrawer, resDrawer, aimDrawer, ifDrawer, concessionDrawer, wayDrawer, compareDrawer;

    @FXML
    private ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5,
                      showView, subjectView, objectView, predicativeView, appositiveView,
                      askImageView;

    @FXML
    private JFXHamburger menuHam1;

    @FXML
    private VBox menuBox, contentVbox, contentVbox1, contentVbox2, contentVbox3, contentVbox4, contentVbox5,
                 subjectVbox, objectVbox, predicativeVbox, apposiviteVbox,
                 timeVbox, posVbox, causeVbox, resVbox, aimVbox, ifVbox, concessionVbox, wayVbox, compareVbox;

    @FXML
    private Label gwAns, nonAns, guideLabel,
                  adjKey1, adjKey2, adjKey3, adjKey4, adjKey5, adjKey6, adjKey7, adjKey8, adjKey9, adjKey10,
                  exp1, exp2, exp3, exp4, exp5, exp6, exp7, exp8, exp9, exp10,
                  nonKey1, nonKey2 ,nonKey3, nonKey4, nonKey5, nonKey6, nonKey7, nonKey8, nonKey9, nonKey10,
                  nonExp1, nonExp2, nonExp3, nonExp4, nonExp5, nonExp6, nonExp7, nonExp8, nonExp9, nonExp10;

    @FXML
    private TabPane adjTabPane, nonsTabPane, advTabPane;

    @FXML
    private AnchorPane videoPane;

    @FXML
    private MediaView videoView;

    HamburgerBackArrowBasicTransition arrowBasicTransition;

    List<JFXDrawer> adjDrawers = new ArrayList<>();
    List<JFXDrawer> nonDrawers = new ArrayList<>();
    List<JFXDrawer> advDrawers = new ArrayList<>();

    Image prepImage1, prepImage2, prepImage3,
            whoseImage1, whoseImage2,
            twImage1, twImage2, twImage3,
            defAdjImage, infAdjImage, guideImage, vgImage,
            subjectImage1, subjectImage2, subjectImage3,
            objectImage1, objectImage2, objectImage3, objectImage4, objectImage5,
            predicativeImage1, predicativeImage2,
            appositiveImage1, appositiveImage2, appositiveImage3;

    Media video;

    MediaPlayer mediaPlayer;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        try {
            video = new Media(Objects.requireNonNull(MainApplication.class.getResource("/Picture/LearnVideo.mp4")).toURI().toString());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        mediaPlayer = new MediaPlayer(video);

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


        videoView.setMediaPlayer(mediaPlayer);

        guideLabel.setVisible(true);
        adjTabPane.setVisible(false);
        advTabPane.setVisible(false);
        nonsTabPane.setVisible(false);
        videoPane.setVisible(false);

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

        timeDrawer.setSidePane(timeVbox);
        posDrawer.setSidePane(posVbox);
        causeDrawer.setSidePane(causeVbox);
        resDrawer.setSidePane(resVbox);
        aimDrawer.setSidePane(aimVbox);
        ifDrawer.setSidePane(ifVbox);
        concessionDrawer.setSidePane(concessionVbox);
        wayDrawer.setSidePane(wayVbox);
        compareDrawer.setSidePane(compareVbox);


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

        advDrawers.add(timeDrawer);
        advDrawers.add(posDrawer);
        advDrawers.add(causeDrawer);
        advDrawers.add(resDrawer);
        advDrawers.add(aimDrawer);
        advDrawers.add(ifDrawer);
        advDrawers.add(concessionDrawer);
        advDrawers.add(wayDrawer);
        advDrawers.add(compareDrawer);

        adjKey1.setVisible(false);
        adjKey2.setVisible(false);
        adjKey3.setVisible(false);
        adjKey4.setVisible(false);
        adjKey5.setVisible(false);
        adjKey6.setVisible(false);
        adjKey7.setVisible(false);
        adjKey8.setVisible(false);
        adjKey9.setVisible(false);
        adjKey10.setVisible(false);

        exp1.setVisible(false);
        exp2.setVisible(false);
        exp3.setVisible(false);
        exp4.setVisible(false);
        exp5.setVisible(false);
        exp6.setVisible(false);
        exp7.setVisible(false);
        exp8.setVisible(false);
        exp9.setVisible(false);
        exp10.setVisible(false);

        nonKey1.setVisible(false);
        nonKey2.setVisible(false);
        nonKey3.setVisible(false);
        nonKey4.setVisible(false);
        nonKey5.setVisible(false);
        nonKey6.setVisible(false);
        nonKey7.setVisible(false);
        nonKey8.setVisible(false);
        nonKey9.setVisible(false);
        nonKey10.setVisible(false);

        nonExp1.setVisible(false);
        nonExp2.setVisible(false);
        nonExp3.setVisible(false);
        nonExp4.setVisible(false);
        nonExp5.setVisible(false);
        nonExp6.setVisible(false);
        nonExp7.setVisible(false);
        nonExp8.setVisible(false);
        nonExp9.setVisible(false);
        nonExp10.setVisible(false);


        for(JFXDrawer drawer : adjDrawers){
            drawer.close();
            drawer.setVisible(false);
        }

        arrowBasicTransition = new HamburgerBackArrowBasicTransition(menuHam1);
        arrowBasicTransition.setRate(-1);

        menuHam1.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->{
            arrowBasicTransition.setRate(arrowBasicTransition.getRate() *-1);
            arrowBasicTransition.play();
            guideLabel.setVisible(false);
            askImageView.setVisible(false);

            if(menuDrawer.isOpened()){
                menuDrawer.close();
            }
            else
                menuDrawer.open();
        });

    }

    @FXML
    public void showAnsAndExp(){
        adjKey1.setVisible(true);
        adjKey2.setVisible(true);
        adjKey3.setVisible(true);
        adjKey4.setVisible(true);
        adjKey5.setVisible(true);
        adjKey6.setVisible(true);
        adjKey7.setVisible(true);
        adjKey8.setVisible(true);
        adjKey9.setVisible(true);
        adjKey10.setVisible(true);

        exp1.setVisible(true);
        exp2.setVisible(true);
        exp3.setVisible(true);
        exp4.setVisible(true);
        exp5.setVisible(true);
        exp6.setVisible(true);
        exp7.setVisible(true);
        exp8.setVisible(true);
        exp9.setVisible(true);
        exp10.setVisible(true);
    }

    @FXML
    public void showAnsAndExp2(){
        nonKey1.setVisible(true);
        nonKey2.setVisible(true);
        nonKey3.setVisible(true);
        nonKey4.setVisible(true);
        nonKey5.setVisible(true);
        nonKey6.setVisible(true);
        nonKey7.setVisible(true);
        nonKey8.setVisible(true);
        nonKey9.setVisible(true);
        nonKey10.setVisible(true);

        nonExp1.setVisible(true);
        nonExp2.setVisible(true);
        nonExp3.setVisible(true);
        nonExp4.setVisible(true);
        nonExp5.setVisible(true);
        nonExp6.setVisible(true);
        nonExp7.setVisible(true);
        nonExp8.setVisible(true);
        nonExp9.setVisible(true);
        nonExp10.setVisible(true);

    }

    @FXML
    public void abjOnClick(){
        adjTabPane.setVisible(true);
        advTabPane.setVisible(false);
        nonsTabPane.setVisible(false);
        videoPane.setVisible(false);
        guideLabel.setVisible(false);
    }

    @FXML
    public void nonsOnClick(){
        adjTabPane.setVisible(false);
        advTabPane.setVisible(false);
        videoPane.setVisible(false);
        nonsTabPane.setVisible(true);
        guideLabel.setVisible(false);
    }

    @FXML
    public void advOnClick(){
        adjTabPane.setVisible(false);
        nonsTabPane.setVisible(false);
        advTabPane.setVisible(true);
        videoPane.setVisible(false);
        guideLabel.setVisible(false);
    }

    @FXML
    public void showMusicPlay(){
        adjTabPane.setVisible(false);
        nonsTabPane.setVisible(false);
        advTabPane.setVisible(false);
        videoPane.setVisible(true);
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
    public void showTime(){
        setDrawer(0, advDrawers);
    }

    @FXML
    public void showPos(){
        setDrawer(1, advDrawers);
    }

    @FXML
    public void showCause(){
        setDrawer(2, advDrawers);
    }

    @FXML
    public void showRes(){
        setDrawer(3, advDrawers);
    }

    @FXML
    public void showAim(){
        setDrawer(4, advDrawers);
    }

    @FXML
    public void showIf(){
        setDrawer(5, advDrawers);
    }

    @FXML
    public void showConcession(){
        setDrawer(6, advDrawers);
    }

    @FXML
    public void showWay(){
        setDrawer(7, advDrawers);
    }

    @FXML
    public void showCompare(){
        setDrawer(8, advDrawers);
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

    @FXML
    public void startVideo(){
        mediaPlayer.play();
    }

    @FXML
    public void stopVideo(){
        mediaPlayer.pause();
    }

    @FXML
    public void resetVideo(){
        mediaPlayer.seek(Duration.ZERO);
    }

    @FXML
    public void closeWindow(){
        System.exit(0);
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
