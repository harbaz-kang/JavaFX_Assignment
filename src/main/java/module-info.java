module com.example.finalassignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.finalassignment to javafx.fxml;
    exports com.example.finalassignment;
}