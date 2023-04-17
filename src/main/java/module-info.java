module com.example.master2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.master2 to javafx.fxml;
    exports com.example.master2;
}