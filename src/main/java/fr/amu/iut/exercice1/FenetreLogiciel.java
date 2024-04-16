package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage stage) {

        // Création du conteneur principal
        HBox align = new HBox();
        VBox vbox = new VBox();
        VBox truc = new VBox();


        Separator VSep = new Separator();
        VSep.setOrientation(Orientation.VERTICAL);
        HBox topControls = new HBox();
        topControls.setAlignment( Pos.BOTTOM_LEFT );


        Menu btnFile = new Menu("File");

        MenuItem new_ = new MenuItem ("New");
        MenuItem open = new MenuItem ("Open");
        SeparatorMenuItem sepm4 = new SeparatorMenuItem();
        MenuItem save = new MenuItem ("Save");
        MenuItem saveas = new MenuItem ("Save as");
        SeparatorMenuItem sepm5 = new SeparatorMenuItem();
        MenuItem export = new MenuItem ("Export");
        SeparatorMenuItem sepm6 = new SeparatorMenuItem();
        MenuItem close = new MenuItem ("Close file");
        MenuItem exit = new MenuItem ("Exit");

        btnFile.getItems().addAll(new_,open,sepm4, save,saveas,sepm5,export,sepm6,close,exit);


        Menu btnEdit = new Menu("Edit");

        MenuItem copy = new MenuItem ("Copy");
        MenuItem cut = new MenuItem ("Cut");
        MenuItem paste = new MenuItem ("Paste");
        SeparatorMenuItem sepm1 = new SeparatorMenuItem();
        MenuItem undo = new MenuItem ("Undo");
        MenuItem redo = new MenuItem ("Redo");
        SeparatorMenuItem sepm2 = new SeparatorMenuItem();
        MenuItem delete = new MenuItem ("Delete");
        SeparatorMenuItem sepm3 = new SeparatorMenuItem();
        MenuItem selectall = new MenuItem ("Select All");

        btnEdit.getItems().addAll(copy, cut,paste,sepm1,undo,redo,sepm2, delete,sepm3,selectall);

        Menu btnHelp = new Menu("Help");

        MenuItem help = new MenuItem ("Help");
        MenuItem contact = new MenuItem ("Contact support");
        MenuItem about = new MenuItem ("About us");
        btnHelp.getItems().addAll(help,contact,about);


        MenuBar menu = new MenuBar();
        menu.getMenus().addAll(btnFile,btnEdit,btnHelp);
        topControls.getChildren().addAll(menu);
        HBox topRightControls = new HBox();
        HBox.setHgrow(topRightControls, Priority.ALWAYS );
        topRightControls.setAlignment( Pos.BOTTOM_RIGHT );
        Hyperlink signOutLink = new Hyperlink("Sign Out");
        topRightControls.getChildren().add( signOutLink );

        // Création du tableau avec les deux colonnes
        VBox main = new VBox();
        HBox hbname = new HBox();
        HBox hbmail = new HBox();
        HBox hbpass = new HBox();
        HBox hbbtn = new HBox();


        Label name = new Label("Name:      ");
        TextField tfname = new TextField("Enter your name");
        hbname.getChildren().addAll(
                name,
                tfname
        );

        Label mail = new Label("E-Mail:      ");
        TextField tfmail = new TextField("Enter your e-mail");
        hbmail.getChildren().addAll(
                mail,
                tfmail
        );

        Label pass = new Label("Password: ");
        TextField tfpass = new TextField("Enter your password");
        hbpass.getChildren().addAll(
                pass,
                tfpass
        );

        Button btsubmit = new Button("Submit");
        Button btcancel = new Button("Cancel");
        hbbtn.getChildren().addAll(btsubmit,btcancel);

        HBox.setMargin( btsubmit, new Insets(10,10,10,50));
        HBox.setMargin( btcancel, new Insets(10,10,10,10));

        main.getChildren().addAll(hbname, hbmail, hbpass, hbbtn);


        // Création de la ligne de séparation
        Separator sep = new Separator();

        // Création du bandeau en bas de la fenêtre
        HBox bottomControls = new HBox();
        Label salut = new Label("hola @ultratypeshi");
        bottomControls.getChildren().add(salut);
        salut.setAlignment(Pos.CENTER);

        // sidebar
        VBox leftControls = new VBox();
        //BorderPane root = new BorderPane();
        Label btn = new Label("Boutons: ");
        Button btn1 = new Button ("bouton 1");
        Button btn2 = new Button ("bouton 2");
        Button btn3 = new Button ("bouton 3");
        //root.setLeft();
        leftControls.setAlignment(Pos.CENTER_LEFT);
        leftControls.getChildren().addAll(
                btn,
                btn1,
                btn2,
                btn3
        );
        VBox.setMargin( btn1, new Insets(10.0d) );
        VBox.setMargin( btn2, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setMargin( btn3, new Insets(10.0d) );


        // Ajout des contrôleurs au conteneur principal
        align.getChildren().addAll(leftControls,VSep, truc);

        truc.getChildren().addAll(
                main
        );

        vbox.getChildren().addAll(
                topControls,
                align,
                sep,
                bottomControls
        );
        VBox.setMargin( btn, new Insets(10,30,10,10));
        VBox.setMargin( btn1, new Insets(10,10,10,10));
        VBox.setMargin( btn2, new Insets(10,10,10,10));
        VBox.setMargin( btn3, new Insets(10,10,10,10));
        VBox.setMargin( topControls, new Insets(10.0d) );
        VBox.setMargin( main, new Insets(0.0d, 10.0d, 10.0d, 10.0d) );
        VBox.setMargin( bottomControls, new Insets(10.0d) );

        VBox.setMargin( hbname, new Insets(10,10,10,10));
        VBox.setMargin( hbmail, new Insets(10,10,10,10));
        VBox.setMargin( hbpass, new Insets(10,10,10,10));

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vbox );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        stage.setScene( scene );
        stage.setWidth( 800 );
        stage.setHeight( 600 );
        stage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
