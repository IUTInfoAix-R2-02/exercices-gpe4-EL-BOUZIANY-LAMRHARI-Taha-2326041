package fr.amu.iut.exercice8;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class  LoginControl extends GridPane {
    @FXML
    private TextField pwd;

    @FXML
    private TextField userid;

    @FXML
    private Button ok;
    @FXML
    private Button cancel;

    private void okClicked() {
        String text = userid.getText();
        System.out.println("Text in TextField: " + text);
    }

    private void cancelClicked() {
    }
}