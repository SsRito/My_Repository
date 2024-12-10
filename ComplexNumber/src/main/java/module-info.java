module com.sauharda.oop_projects.complexnumber {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sauharda.oop_projects.complexnumber to javafx.fxml;
    exports com.sauharda.oop_projects.complexnumber;
}