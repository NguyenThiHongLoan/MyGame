package project_game.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triagle extends AShape {
	private static final int TRIAGLE_POINT = 3;
	int edge;

	public Triagle(int x, int y, int edge, int swivelAngle, Color color) {
		super(x, y, swivelAngle, color);
		this.edge = edge;
	}

	@Override
	public void draw(Graphics graph) {

		Graphics2D graph2D = (Graphics2D) graph.create();
		graph2D.setColor(color);
		int[] xPoints = { x, x, x + edge };
		int[] yPoints = { y, y + edge, y };
		getRotate(graph2D);

		graph2D.fillPolygon(xPoints, yPoints, TRIAGLE_POINT);

	}

}
