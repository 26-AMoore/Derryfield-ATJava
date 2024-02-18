import java.util.Scanner;

public class PartA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("What is your age?");
		int age = in.nextInt();
		System.out.println("Your name is " + name + " and your age is" + age);
	}
}
