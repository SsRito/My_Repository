package com.sauharda.oop_projects.courseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class CreateNewCourse
{
    @javafx.fxml.FXML
    private ComboBox<Integer> howManyCreditsComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> selectCourseTypeComboBox;
    @javafx.fxml.FXML
    private TextField courseTitleTextField;
    @javafx.fxml.FXML
    private TextField courseIDTextField;

    ArrayList<Course> courseList;

    @javafx.fxml.FXML
    public void initialize() {
        howManyCreditsComboBox.getItems().addAll(1,3,4,6);
        selectCourseTypeComboBox.getItems().addAll("Major", "Minor", "Core", "Foundation");
        courseList = new ArrayList<Course>();
    }


    @javafx.fxml.FXML
    public void saveCourseListToABinaryFileUsingObjectStreamOnAction(ActionEvent actionEvent) {
        File f = new File("courseInfo.bin");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            if (f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            for (Course c: courseList){
                oos.writeObject(c);
            }
            oos.close();
        }

        catch(Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void accumulateToCourseListOnAction(ActionEvent actionEvent) {
        courseList.add(
                new Course(
                        courseIDTextField.getText(),
                        courseTitleTextField.getText(),
                        selectCourseTypeComboBox.getValue(),
                        howManyCreditsComboBox.getValue()
                )
        );
        courseIDTextField.clear();
        courseTitleTextField.clear();
    }

    @javafx.fxml.FXML
    public void goToCourseInfoViewOnAction(ActionEvent actionEvent) {
        try {
            //FXMLLoader fxmlLoader = new FXMLLoader(CreateNewBookController.class.getResource("LoadCourseInfoFromFileView.fxml"));
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loadCourseInfoFromFile.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Load Course From File");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(Exception e){
            //
        }
    }

    @FXML
    public void saveCourseListToCourseinfotxtOnAction(ActionEvent actionEvent) {
        FileWriter fw = null;
        File f = new File("courseInfo.txt");
        try {
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for (Course c:courseList){
                str += c.toString("for file");
                fw.write(str);
                fw.close();
            }
        } catch (Exception e) {
            //
        }

    }

    @javafx.fxml.FXML
    public void switchLoadCourseInfoViewOnThisStageOnAction(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader
                    = new FXMLLoader(HelloApplication.class.getResource("loadCourseInfoFromFile.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            stage.setTitle("Load Course From File");
            stage.setScene(nextScene);
            stage.show();
        }
        catch (Exception e) {
            //
        }
    }
}