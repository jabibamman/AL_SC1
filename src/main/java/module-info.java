module com.example.al_intro {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.al_intro to javafx.fxml;
    exports com.example.al_intro;
}