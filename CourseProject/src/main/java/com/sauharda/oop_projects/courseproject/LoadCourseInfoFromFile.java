package com.sauharda.oop_projects.courseproject;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadCourseInfoFromFile
{
    @javafx.fxml.FXML
    private TableColumn<Course, String> credits1TableColumn;
    @javafx.fxml.FXML
    private TableView<Course> courseInfoTxtTableView;
    @javafx.fxml.FXML
    private TableColumn<Course, String> credits2TableColumn;
    @javafx.fxml.FXML
    private TableColumn<Course, String> courseType2TableColumn;
    @javafx.fxml.FXML
    private TableColumn<Course, String> courseTitle1TableColumn;
    @javafx.fxml.FXML
    private TableView<Course> courseInfoBinTableView;
    @javafx.fxml.FXML
    private TableColumn<Course, String> courseTitle2TableColumn;
    @javafx.fxml.FXML
    private TableColumn<Course, String> courseType1TableColumn;
    @javafx.fxml.FXML
    private TableColumn<Course, String> courseID1TableColumn;
    @javafx.fxml.FXML
    private TableColumn<Course, String> courseID2TableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        courseID1TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("courseId"));
        courseTitle1TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("title"));
        courseType1TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("type"));
        credits1TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("noOfCredits"));

        courseID2TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("courseId"));
        courseTitle2TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("title"));
        courseType2TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("type"));
        credits2TableColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("noOfCredits"));
    }

    @javafx.fxml.FXML
    public void loadCourseInfoFromCourseInfotxtOnAction(ActionEvent actionEvent) {
        File f = new File("courseInfo.txt");
        try {
            Scanner s = new Scanner(f);
            String str = "";
            String[] tokens;
            while(s.hasNextLine()){
                str = s.nextLine();
                tokens = str.split(",");
                Course c = new Course(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));
                courseInfoTxtTableView.getItems().add(c);
            }

        } catch (Exception e) {
            //
        }
    }

    @javafx.fxml.FXML
    public void loadCourseInfoFromCourseInfobinOnAction(ActionEvent actionEvent) {
    }
}