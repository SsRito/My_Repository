module com.sauharda.oop_projects.studentproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sauharda.oop_projects.studentproject to javafx.fxml;
    exports com.sauharda.oop_projects.studentproject;
}