package com.sauharda.oop_projects.library;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import java.util.ArrayList;

public class MemberView
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField enterNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Member, String> idTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Member, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableView<Member> memberTableView;

    ArrayList<Member> memberList;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("memberName"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Member, String>("memberID"));
    }

    @javafx.fxml.FXML
    public void addOnAction(ActionEvent actionEvent) {

        Member memberToBeAdded = new Member(
                enterNameTextField.getText(),
                Integer.parseInt(idTextField.getText())
        );

        memberTableView.getItems().add(memberToBeAdded);
        memberList.add(memberToBeAdded);
    }
}