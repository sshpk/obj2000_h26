package no.usn.forelesning12.backup;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersjon = System.getProperty("java.version");
        String fxVersjon = System.getProperty("javafx.version");
        Label tekst = new Label("Hei! JavaFX " + fxVersjon + " på Java " + javaVersjon);

        stage.setScene(new Scene(new StackPane(tekst), 400, 200));
        stage.setTitle("HelloFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}