package com.sauharda.oop_projects.studentproject;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentViewContoller
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn<Student, String> idTableColumn;
    @javafx.fxml.FXML
    private TextField cgpaTextField;
    @javafx.fxml.FXML
    private TableColumn<Student, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> majorTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> genderTableColumn;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private CheckBox cPlusPlusCheckBox;
    @javafx.fxml.FXML
    private TextField showAverageCGPATextField;
    @javafx.fxml.FXML
    private CheckBox pythonCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> majorComboBox;
    @javafx.fxml.FXML
    private TableColumn<Student, String> cgpaTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> dobTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Student, String> programmingSkillTableColumn;
    @javafx.fxml.FXML
    private RadioButton femaleRadioButton;
    @javafx.fxml.FXML
    private CheckBox javaCheckBox;
    @javafx.fxml.FXML
    private Label warningLabel;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private TableView<Student> studentInfoTableView;


    ArrayList<Student> studentList;
    ToggleGroup tg;

    @javafx.fxml.FXML
    public void initialize(){
        studentList = new ArrayList<>();
        tg = new ToggleGroup();

        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);

        dobDatePicker.setValue(LocalDate.now());
        majorComboBox.getItems().addAll("CSE", "EEE", "BBA");

        idTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        cgpaTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("cgpa"));
        genderTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("gender"));
        dobTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("dob"));
        programmingSkillTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("skills"));
        majorTableColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("major"));
    }

    @javafx.fxml.FXML
    public void showAverageCGPAOnMouseClicked(ActionEvent actionEvent) {
        float cgpaSum = 0;
        for (Student s: studentInfoTableView.getItems()){
            cgpaSum = cgpaSum + s.getCgpa();
        }
        float average = cgpaSum/studentInfoTableView.getItems().size();
        showAverageCGPATextField.setText("Average CGPA is: " + average);
    }

    @javafx.fxml.FXML
    public void addStudentToTableOnMouseClicked(ActionEvent actionEvent) {
        boolean digitFound = false;

        for (int i = 0; i<nameTextField.getText().length(); i++){
            if (nameTextField.getText().charAt(i) >= '0' && nameTextField.getText().charAt(i) <= '0')
                digitFound = true;
        }

        if (idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() ||
                cgpaTextField.getText().isEmpty() || dobDatePicker.getValue().isAfter(LocalDate.now()) ||
                digitFound){
            warningLabel.setText("Fill up the form properly");
        }
        else{
            warningLabel.setText("Student Added");

            String gender = "";
            if(maleRadioButton.isSelected())
                gender = "Male";
            else if(femaleRadioButton.isSelected())
                gender = "Female";

            ArrayList<String> skillSet = new ArrayList<String>();
            if (pythonCheckBox.isSelected() && javaCheckBox.isSelected() && cPlusPlusCheckBox.isSelected()){
                skillSet.add("Python");
                skillSet.add("Java");
                skillSet.add("C++");
            }
            else if (pythonCheckBox.isSelected()){
                skillSet.add("Python");
            }
            else if (javaCheckBox.isSelected()){
                skillSet.add("Java");
            }
            else if (cPlusPlusCheckBox.isSelected()){
                skillSet.add("C++");
            }

            Student studentToBeAdded = new Student(
                    Integer.parseInt(idTextField.getText()),
                    nameTextField.getText(),
                    majorComboBox.getValue(),
                    gender, Float.parseFloat(cgpaTextField.getText()),
                    Arrays.toString(skillSet.toArray()),
                    dobDatePicker.getValue()
            );
            studentInfoTableView.getItems().add(studentToBeAdded);
            studentList.add(studentToBeAdded);
        }
    }

    @javafx.fxml.FXML
    public void showOnlyMaleStudentOnMouseClicked(ActionEvent actionEvent) {
        studentInfoTableView.getItems().clear();
        for(Student s: studentList){
            if (s.getGender().equals("Male")){
                studentInfoTableView.getItems().add(s);
            }
        }
    }
}