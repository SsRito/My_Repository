module com.sauharda.oop_projects.courseproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sauharda.oop_projects.courseproject to javafx.fxml;
    exports com.sauharda.oop_projects.courseproject;
}