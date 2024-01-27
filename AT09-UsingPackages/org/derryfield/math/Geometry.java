package org.derryfield.math;

public class Geometry {
	public static double sphereVolume(double radius) {
		return (double)(4/3) * Math.PI * Math.pow(radius, 3);
	}
	public static double sphereArea(double radius) {
		return 4 * Math.PI * radius * radius;
	}
}
