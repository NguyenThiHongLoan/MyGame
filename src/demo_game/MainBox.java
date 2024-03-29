package demo_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MainBox extends JPanel implements ActionListener {
	private Timer timer;
	private final int DELAY = 10;
	private Box box;

	public MainBox() {
		setFocusable(true);
		setBackground(Color.RED);
		box = new Box();
		MyAdapter adapter = new MyAdapter(box);
		addKeyListener(adapter);
		timer = new Timer(DELAY, this);
		timer.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(box.getImage(), box.getX(), box.getY(), this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		box.move();
		repaint();
	}

}
