module com.example.modul3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modul3 to javafx.fxml;
    exports com.example.modul3;
}