package project_game.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class AShape {
	protected int x, y, swivelAngle;
	Color color;

	public AShape(int x, int y, int swivelAngle, Color color) {
		this.x = x;
		this.y = y;
		this.swivelAngle = swivelAngle;
		this.color = color;
	}

	public void getRotate(Graphics2D graph2D) {
		graph2D.rotate(Math.toRadians(swivelAngle), x, y);
	}

	public abstract void draw(Graphics graph);
}
