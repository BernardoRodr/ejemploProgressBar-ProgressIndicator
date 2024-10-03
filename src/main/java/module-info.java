module com.example.ejemploprogressbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemploprogressbar to javafx.fxml;
    exports com.example.ejemploprogressbar;
}