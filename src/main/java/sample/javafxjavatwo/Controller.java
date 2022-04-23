package sample.javafxjavatwo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    TextArea mainTextArea;

    @FXML
    Button btn;



    public void btnClickAction(ActionEvent actionEvent) {
        actionEvent.getSource();// ссылка на кнопку
        mainTextArea.appendText("pressed\n");
    }
}