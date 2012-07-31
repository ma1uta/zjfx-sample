package org.zjfx.sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.stage.Stage;
import org.zjfx.ZWindow;

public class MainApp extends Application {

    public static void main(String[] args) {
        Application.launch(MainApp.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Model model = new Model();
        final MainWindow window = new MainWindow(stage, "Test model", model);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                window.getStage().show();
            }
        });
    }

    public static class MainWindow extends ZWindow<Model> {

        public MainWindow(Stage stage, String title, Model model) {
            super(stage, title, model);
        }

        @Override
        protected Node createForm() {
            return createForm("mainApp.fxml");
        }
    }
}
