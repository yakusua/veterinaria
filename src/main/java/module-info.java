module org.example.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.example.veterinaria;


    opens org.example.veterinaria to javafx.fxml;
    exports org.example.veterinaria;
}