package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private CheckBox chxMelk;

    @FXML
    private CheckBox chxSmor;

    @FXML
    private Label lblNavn;

    @FXML
    private TextField txtEtternavn;

    @FXML
    private TextField txtFornavn;

    @FXML
    void clickme(ActionEvent event) {
        String ut = "";
        String fornavn = txtFornavn.getText();
        String etternavn = txtEtternavn.getText();
        String navn = fornavn + " " + etternavn;
        ut = fornavn + " " + etternavn + " har bestilt følgende varer: ";
        if (chxSmor.isSelected()){
            ut += " Smør";
        }
        if (chxMelk.isSelected()){
            ut += " Melk";
        }
        lblNavn.setText(ut);

    }

}
