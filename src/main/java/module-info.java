module com.example.java_giorgi_lasurashvili {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_giorgi_lasurashvili to javafx.fxml;
    exports com.example.java_giorgi_lasurashvili;
}