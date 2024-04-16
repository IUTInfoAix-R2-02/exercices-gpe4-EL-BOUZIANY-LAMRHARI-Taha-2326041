package com.exemple.partie2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class BonjourFenetre extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //VBOX
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        //Label
        Label helloLabel = new Label("I fw vro");
        helloLabel.setMinWidth(100);
        helloLabel.setMinHeight(100);

        vbox.getChildren().add(helloLabel);

        TextField nameField = new TextField("I still fw vro");
        nameField.setMaxWidth(180.0d);
        nameField.setFont( Font.font("Courier", FontWeight.NORMAL, 12) );

        vbox.getChildren().add(nameField);

        // Ajout d'un bouton avec du texte
        Button button = new Button();
        vbox.getChildren().add( button );

        // Chargement de l'image
        Image image = new Image( BonjourFenetre.class.getResource("silver_button.png").toString() );

        // Création d'un composant avec l'image peinte à l'intérieur
        ImageView iv = new ImageView();
        iv.setImage(image);

        // Intégration de l'image
        button.setGraphic( iv );

        // Changement du texte après un clic sur le bouton
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            helloLabel.setText( "wsg, "+nameField.getText() );
        });


        //Scene
        Scene scene = new Scene(vbox);
        primaryStage.setScene( scene );

        primaryStage.setTitle("Hello application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
