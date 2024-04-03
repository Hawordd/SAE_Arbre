module com.example.arbre {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.arbre to javafx.fxml;
    exports com.example.arbre;
}