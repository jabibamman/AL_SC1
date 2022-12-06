package com.example.al_intro;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button welcomeButton;

    @FXML
    private TextField nameInput;

    @FXML
    private ImageView welcomeGif;

    private static final String welcomeMessage = "Welcome to JavaFX Application %s!";

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("");
        welcomeGif.setVisible(false);

        if(nameInput.getText().isEmpty()) {
            welcomeText.setText(String.format(welcomeMessage, ""));
        } else {
            welcomeText.setText(String.format(welcomeMessage, ", " + nameInput.getText()));
            welcomeGif.setVisible(true);
            System.out.println("Hello " + nameInput.getText());
        }

    }

}