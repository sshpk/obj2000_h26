package no.usn.forelesning12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WelcomeApp extends Application{
	
	@Override
	public void start(Stage stage) {
		// 1. bygg noder
		Label label = new Label("Velkomen til biblioteket");
		Button button = new Button("Trykk her");
		
		// 2. lag treet med root
		VBox root = new VBox(10);
		root.setPadding(new Insets(20));
		
		// 3. putt nodene i treet
		root.getChildren().addAll(label, button);
		
		// 4. sett scenen med treet og titlen på vinduet
		stage.setScene(new Scene(root, 350, 150));
		stage.setTitle("Biblioteket");
		
		// 5. vis vinduet
		stage.show();	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
