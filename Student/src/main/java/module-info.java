module com.sauharda.oop_projects.student {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sauharda.oop_projects.student to javafx.fxml;
    exports com.sauharda.oop_projects.student;
}