module com.example.user_interface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.user_interface to javafx.fxml;
    exports com.example.user_interface;
}