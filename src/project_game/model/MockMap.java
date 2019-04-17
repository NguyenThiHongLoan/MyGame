package project_game.model;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;

public class MockMap extends AGameMap {

	public MockMap() {
		super();
		AShape parall1 = new Parallelogram(521, 201, 600, 280, 160, 0, Color.GRAY);

		AShape tri1 = new Triagle(520, 200, 240, 45, Color.GRAY);
		AShape tri2 = new Triagle(355, 370, 240, 225, Color.GRAY);
		AShape tri3 = new Triagle(760, 280, 113, 225, Color.GRAY);
		AShape tri4 = new Triagle(760, 280, 160, 90, Color.GRAY);
		AShape tri5 = new Triagle(840, 360, 115, 135, Color.GRAY);

		AShape square1 = new Square(355, 370, 120, 135, Color.GRAY);

		resultShapes = Arrays.asList(parall1, tri1, tri2, tri3, tri4, tri5, square1);
		
		questionShapes = Collections.emptyList();
		

	}

}
