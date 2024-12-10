package com.sauharda.oop_projects.student;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeViewController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableView<Employee> employeeInfoTableView;
    @javafx.fxml.FXML
    private DatePicker DoBDatePicker;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> idTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> DoBTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> nameTableColumn;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker DoJDatePicker;
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private TextField salarySearchTextField;
    @javafx.fxml.FXML
    private ComboBox<String> designationComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> detailsComboBox;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> DoJTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> designationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> salaryTableColumn;

    ArrayList<Employee> employeeList;

    @javafx.fxml.FXML
    public void initialize() {
        employeeList = new ArrayList<>();

        DoBDatePicker.setValue(LocalDate.now());
        DoJDatePicker.setValue(LocalDate.now());
        designationComboBox.getItems().addAll("CEO", "HR Manager", "Accountant", "Lawyer");

        List<String> idList = new ArrayList<>();
        for (Employee e : employeeInfoTableView.getItems()) {
            String id = idTableColumn.getCellData(e);
            if (id != null) {  // Optional: check if ID is not null
                idList.add(id);
            }
        }

        detailsComboBox.getItems().addAll(idList);

        idTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("ID"));
        salaryTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("salary"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        designationTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("designation"));
        DoBTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Dob"));
        DoJTableColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("Doj"));
    }

    @javafx.fxml.FXML
    public void addNewEmployeeOnAction(ActionEvent actionEvent) {
        boolean digitFound = false;

        for (int i = 0; i<nameTextField.getText().length(); i++) {
            if (nameTextField.getText().charAt(i) >= '0' && nameTextField.getText().charAt(i) <= '0')
                digitFound = true;
        }

        if (idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() ||
                salaryTextField.getText().isEmpty() || DoBDatePicker.getValue().isAfter(LocalDate.now()) ||
                DoJDatePicker.getValue().isAfter(LocalDate.now()) || digitFound){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Fill up the form properly");
            errorAlert.show();
        }

        else{
            Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
            confirm.setContentText("Employee Added");
            confirm.show();

            Employee employeeToBeAdded = new Employee(
                    Integer.parseInt(idTextField.getText()),
                    Integer.parseInt(salaryTextField.getText()),
                    nameTextField.getText(),
                    designationComboBox.getValue(),
                    DoBDatePicker.getValue(),
                    DoJDatePicker.getValue()
            );
            employeeInfoTableView.getItems().add(employeeToBeAdded);
            employeeList.add(employeeToBeAdded);
        }
    }

    @javafx.fxml.FXML
    public void loadTableOnAction(ActionEvent actionEvent) {
        employeeInfoTableView.getItems().clear();
        for (Employee e: employeeList){
            if (e.getSalary() <= Integer.parseInt(salarySearchTextField.getText())){
                employeeInfoTableView.getItems().add(e);
            }
        }
    }

    @javafx.fxml.FXML
    public void showOnAction(ActionEvent actionEvent) {
    }
}