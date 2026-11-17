package no.usn.forelesning12.backup;

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

public class FormAnnon extends Application{
	private TextField titleField = new TextField();
	private TextField pagesField = new TextField();
	private Label status = new Label();

	@Override
	public void start(Stage stage) throws Exception {
		Button addButton = new Button("Legg til");
		addButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				status.setText("Lagt til: "+titleField.getText());
				
			}
		});

		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(20));
		grid.add(new Label("Title:"), 0, 0);//kolonne 0, rad 0
		grid.add(titleField, 1, 0);
		grid.add(new Label("Sider:"), 0, 1);
		grid.add(pagesField, 1, 1);
		grid.add(addButton, 1, 2);
		grid.add(status, 1, 3);

		stage.setScene(new Scene(grid, 340, 200));
		stage.setTitle("Ny bok");
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
