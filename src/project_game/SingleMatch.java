package project_game;

import java.awt.Graphics;

import javax.swing.JPanel;

import project_game.model.AGameMap;

public class SingleMatch extends JPanel {
	AGameMap single;

	public SingleMatch(AGameMap single) {
		super();
		this.single = single;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		single.draw(g);
	}

}
