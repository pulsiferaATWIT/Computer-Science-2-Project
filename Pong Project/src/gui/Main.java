package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
//import javafx.scene.shape.Rectangle;
//import javafx.event.EventHandler;
//import javafx.event.ActionEvent;

// Testing

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane root = new Pane();
		Scene scene = new Scene(root, 1000, 600);
		scene.setFill(Color.BLACK);

		Tile ball = new Tile(200, 200);
		ball.setFill(Color.WHITE);
		root.getChildren().add(ball);
		
		Paddle p1 = new Paddle(850, 250, root, Color.WHITE);

		scene.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case W: p1.movePaddle(-5); break;
			case S: p1.movePaddle(5); break;
			default: break;
			}
		});

		primaryStage.setTitle("Pong");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
