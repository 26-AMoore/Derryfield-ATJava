import java.util.Scanner;

public class PartC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double vol;
		double r;
		System.out.println("What is the radius of the sphere? ");
		r = in.nextDouble();
		vol = spherize(r);
		System.out.println(vol);
	}
	public static double spherize(double r) {
		//vol = 3/4 * pi * r^3
		double vol;
		vol = (1.33 * Math.PI) * r * r * r;
		return vol;
	}
}

