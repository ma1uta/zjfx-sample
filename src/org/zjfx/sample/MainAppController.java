package org.zjfx.sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.converter.IntegerStringConverter;
import org.zjfx.Attribute;
import org.zjfx.ModelController;

public class MainAppController extends ModelController {

    @FXML
    @Attribute(modelAttribute = "title", controlProperty = "text")
    private Label title;

    @FXML
    @Attribute(modelAttribute = "text", controlProperty = "text", converter = IntegerStringConverter.class)
    private TextField text;
}
