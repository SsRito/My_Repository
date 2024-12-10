package com.sauharda.oop_projects.midterm_2210022_sec5;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MidExamSceneController
{
    @javafx.fxml.FXML
    private TableColumn<Article, String> noOfAuthorTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> articleTypeComboBox;
    @javafx.fxml.FXML
    private Label alertLabel;
    @javafx.fxml.FXML
    private CheckBox searchStatusNoCheckBox;
    @javafx.fxml.FXML
    private DatePicker publicationDatePicker;
    @javafx.fxml.FXML
    private TableView<Article> articleInfoTableView;
    @javafx.fxml.FXML
    private TextField noOfAuthorTextFiled;
    @javafx.fxml.FXML
    private TextField fromYearTextField;
    @javafx.fxml.FXML
    private TextArea heighestNoAuthorTextArea;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableColumn<Article, String> titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Article, String> articleTypeTableColumn;
    @javafx.fxml.FXML
    private CheckBox searchStatusYesCheckBox;
    @javafx.fxml.FXML
    private TableColumn<Article, String> citationStatusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> searchTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Article, String> authorTableColumn;
    @javafx.fxml.FXML
    private TextField authorTextField;
    @javafx.fxml.FXML
    private CheckBox statusYesCheckBox;
    @javafx.fxml.FXML
    private CheckBox statusNoCheckBox;
    @javafx.fxml.FXML
    private TextField toYearTextField;

    ArrayList<Article> articleList;

    @javafx.fxml.FXML
    public void initialize() {

        publicationDatePicker.setValue(LocalDate.now());
        articleTypeComboBox.getItems().addAll("Review", "Book", "Case");
        searchTypeComboBox.getItems().addAll("Review", "Book", "Case");

        titleTableColumn.setCellValueFactory(new PropertyValueFactory<Article, String>("title"));
        authorTableColumn.setCellValueFactory(new PropertyValueFactory<Article, String>("author"));
        noOfAuthorTableColumn.setCellValueFactory(new PropertyValueFactory<Article, String>("noOfAuthor"));
        articleTypeTableColumn.setCellValueFactory(new PropertyValueFactory<Article, String>("articleType"));
        citationStatusTableColumn.setCellValueFactory(new PropertyValueFactory<Article, String>("status"));
    }

    @javafx.fxml.FXML
    public void yearFileterOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void heighestNoAuthorOnAction(ActionEvent actionEvent) {
        articleInfoTableView.getItems().clear();
        for(Article a: articleList){
            if (a.getNoOfAuthor()<= Integer.parseInt(noOfAuthorTextFiled.getText())){
                //heighestNoAuthorTextArea.setItems().add(a);

    }

    @javafx.fxml.FXML
    public void addArticleOnAction(ActionEvent actionEvent) {
        boolean digitFound = false;

        for (int i = 0; i<titleTextField.getText().length(); i++) {
            if (titleTextField.getText().charAt(i) >= '0' && titleTextField.getText().charAt(i) <= '0')
                digitFound = true;
        }

        if (titleTextField.getText().isEmpty() || authorTextField.getText().isEmpty() ||
                noOfAuthorTextFiled.getText().isEmpty() || publicationDatePicker.getValue().isAfter(LocalDate.now()) ||
                digitFound) {
            alertLabel.setText("Error");
        }

        else {
            alertLabel.setText("Success");

            ArrayList<String> citationStatus = new ArrayList<String>();
            if(statusYesCheckBox.isSelected()){
                citationStatus.add("Yes");
            }

            else if (statusNoCheckBox.isSelected()) {
                citationStatus.add("No");
            }

            Article articleToBeAdded = new Article(
                    titleTextField.getText(),
                    authorTextField.getText(),
                    articleTypeComboBox.getValue(),
                    Arrays.toString(citationStatus.toArray()),
                    Integer.parseInt(noOfAuthorTextFiled.getText()),
                    publicationDatePicker.getValue()
            );
            articleInfoTableView.getItems().add(articleToBeAdded);
            articleList.add(articleToBeAdded);
        }

    }

    @javafx.fxml.FXML
    public void searchArticleOnAction(ActionEvent actionEvent) {
        ArrayList<String> searchStatus = new ArrayList<String>();
        if(statusYesCheckBox.isSelected()){
            searchStatus.add("Yes");
        }

        else if (statusNoCheckBox.isSelected()) {
            searchStatus.add("No");
        }

      //  articleInfoTableView.getItems().clear();
        //for(Article a: articleList){
          //  if (a.getStatus()searchStatus
        //}
    }
}