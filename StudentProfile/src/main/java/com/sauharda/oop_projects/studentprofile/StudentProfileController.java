package com.sauharda.oop_projects.studentprofile;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class StudentProfileController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private ComboBox<String> nationalityComboBox;
    @javafx.fxml.FXML
    private TextArea displayTextArea;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private DatePicker dateOfBirthDatePicker;
    @javafx.fxml.FXML
    private Button createProfileButton;

    @javafx.fxml.FXML
    public void initialize() {
        nationalityComboBox.getItems().addAll("Bangladeshi", "Indian", "Pakistani", "Nigerian", "Others");
        ToggleGroup toggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(toggleGroup);
        femaleRadioButton.setToggleGroup(toggleGroup);
    }

    @javafx.fxml.FXML
    public void createProfileOnClick(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String id = idTextField.getText();
        String dob = dateOfBirthDatePicker.getValue().toString();
        String nationality = nationalityComboBox.getValue();

        String gender;
        if(maleRadioButton.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }

        Student student = new Student(name, id, dob, nationality, gender);

        displayTextArea.appendText(student.toString());
    }
}