package ru.gb.chat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea tipArea;
    @FXML
    private TextField tipText;

    @FXML
    protected void onButtonClick() {
        final String answer = tipText.getText();
        if (answer != null && !answer.isEmpty()) {
            tipArea.appendText(answer + "\n");
        }
        tipText.clear();
    }
}