package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.input.KeyCode;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
//import javafx.event.EventHandler;
//import javafx.event.ActionEvent;

// Testing

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();
		Scene scene = new Scene(root, 600, 400);
		scene.setFill(Color.BLACK);

		Tile t1 = new Tile(200, 200);
		t1.setFill(Color.LIME);
		root.getChildren().add(t1);

		scene.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case W: t1.move(0, -5); break;
			case S: t1.move(0, 5); break;
			case A: t1.move(-5, 0); break;
			case D: t1.move(5, 0); break;
			default: break;
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
