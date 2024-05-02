package org.animate;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class Board extends JPanel implements KeyListener {
	private final int B_WIDTH = 1280;
	private final int B_HEIGHT = 720;

	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		this.addKeyListener(this);
		this.setFocusable(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.BLACK);
		Rectangle rect = new Rectangle(0, B_HEIGHT - 25, B_WIDTH, 2);
		Shape shape = (Shape)rect;
		g2d.fill(shape);

		g2d.setColor(Color.GREEN);
		rect = new Rectangle(0, B_HEIGHT - 22, B_WIDTH, B_HEIGHT - 25);
		shape = (Shape)rect;
		g2d.fill(shape);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_RIGHT -> System.out.println("RIGHT arrow was pressed");
			case KeyEvent.VK_LEFT -> System.out.println("LEFT arrow was pressed");
			case KeyEvent.VK_DOWN -> System.out.println("DOWN arrow was pressed");
			case KeyEvent.VK_UP -> System.out.println("UP arrow was pressed");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
