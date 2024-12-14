module com.ngo_project.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ngo_project.project to javafx.fxml;
    exports com.ngo_project.project;
}