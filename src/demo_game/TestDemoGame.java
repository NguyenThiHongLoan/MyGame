package demo_game;

import javax.swing.JFrame;

public class TestDemoGame extends JFrame {
	public TestDemoGame() {
		add(new MainBox());
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TestDemoGame();
	}
}
