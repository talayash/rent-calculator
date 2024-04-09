module com.example.rentfinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.rentfinal to javafx.fxml;
    exports com.example.rentfinal;
}