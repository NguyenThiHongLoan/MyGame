package project_game.model;

import java.awt.Graphics;
import java.util.List;

public abstract class AGameMap {

	protected List<AShape> resultShapes, questionShapes;
	
	public AGameMap() {
		super();
	}

	public void draw(Graphics g) {
		resultShapes.forEach(s -> s.draw(g));
		questionShapes.forEach(s -> s.draw(g));
	}

}
