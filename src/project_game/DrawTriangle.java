package project_game;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTriangle extends JFrame {

//		enter code here
	/** The Constant NUMBER_3. */
	private static final int NUMBER_3 = 3;

	/** The Constant EQUL_ANGLE. */
	private static final double EQUL_ANGLE = 1;

	/** The Constant TRIANGLE_POINTS. */
	private static final int TRIANGLE_POINTS = 3;

	/** The Constant _400. */
	private static final int SIZE = 400;

	/** The x points. */
	private int[] xPoints = new int[TRIANGLE_POINTS];

	/** The y points. */
	private int[] yPoints = new int[TRIANGLE_POINTS];

//	private int xInitial;
//
//	private int yInitial;

	/** The x. */
	private double x = EQUL_ANGLE;

	/** The new x. */
	private double newX;

	/** The new y. */
	private double newY;

	/**
	 * Instantiates a new draw triangle.
	 */
	public DrawTriangle() {
		super("Dimitry Rakhlei");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new DrawTrianglePanel());
		setSize(SIZE, SIZE); // you can change this size but don't make it HUGE!
		setVisible(true);
	}

	/**
	 * The Class DrawTrianglePanel.
	 */
	private class DrawTrianglePanel extends JPanel implements MouseListener, MouseMotionListener {

		/**
		 * Instantiates a new draw triangle panel.
		 */
		public DrawTrianglePanel() {
			addMouseListener(this);
			addMouseMotionListener(this);
		}

		/**
		 * Drawing the triangle.
		 *
		 * @param g the g
		 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
		 */
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			// DRAWING CODE HERE
			g.drawPolygon(xPoints, yPoints, 3);
			System.out.println("Paint called");
		}

		/**
		 * (non-Javadoc).
		 *
		 * @param e the e
		 * @see java.awt.event.MouseListener#mousePressed (java.awt.event.MouseEvent)
		 */
		public void mousePressed(MouseEvent e) {
			System.out.println("Mouse pressed called");
			e.getPoint();
			xPoints[0] = e.getPoint().x;
			yPoints[0] = e.getPoint().y;
			repaint();

		}

		/**
		 * (non-Javadoc).
		 *
		 * @param e the e
		 * @see java.awt.event.MouseListener#mouseReleased (java.awt.event.MouseEvent)
		 */
		public void mouseReleased(MouseEvent e) {
			System.out.println("Mouse released called");
		}

		/**
		 * (non-Javadoc).
		 *
		 * @param e the e
		 * @see java.awt.event.MouseMotionListener#mouseDragged
		 *      (java.awt.event.MouseEvent)
		 */
		public void mouseDragged(MouseEvent e) {
			System.out.println("Mouse dragged called");
			newX = e.getPoint().x;
			newY = e.getPoint().y;

			xPoints[1] = (int) newX;
			yPoints[1] = (int) newY;


			newX = xPoints[0] + (xPoints[1] - xPoints[0]) * Math.cos(Math.toRadians(45))
					- (yPoints[1] - yPoints[0]) * Math.sin(Math.toRadians(45));

			newY = yPoints[0] + (xPoints[1] - xPoints[0]) * Math.sin(x) + (yPoints[1] - yPoints[0]) * Math.cos(x);

			xPoints[2] = (int) newX;
			yPoints[2] = (int) newY;

//			newX = xPoints[0] + (xPoints[1] - xPoints[0]) * Math.cos(x) - (yPoints[1] - yPoints[0]) * Math.sin(x);
//
//			newY = yPoints[0] + (xPoints[1] - xPoints[0]) * Math.sin(x) + (yPoints[1] - yPoints[0]) * Math.cos(x);

//			xPoints[3] = (int) newX;
//			yPoints[3] = (int) newY;

			repaint();
		}

		/**
		 * (non-Javadoc).
		 *
		 * @param e the e
		 * @see java.awt.event.MouseListener#mouseEntered (java.awt.event.MouseEvent)
		 */
		public void mouseEntered(MouseEvent e) {
			System.out.println("Mouse Entered.");
		}

		/**
		 * (non-Javadoc).
		 *
		 * @param e the e
		 * @see java.awt.event.MouseListener#mouseExited (java.awt.event.MouseEvent)
		 */
		public void mouseExited(MouseEvent e) {
			System.out.println("Mouse exited.");
		}

		/**
		 * (non-Javadoc).
		 *
		 * @param e the e
		 * @see java.awt.event.MouseListener#mouseClicked (java.awt.event.MouseEvent)
		 */
		public void mouseClicked(MouseEvent e) {
		}

		/**
		 * (non-Javadoc).
		 *
		 * @param e the e
		 * @see java.awt.event.MouseMotionListener#mouseMoved
		 *      (java.awt.event.MouseEvent)
		 */
		public void mouseMoved(MouseEvent e) {
		}

	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new DrawTriangle();
	}

}
