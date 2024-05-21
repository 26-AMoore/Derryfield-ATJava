package org.animate;

import java.awt.Graphics;

public interface Projectile {
	public void draw(Graphics g);
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public void setVelocityX(int vx);
	public int getVelocityX();
	public void setVelocityY(int vy);
	public int getVelocityY();
	public void setAccelerationX(int ax);
	public void setAccelerationY(int ay);
	public int getAccelerationX();
	public int getAccelerationY();
	public void step();
	public void setState(STATE s);
	public STATE getState();

	public enum STATE {
		IDLE,
		FLYING,
		BOOMED
	}

}
