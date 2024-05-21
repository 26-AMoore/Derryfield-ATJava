package org.animate;
import javax.swing.JPanel;

import org.animate.Projectile.STATE;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Board extends JPanel implements KeyListener {
	private int magnitude = 1;
	private final int WIDTH = 1280;
	private final int HEIGHT = 720;
	private Cannon cannon = new Cannon(15, 640);
	private Projectile ball = new Ball();
	private Timer timer;
	private final int INITIAL_DELAY = 0;
	private final int PERIOD_INTERVAL = 32;
	private Graphics2D g2d;

	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setFocusable(true);
		this.addKeyListener(this);
		cannon.setBounds(0, -90);
		cannon.boundSet = true;
		cannon.setR(-45);
		step();
		ball.setState(STATE.IDLE);
	}

	public void step() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new ScheduledUpdate(),
				INITIAL_DELAY, PERIOD_INTERVAL);
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g2d = (Graphics2D) g;

		g2d.setColor(Color.BLACK);
		Rectangle rect = new Rectangle(0, HEIGHT - 25, WIDTH, 2);
		Shape shape = (Shape)rect;
		g2d.fill(shape);

		g2d.drawString(Integer.toString(magnitude), 10, 10);
		g2d.drawString("X: " + ball.getX() + "XV: " + ball.getVelocityX() + "Y " + ball.getY() + "YV " + ball.getVelocityY(), 10, 30);
		g2d.drawString(ball.getState().toString(), 10, 40);

		g2d.setColor(Color.GREEN);
		rect = new Rectangle(0, HEIGHT - 22, WIDTH, HEIGHT - 25);
		shape = (Shape)rect;
		g2d.fill(shape);
		ball.draw(g2d);
		cannon.draw(g2d);
	}

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_RIGHT -> cannon.setR(cannon.getR()+magnitude);
			case KeyEvent.VK_LEFT -> cannon.setR(cannon.getR()-magnitude);
			case KeyEvent.VK_UP -> magnitude += 1;
			case KeyEvent.VK_DOWN -> magnitude -= 1;
			case KeyEvent.VK_SPACE -> cannon.fire(ball);
			case KeyEvent.VK_R -> ball.setState(STATE.IDLE);
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}
	private class ScheduledUpdate extends TimerTask {
		public void run() {
			if (ball.getState() == STATE.FLYING) {
				if (ball.getY() >= HEIGHT - 50) {
					ball.setState(STATE.BOOMED);
				}
				ball.step();
			}
			repaint();
		}
	}
}

