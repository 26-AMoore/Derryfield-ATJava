package org.animate;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Cannon extends JPanel {
	private int x;
	private int y;
	private int r;
	private int v;
	private BufferedImage img;

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
		SoundClip wheel = new SoundClip("media/wheel.wav");
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

	public void setR(int r) {
		this.r = r;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
