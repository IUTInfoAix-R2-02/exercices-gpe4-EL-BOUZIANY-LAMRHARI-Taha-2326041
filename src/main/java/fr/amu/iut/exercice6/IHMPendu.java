package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class IHMPendu extends Application {
    private BorderPane root;
    private Label nbVies = new Label("I fw vro ");
    private Scene scene;
    private HBox hbox;
    private VBox clavier;
    private HBox row1;
    private HBox row2;
    private HBox row3;


    //boutons
    private Button bq = new Button("q");
    private Button bw = new Button("w");
    private Button be = new Button("e");
    private Button br = new Button("r");
    private Button bt = new Button("t");
    private Button by = new Button("y");
    private Button bu = new Button("u");
    private Button bi = new Button("i");
    private Button bo = new Button("o");
    private Button bp = new Button("p");
    //file2= new Butt n("q");
    private Button ba = new Button("a");
    private Button bs = new Button("s");
    private Button bd = new Button("d");
    private Button bf = new Button("f");
    private Button bg = new Button("g");
    private Button bh = new Button("h");
    private Button bj = new Button("j");
    private Button bk = new Button("k");
    private Button bl = new Button("l");
    private Button bz = new Button("z");
    private Button bx = new Button("x");
    private Button bc = new Button("c");
    private Button bv = new Button("v");
    private Button bb = new Button("b");
    private Button bn = new Button("n");
    private Button bm = new Button("m");
    private VBox vbox;
    private TextField guess;
    private Button send;



    @Override
    public void start(Stage primaryStage) throws Exception {


        this.send = new Button("send");
        this.guess = new TextField("I fw vro ");

        this.hbox = new HBox();
        this.vbox = new VBox();
        vbox.setSpacing(30);
        vbox.setAlignment(Pos.CENTER);
        this.root = new BorderPane();
        this.scene = new Scene(root);
        this.root.setStyle("-fx-background-color:#99FFFF;");


        this.clavier = new VBox();
        this.row1 = new HBox();
        this.row2 = new HBox();
        this.row3 = new HBox();
        row1.setAlignment(Pos.CENTER);
        row2.setAlignment(Pos.CENTER);
        row3.setAlignment(Pos.CENTER);

        clavier.setAlignment(Pos.CENTER);
        row1.getChildren().addAll(
                bq,bw,be,br,bt,by,bu,bi,bo,bp
        );
        row2.getChildren().addAll(
                ba,bs,bd,bf,bg,bh,bj,bk,bl
        );
        row3.getChildren().addAll(
                bz,bx,bc,bv,bb,bn,bm
        );

        clavier.getChildren().addAll(
          row1,row2,row3
        );
        hbox.getChildren().addAll(
                guess
        );
        vbox.getChildren().addAll(
                nbVies,
                guess,
                clavier,
                send
        );



        VBox.setMargin(clavier, new Insets(0,10,0,10));
        VBox.setMargin( guess, new Insets(0,80,0,80));
        root.setCenter(vbox);

        primaryStage.setTitle("I fw vro");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        // A completer
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
