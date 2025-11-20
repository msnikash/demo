module com.flowpane {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.flowpane to javafx.fxml;
    exports com.flowpane;
}
