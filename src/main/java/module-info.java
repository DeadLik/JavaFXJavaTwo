module sample.javafxjavatwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.javafxjavatwo to javafx.fxml;
    exports sample.javafxjavatwo;
}