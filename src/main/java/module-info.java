module com.example.javabasico {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasico to javafx.fxml;
    exports com.example.javabasico;
}