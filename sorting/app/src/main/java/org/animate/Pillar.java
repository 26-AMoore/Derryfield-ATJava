package org.animate;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * Pillar
 */
public class Pillar extends JPanel {

	private int height;
	private int place;
	public static int maxHeight;
	private Color color;

	public Pillar(String hexColor, int place, int height) {
		color = Color.decode(hexColor);
		this.height = height;
		this.place = place;
		
	}

	public void drawPillar(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(color);
		g2d.fillRect(place * 3, maxHeight - height, 3, maxHeight);
	}

	public static void setMaxHeight(int height) {
		maxHeight = height;
	}

	public static int getMaxHeight() {
		return maxHeight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public int getHeight() {
		return height;
	}

	public int getPlace() {
		return place;
	}
}
