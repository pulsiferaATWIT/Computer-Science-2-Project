package gui;

//import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;

public class Paddle {
	final static int LENGTH = 10;
	Tile[] tiles = new Tile[LENGTH];
	
	public Paddle(double x, double y, Pane root, Color color) {
		for (int i = 0; i < LENGTH; i++) {
			tiles[i] = new Tile(x, y);
			y += 10;
			tiles[i].setFill(color);
			root.getChildren().add(tiles[i]);
		}
	}
	
	
	
	public void movePaddle(int deltaY) {
		for (Tile t : tiles)
			t.move(0, deltaY);
		
		if (tiles[0].getY() < 0)
			this.movePaddle(0 - (int) tiles[0].getY()); 
		
		if (tiles[0].getY() > 500)
			this.movePaddle(500 - (int) tiles[0].getY());
	}
}
