package project_game.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Parallelogram extends AShape {
	private static final int PARALLELOGRAM_POINT = 4;
	int adge, x1, y1;

	public Parallelogram(int x, int y, int x1, int y1, int adge, int swivelAngle, Color color) {
		super(x, y, swivelAngle, color);
		this.adge = adge;
		this.x1 = x1;
		this.y1 = y1;
	}

	@Override
	public void draw(Graphics graph) {

		Graphics2D graph2D = (Graphics2D) graph.create();

		int[] xPoints = { x, x + adge, x1 + adge, x1 };
		int[] yPoints = { y, y, y1, y1 };

		graph2D.setColor(color);
		graph2D.fillPolygon(xPoints, yPoints, PARALLELOGRAM_POINT);
	}

}
