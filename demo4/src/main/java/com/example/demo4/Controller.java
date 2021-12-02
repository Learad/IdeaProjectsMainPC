package com.example.demo4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtAntallÅr;

    @FXML
    private TextField txtBeløp;

    @FXML
    private TextField txtRente;

    @FXML
    void Beregn(ActionEvent event) {
        try{
        double rente = Double.parseDouble(txtRente.getText());
        int år = Integer.parseInt(txtAntallÅr.getText());
        double beløp = Double.parseDouble(txtBeløp.getText());
        double resultat = beløp * Math.pow(1+(rente/100),år);
        lblResultat.setText("Totalbeløpet etter " + år + " år blir " + String.format("%.2f", resultat));}

            catch(Exception e){
                lblResultat.setText("Skriv inn tall i alle feltene!");
        }


    }

}
