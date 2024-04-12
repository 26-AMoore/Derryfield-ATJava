import java.util.ArrayList;
import java.util.Scanner;

//idea: make array of entire expression, then pemdas and then write it to that spot in the array
public class Bcalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = 0, y = 0;
		char operation = ' ';
		ArrayList<String> problem = new ArrayList<String>();
		boolean inputting = true;

		while (inputting) {
			String add = in.next();
			problem.add(add);
			System.out.println(problem.toString());
			if (add.charAt(0) == '=') {
				inputting = false;
			}
		}

	}

	public static double calculate(double x, double y, char operation) {
		return switch (operation) {
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
