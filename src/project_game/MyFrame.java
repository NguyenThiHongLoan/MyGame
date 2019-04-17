package project_game;

import javax.swing.JFrame;

import project_game.model.MockMap;

public class MyFrame extends JFrame {
	SingleMatch sgMatch;

	public MyFrame() {
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 600);
	}

	public MyFrame(SingleMatch sgMatch) {
		this();
		this.sgMatch = sgMatch;
		add(sgMatch);
	}

	public static void main(String[] args) {

		new MyFrame(new SingleMatch(new MockMap()));
	}
}
