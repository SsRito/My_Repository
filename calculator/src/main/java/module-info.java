module com.sauharda.tutorial_two.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sauharda.tutorial_two.calculator to javafx.fxml;
    exports com.sauharda.tutorial_two.calculator;
}