package no.usn.forelesning12;

import java.util.Collections;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LibraryApp extends Application {
    private ObservableList<Book> books = FXCollections.observableArrayList();
    private ListView<Book> listView = new ListView<>(books);
    private TextField titleField = new TextField();
    private ComboBox<Genre> genreBox = new ComboBox<>();
    private TextField pagesField = new TextField();
    private Label status = new Label("Velkommen!");

    @Override
    public void start(Stage stage) {
        books.add(new Book("Stormen", Genre.ROMAN, 350));
        books.add(new Book("Mørkt vann", Genre.KRIM, 280));
        books.add(new Book("Havet", Genre.FAKTA, 200));
        books.add(new Book("Trollskogen", Genre.BARN, 120));

        genreBox.getItems().addAll(Genre.values());
        genreBox.setValue(Genre.ROMAN);

        Button addButton = new Button("Legg til");
        Button sortButton = new Button("Sorter");
        addButton.setOnAction(e -> addBook());
        sortButton.setOnAction(e -> Collections.sort(books));

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(0, 0, 0, 15));
        form.add(new Label("Tittel:"), 0, 0);
        form.add(titleField, 1, 0);
        form.add(new Label("Sjanger:"), 0, 1);
        form.add(genreBox, 1, 1);
        form.add(new Label("Sider:"), 0, 2);
        form.add(pagesField, 1, 2);
        form.add(new HBox(10, addButton, sortButton), 1, 3);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15));
        root.setCenter(listView);
        root.setRight(form);
        root.setBottom(status);
        BorderPane.setMargin(status, new Insets(10, 0, 0, 0));

        stage.setScene(new Scene(root, 640, 300));
        stage.setTitle("Biblioteket");
        stage.show();
    }

    private void addBook() {
        try {
            String title = titleField.getText();
            int pages = Integer.parseInt(pagesField.getText().trim());
            books.add(new Book(title, genreBox.getValue(), pages));
            status.setText("Lagt til: " + title);
            titleField.clear();
            pagesField.clear();
        } catch (NumberFormatException e) {
            status.setText("Sider må være et heltall.");
        } catch (IllegalArgumentException e) {
            status.setText(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

