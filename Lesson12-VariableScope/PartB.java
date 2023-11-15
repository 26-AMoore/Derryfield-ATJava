import java.util.Scanner;
public class PartB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a;
		double b;
		double c;
		double smallest;

		System.out.println("please give values for a, b, and c");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();

		smallest =  smallest(a, b, c);
		System.out.println("the smallest one is "+ smallest);
	}
	public static double smallest(double a, double b, double c) {
		if (a < b && a < c) {
			return a;
		} else if (b < c && b < a) {
			return b;
		} else if (c < b && c < a) {
			return c;
		} else {
			return 0;
		}
	}
}
