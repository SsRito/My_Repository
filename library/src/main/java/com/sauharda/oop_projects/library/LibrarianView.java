package com.sauharda.oop_projects.library;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LibrarianView
{
    @javafx.fxml.FXML
    private TableColumn<Member, String> memberIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Member, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Books, String> bookTitleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Books, String> availabilityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Books, String> isbnTableColumn;
    @javafx.fxml.FXML
    private TableView<Member> memberTableView;
    @javafx.fxml.FXML
    private TextField memberIDTextField;
    @javafx.fxml.FXML
    private TableColumn<Books, String> memberTitleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Books, String> publishingDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Member, String> totalBorrowedBooksTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Books, String> authorTableColumn;
    @javafx.fxml.FXML
    private TableView<Books> bookTableView;
    @javafx.fxml.FXML
    private TableColumn<Member, String> borrowingDateTableColumn;
    @javafx.fxml.FXML
    private TextField bookTitleTextField;
    @javafx.fxml.FXML
    private Label librarianIDLabel;
    @javafx.fxml.FXML
    private Label librarianNameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void memberSearchOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bookSearchOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addNewMemberOnAction(Event event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader
                    = new FXMLLoader(HelloApplication.class.getResource("member-view.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            stage.setTitle("Load Course From File");
            stage.setScene(nextScene);
            stage.show();
        }
        catch (Exception e){
            //
        }
    }
}