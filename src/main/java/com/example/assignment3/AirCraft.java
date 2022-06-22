package com.example.assignment3;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
public class AirCraft extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 1020, 650);
        pane.setStyle("-fx-background-color: skyblue");

        ImageView imageView1 = makeClouds(scene);
        ImageView imageView2 = makeCloud2(scene);
        ImageView imageView3 = makeCloud3(scene);
        ImageView imageView10 = makeCloud10(scene);
        ImageView imageView11 = makeCloud11(scene);
        ImageView imageView12 = makeCloud12(scene);
        ImageView imageView4 = makeCloud4(scene);
        ImageView imageView5 = showCoin(scene);
        ImageView imageView6 = showCoin1(scene);
        ImageView imageView7 = showCoin2(scene);
        ImageView imageView8 = showCoin3(scene);
        ImageView imageView9 = showCoin4(scene);
        ImageView imageView = createPlane(scene);

        pane.getChildren().addAll(imageView,imageView1,imageView2,imageView3,imageView10,imageView11,imageView12,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {

            double vertical = imageView.getY();
            double horizontal = imageView.getX();
            imageView.setX(100);

            switch (event.getCode()){

                case RIGHT -> imageView.setX(horizontal + 10);
                case LEFT -> imageView.setX(horizontal - 10);
                case UP -> imageView.setY(vertical- 10 );
                case DOWN -> imageView.setY(vertical + 10 );
            }
        });

        stage.setTitle("AirCraft Game");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();

    }
    private ImageView makeCloud2(Scene scene) {
        ImageView image2 = new ImageView(new Image("/cloud1.png"));
        image2.setFitWidth(110);
        image2.setFitHeight(100);

        image2.setX(2000);
        image2.setY(20);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(11000), image2);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image2;
    }

    private ImageView makeCloud3(Scene scene) {
        ImageView image3 = new ImageView(new Image("/cloud12.png"));
        image3.setFitWidth(110);
        image3.setFitHeight(100);

        image3.setX(2000);
        image3.setY(100);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(14000), image3);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image3;
    }

    private ImageView makeCloud10(Scene scene) {
        ImageView image10 = new ImageView(new Image("/icons8-cloud-96.png"));
        image10.setFitWidth(110);
        image10.setFitHeight(100);

        image10.setX(2000);
        image10.setY(320);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(15900), image10);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image10;
    }

    private ImageView makeCloud12(Scene scene) {
        ImageView image12 = new ImageView(new Image("/cloud1c.png"));
        image12.setFitWidth(110);
        image12.setFitHeight(100);

        image12.setX(2000);
        image12.setY(320);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(7000), image12);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image12;
    }

   private ImageView makeCloud4(Scene scene) {
        ImageView image4 = new ImageView(new Image("/cloud3.png"));
        image4.setFitWidth(110);
        image4.setFitHeight(100);
        image4.setY(320);
        image4.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(12000), image4);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image4;
   }

    private ImageView makeCloud11(Scene scene) {
        ImageView image11 = new ImageView(new Image("/computing.png"));
        image11.setFitWidth(110);
        image11.setFitHeight(100);
        image11.setY(520);
        image11.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(13990), image11);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image11;
    }

    private ImageView makeClouds(Scene scene) {
        ImageView image1 = new ImageView(new Image("/cloud1.png"));
        image1.setFitWidth(110);
        image1.setFitHeight(100);
        image1.setY(520);
        image1.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(10000), image1);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image1;
    }

    private ImageView showCoin(Scene scene) {
        ImageView image5 = new ImageView(new Image("/coin.png"));
        image5.setFitWidth(40);
        image5.setFitHeight(40);
        image5.setY(560);
        image5.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(16000), image5);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image5;
    }

    private ImageView showCoin1(Scene scene) {
        ImageView image6 = new ImageView(new Image("/coin.png"));
        image6.setFitWidth(40);
        image6.setFitHeight(40);
        image6.setY(300);
        image6.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(14000), image6);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image6;
    }

    private ImageView showCoin2(Scene scene) {
        ImageView image7 = new ImageView(new Image("/coin.png"));
        image7.setFitWidth(40);
        image7.setFitHeight(40);
        image7.setY(320);
        image7.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(12000), image7);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image7;
    }

    private ImageView showCoin3(Scene scene) {
        ImageView image8 = new ImageView(new Image("/coin.png"));
        image8.setFitWidth(40);
        image8.setFitHeight(40);
        image8.setY(50);
        image8.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(10000), image8);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image8;
    }

    private ImageView showCoin4(Scene scene) {
        ImageView image9 = new ImageView(new Image("/coin.png"));
        image9.setFitWidth(40);
        image9.setFitHeight(40);
        image9.setY(30);
        image9.setX(2000);

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(8500), image9);
        translateTransition.setByX(-2500f);
        translateTransition.setCycleCount(10000);
        translateTransition.setAutoReverse(false);

        translateTransition.play();
        return image9;
    }

    private ImageView createPlane(Scene scene) {

        ImageView image = new ImageView(new Image("/plane.jpg"));
        image.setFitWidth(100);
        image.setFitHeight(80);
        image.setY(200);
        image.setX(50);

        return image;
    }

    public static void main(String[] args) {
        launch();
    }
}