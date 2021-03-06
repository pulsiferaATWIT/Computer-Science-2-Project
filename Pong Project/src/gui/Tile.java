package gui;

import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
	public Tile(double x, double y) {
		super(x, y,  10, 10);
	}
	
	public void move(int deltaX, int deltaY) {
		this.setX(this.getX() + deltaX);
		this.setY(this.getY() + deltaY);
		this.relocate(this.getX(), this.getY());
	}
}
