package project_game.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Square extends AShape {
	int squareEdge;

	public Square(int x, int y, int squareEdge, int swivelAngle, Color color) {
		super(x, y, swivelAngle, color);
		this.squareEdge = squareEdge;
	}

	@Override
	public void draw(Graphics graph) {
		Graphics2D graph2D = (Graphics2D) graph.create();
		graph2D.setColor(color);
		getRotate(graph2D);
		graph2D.fillRect(x, y, squareEdge, squareEdge);

	}

}
