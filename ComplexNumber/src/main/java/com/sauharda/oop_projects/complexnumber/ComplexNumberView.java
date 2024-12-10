package com.sauharda.oop_projects.complexnumber;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexNumberView
{
    @javafx.fxml.FXML
    private Label result;
    @javafx.fxml.FXML
    private TextField firstRealNumber;
    @javafx.fxml.FXML
    private TextField secondRealNumber;
    @javafx.fxml.FXML
    private TextField secondImaginaryNumber;
    @javafx.fxml.FXML
    private TextField firstImaginaryNumber;

    @javafx.fxml.FXML
    public void initialize() {
    }

    ComplexNumber c1, c2, c3;
    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {
        c1 = new ComplexNumber(Integer.parseInt(firstRealNumber.getText()), Integer.parseInt(firstImaginaryNumber.getText()));
        c2 = new ComplexNumber(Integer.parseInt(secondRealNumber.getText()), Integer.parseInt(secondImaginaryNumber.getText()));
        c3 = c1.add(c2);
        result.setText(c3.toString());
    }

    @javafx.fxml.FXML
    public void subtractOnAction(ActionEvent actionEvent) {
        c1 = new ComplexNumber(Integer.parseInt(firstRealNumber.getText()), Integer.parseInt(firstImaginaryNumber.getText()));
        c2 = new ComplexNumber(Integer.parseInt(secondRealNumber.getText()), Integer.parseInt(secondImaginaryNumber.getText()));
        c3 = c1.subtract(c2);
        result.setText(c3.toString());
    }
}