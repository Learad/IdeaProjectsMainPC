package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private CheckBox chxSjekkMeg;

    @FXML
    private Label lblUt;

    @FXML
    void SjekkMeg(ActionEvent event) {
        if (chxSjekkMeg.isSelected()){
            lblUt.setText("Nå er sjekk meg sjekket");
        }else {
            lblUt.setText("Nå er IKKE sjekk meg sjekket");
        }

    }

}
