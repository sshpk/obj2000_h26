package no.usn.forelesning12.backup;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WelcomeApp extends Application{

	@Override
	public void start(Stage stage){
		Label label = new Label("Velkomen til biblioteket");
		Button button = new Button("Trykk her");
		
		VBox root = new VBox(10);
		root.setPadding(new Insets(20));
		root.getChildren().addAll(label, button);
		
		stage.setScene(new Scene(root, 350,150));
		stage.setTitle("Biblioteket");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
