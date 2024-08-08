module sample.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.app to javafx.fxml;
    exports sample.app;
}