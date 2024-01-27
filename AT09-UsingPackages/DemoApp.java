import java.util.Scanner;
import org.derryfield.math.Geometry;

public class DemoApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius;
		System.out.println("Please input the radius of the sphere: ");
		radius = in.nextDouble();
		System.out.println("The Area of that sphere is " + Geometry.sphereArea(radius));
		System.out.println("The Volume of that sphere is " + Geometry.sphereVolume(radius));
	}
}
