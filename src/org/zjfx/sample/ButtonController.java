package org.zjfx.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.zjfx.ModelController;

public class ButtonController extends ModelController {

    @FXML
    protected void submit(ActionEvent event) {
        System.out.println("Submit: " + model.getInteger("text"));
    }
}
