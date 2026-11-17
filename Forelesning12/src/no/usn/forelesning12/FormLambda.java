package no.usn.forelesning12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FormLambda extends Application{

	private TextField titleField = new TextField();
	private TextField pagesField = new TextField();
	private Label status = new Label();
	@Override
	public void start(Stage stage) throws Exception {
		// Bygg layout GridPane
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20));
		
		// Bygg den første linja med ledende tekst og en TextField for å ta imot titel
		grid.add(new Label("Titel:"), 0, 0);
		grid.add(titleField, 1, 0);
		
		// Bygg den andre linja...
		grid.add(new Label("Sider:"), 0, 1);
		grid.add(pagesField, 1, 1);
		
		Button addButton = new Button("Legg til");
		addButton.setOnAction(e -> status.setText("Lagt til: "+titleField.getText()));
		grid.add(addButton, 1, 2);
		
		grid.add(status, 1, 3);
		
		// Lag scene og legg den til vinduet
		stage.setScene(new Scene(grid, 340, 200));
		stage.setTitle("Ny bok");
		
		// vis vinduet
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
