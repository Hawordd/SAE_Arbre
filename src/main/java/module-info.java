module com.example.arbre {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arbre to javafx.fxml;
    exports com.example.arbre;
}