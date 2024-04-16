package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;



    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        this.label = new Label("Wsg vro");
        this.root=new BorderPane();
        this.panneau = new Pane();

        /*vbox.getChildren().addAll(
                label,
                root,
                bas
        );*/

        //couleurs
        this.vert= new Button("Vert");
        this.rouge= new Button("Rouge");
        this.bleu= new Button("Bleu");

        root.setMinWidth(400);
        root.setMinHeight(200);
        this.bas = new HBox();

        //klk
        this.label.setFont( Font.font("Courier", FontWeight.NORMAL, 20) );


        this.label.setAlignment(Pos.TOP_CENTER);
        this.root.setTop(label);
        this.root.setCenter(this.panneau);
        this.root.setBottom(this.bas);

        //event
        this.vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent ->{
            this.panneau.setStyle("-fx-background-color:#00FF00; -fx-text-fill: white;");
            nbVert++;
            this.label.setText(vert.getText()+ " a été cliqué "+nbVert + "fois");

        });
        this.rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent ->{
            this.panneau.setStyle("-fx-background-color:#FF0000; -fx-text-fill: white;");
            nbRouge++;
            this.label.setText(rouge.getText()+ " a été cliqué "+nbRouge + "fois");

        });
        this.bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent ->{
            this.panneau.setStyle("-fx-background-color:#0000FF; -fx-text-fill: white;");
            nbBleu++;
            this.label.setText(bleu.getText()+ " a été cliqué "+nbBleu + "fois");
        });





        this.bas.setAlignment(Pos.CENTER);
        this.bas.setSpacing(10);

        HBox.setMargin( vert, new Insets(10,10,10,10));
        HBox.setMargin( rouge, new Insets(10,10,10,10));
        HBox.setMargin( bleu, new Insets(10,10,10,10));


        bas.getChildren().addAll(vert,rouge,bleu);
        root.setBottom(bas);

        //Scene
        Scene scene = new Scene(root);
        primaryStage.setScene( scene );

        primaryStage.setTitle("Hello application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}

