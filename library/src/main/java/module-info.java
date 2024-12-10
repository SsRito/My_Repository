module com.sauharda.oop_projects.library {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sauharda.oop_projects.library to javafx.fxml;
    exports com.sauharda.oop_projects.library;
}