package com.example.rentfinal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RentController {
    @FXML
    private Button calculateButton;

    @FXML
    private TextField electricalCurrentAmount;

    @FXML
    private TextField electricalLastAmount;

    @FXML
    private TextField electricalRate;

    @FXML
    private Label result;

    @FXML
    private TextField waterCurrentAmount;

    @FXML
    private TextField waterLastAmount;

    @FXML
    private TextField waterRate;

    @FXML
    void onClick(MouseEvent event) {
        try {
            // Initialize Electrical
            double _electricalRate = Double.parseDouble(electricalRate.getText());
            double _electricalLastAmount = Double.parseDouble(electricalLastAmount.getText());
            double _electricalCurrentAmount = Double.parseDouble(electricalCurrentAmount.getText());
            double electricalDiff = (_electricalCurrentAmount - _electricalLastAmount);

            // Initialize Water
            double _waterRate = Double.parseDouble(waterRate.getText());
            double _waterLastAmount = Double.parseDouble(waterLastAmount.getText());
            double _waterCurrentAmount = Double.parseDouble(waterCurrentAmount.getText());
            double waterDiff = (_waterCurrentAmount - _waterLastAmount);

            String res = "Electrical Diff: " + electricalDiff + ", to pay: " + electricalDiff*_electricalRate + ", Water Diff: " + waterDiff + ". to pay: " + waterDiff*_waterRate + ", Total with rent: " + (electricalDiff*_electricalRate + waterDiff*_waterRate + 2500);
            result.setText(res);

        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }
}