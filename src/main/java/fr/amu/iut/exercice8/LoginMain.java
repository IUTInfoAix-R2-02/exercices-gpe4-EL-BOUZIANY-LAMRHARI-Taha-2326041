package fr.amu.iut.exercice8;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @FXML
    private Button ok;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("exercice8/LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setScene(scene);
        //stage.setWidth(400);
        //stage.setHeight(200);
        stage.setTitle("FXML Custom Control");
        stage.show();
    }
}
