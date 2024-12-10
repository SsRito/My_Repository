module com.sauharda.oop_projects.kazioffice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.sauharda.oop_projects.kazioffice to javafx.fxml;
    exports com.sauharda.oop_projects.kazioffice;
}