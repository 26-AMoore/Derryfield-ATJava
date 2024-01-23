import java.util.Scanner;
public class getavg {
	public static double avg(double a, double b) {
		return (a + b) / 2;
	}

	public static void main(String[] args) {
		double num1 = 7;
		double num2 = 5;
		Scanner in = new Scanner(System.in);

		System.out.println("Please give me two numbers: ");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		System.out.println(avg(num1, num2));
	}
}
