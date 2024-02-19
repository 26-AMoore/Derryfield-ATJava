import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = in.nextInt();
	}

	public static int GetQuizScores(int age) {
		if (age >= 1) {
			return age;
		} else {
			ArithmeticException e = new ArithmeticException();
			throw e;
		}
	}
}
