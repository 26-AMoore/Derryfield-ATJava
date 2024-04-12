import java.util.Scanner;

//idea: make array of entire expression, then pemdas and then write it to that spot in the array
public class Acalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x, y = 0;
		String operation = "";
		x = in.nextDouble();

		while (in.hasNext()) {
			operation = in.next();
			y = in.nextDouble();
			x = calculate(x, y, operation);

			System.out.println(x);
		}

		System.out.println(calculate(x, y, operation));

	}

	public static double calculate(double x, double y, String operation) {
		return switch (operation.charAt(0)) {
			case '+' -> x + y;
			case '-' -> x - y;
			case '/' -> x / y;
			case '*' -> x * y;
			case '^' -> Math.pow(x, y);
			case '%' -> x % y;
			default -> 0;
		};
	}
}
