module com.sauharda.oop_projects.studentprofile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sauharda.oop_projects.studentprofile to javafx.fxml;
    exports com.sauharda.oop_projects.studentprofile;
}