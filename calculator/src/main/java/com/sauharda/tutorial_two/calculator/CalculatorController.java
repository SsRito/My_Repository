package com.sauharda.tutorial_two.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController
{
    @javafx.fxml.FXML
    private TextField textFieldOne;
    @javafx.fxml.FXML
    private TextField textFieldTwo;
    @javafx.fxml.FXML
    private Label answerLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        int num3 = num1 + num2;

        String numThree = Integer.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void subtractOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        int num3 = num1 - num2;

        String numThree = Integer.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void multiplyOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        int num3 = num1 * num2;

        String numThree = Integer.toString(num3);
        answerLabel.setText(numThree);
    }

    @javafx.fxml.FXML
    public void divideOnClick(ActionEvent actionEvent) {
        String numOne = textFieldOne.getText();
        String numTwo = textFieldTwo.getText();

        float num1 = Float.parseFloat(numOne);
        float num2 = Float.parseFloat(numTwo);

        if(num2 == 0) {
          answerLabel.setText("Cannot divided by 0");
        }
        else {
            float num3 = num1 / num2;

            String numThree = Float.toString(num3);
            answerLabel.setText(numThree);
        }
    }

    @javafx.fxml.FXML
    public void clearOnClick(ActionEvent actionEvent) {
        textFieldOne.clear();
        textFieldTwo.clear();
        answerLabel.setText("Answer");
    }
}