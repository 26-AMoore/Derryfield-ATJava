package org.animate;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Color;

public class Ball extends JPanel implements Projectile {
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int ax;
	private int ay;
	private int grav = 10;
	private Projectile.STATE state;
	private BufferedImage img;

	public Ball() {
		loadResources();
		x = 0;
		y = 0;
		vx = 0;
		vy = 0;
		ax = 0;
		ay = 0;
	}

	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLACK);
		if (this.state == Projectile.STATE.FLYING) {
			g2d.fillOval(x - 5, y - 5, 10, 10);
		} else if (this.state == Projectile.STATE.BOOMED) {
			AffineTransform afn = new AffineTransform();
			afn.translate(x-100, 675);
			g2d.drawImage(img, afn, null);
		}
	}

	private void loadResources() {
		File fire = new File("media/flame01.png");
		try {
			img = ImageIO.read(fire);
			System.out.println("FIRE");
		} catch (Exception e) {
			System.out.println("uh oh");
			System.err.println(e.getMessage());
		}
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getVelocityX() {
		return vx;
	}
	public void setVelocityX(int vx) {
		this.vx = vx;
	}
	public int getVelocityY() {
		return vy;
	}
	public void setVelocityY(int vy) {
		this.vy = vy;
	}
	public void step() {
//		System.out.println("stepped" + " " + vx + " " + vy);
		x += vx;
		y -= vy;
		vy -= grav;
	}
	public void setState(Projectile.STATE state) {
		this.state = state;
	}
	public STATE getState() {
		return this.state;
	}
	public void setAccelerationX(int ax) {
		this.ax = ax;
	}
	public void setAccelerationY(int ay) {
		this.ay = ay;
	}
	public int getAccelerationX() {
		return ax;
	}
	public int getAccelerationY() {
		return ay;
	}
}
