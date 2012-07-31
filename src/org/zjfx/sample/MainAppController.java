package org.zjfx.sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.converter.IntegerStringConverter;
import org.zjfx.Attribute;
import org.zjfx.ModelController;

public class MainAppController extends ModelController {

    @FXML
    @Attribute
    private Label title;

    @FXML
    @Attribute(converter = IntegerStringConverter.class)
    private TextField text;
}
