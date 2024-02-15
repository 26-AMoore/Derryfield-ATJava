import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
	}

	public static int GetQuizScores(Scanner in) {
		int num = 0;
		try {
			num = Integer.valueOf(in.nextInt());
			return num;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			throw e;
		}
	}
}
