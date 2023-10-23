module com.example.demo_konvert {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_konvert to javafx.fxml;
    exports com.example.demo_konvert;
}