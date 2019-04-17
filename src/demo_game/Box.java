package demo_game;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Box {

	private int x;
	private int y;
	private int dx;
	private int dy;
	private Image image;
	private final int SPEED = 1;

	public Box() {
		ImageIcon imageIcon = new ImageIcon("src/image_game/confesti.jpg");
		image = imageIcon.getImage();
		x = 50;
		y = 50;
	}

	void move() {
		x += dx;
		y += dy;

	}

	public Image getImage() {
		return image;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_UP:
			dy = -1;
			break;
		case KeyEvent.VK_DOWN:
			dy = 1;
			break;
		case KeyEvent.VK_LEFT:
			dy = -1;
			break;
		case KeyEvent.VK_RIGHT:
			dy = 1;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_UP:
			dy = 0;
			break;
		case KeyEvent.VK_DOWN:
			dy = 0;
			break;
		case KeyEvent.VK_LEFT:
			dx = 0;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 0;
			break;
		}
	}

}

class MyAdapter extends KeyAdapter {
	private Box box;

	public MyAdapter(Box box) {
		this.box = box;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		box.keyPressed(e);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		box.keyReleased(e);
	}
}