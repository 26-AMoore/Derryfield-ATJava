package org.animate;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Cannon extends JPanel {
	private int x;
	private int y;
	private int r;
	private int maxR;
	private int minR;
	private final int HYPOT = 70;
	public boolean boundSet = false;
	private BufferedImage img;
	private SoundClip wheel;
	private Ball ball = new Ball();

	public Cannon(int x, int y) {
		loadResources();
		this.x = x;
		this.y = y;
	}

	public Image render() {
		return img;
	}

	private void loadResources() {
		File cannon = new File("media/sm_cannon.png");
		wheel = new SoundClip("media/wheel.wav");
		SoundClip boom = new SoundClip("media/cannon.wav");
		try {
			img = ImageIO.read(cannon);
			System.out.println("loaded");
		} catch (Exception e) {
			System.out.println("uh oh");
			System.err.println(e.getMessage());
		}
		wheel.open();
		boom.open();
	}

	public void draw(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D) g;
			
		AffineTransform affineTransform = new AffineTransform();
		affineTransform.translate(x, y);
		affineTransform.rotate(Math.toRadians(r), 15, img.getHeight() / 2);
		g2d.drawImage(img, affineTransform, null);
		g2d.setColor(Color.BLACK);
		int[] xpoints = {x - 10, x + 15,x + 40};
		int[] ypoints = {y + 60, y + img.getHeight() / 2, y + 60};
		g2d.fillOval(x + 10, y + img.getHeight() / 2 - 5, 10, 10);
		Polygon p = new Polygon(xpoints, ypoints, 3);
		g2d.drawPolygon(p);
		g2d.setColor(Color.pink);
		g2d.fillPolygon(p);
		fire();
		ball.draw(g2d);
		g2d.drawString(Integer.toString(r * -1), 10, 20);
		g2d.setColor(Color.black);
		for (int k = 0; k <= 90; k++) {
			g2d.fillRect(Math.abs((int)((x + 600) + (Math.cos(Math.abs(k)) * HYPOT))), Math.abs((int)((y / 2) - (Math.sin(Math.abs(k)) * HYPOT))), 1, 1);
	}
	}

	public void fire() {
		ball.setVelocityX((int)Math.cos(-1*r));
		ball.setVelocityY((int)Math.sin(-1*r));
		ball.setState(Projectile.STATE.FLYING);
		ball.setX(Math.abs((int)((x + 15) + (Math.cos(Math.abs(r)) * HYPOT))));
		ball.setY(Math.abs((int)((y + img.getHeight() / 2) - (Math.sin(Math.abs(r)) * HYPOT))));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public void setBounds(int maxR, int minR) {
		this.maxR = maxR;
		this.minR = minR;
	}

	public void setR(int r) {
		if (r <= maxR && r >= minR && boundSet) {
			this.r = r;
			wheel.play();
		}
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
