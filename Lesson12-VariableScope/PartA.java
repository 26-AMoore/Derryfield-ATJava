import java.util.Scanner;
public class PartA {
	public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("What is your first name? ");
    String input = in.next();

    System.out.println("Hello, " + input);
    System.out.print("How old are you? ");
	//int input = in.nextInt();
    int age = in.nextInt(); //duplicate variable input, on the first one its a String and on the second its an int to fix i switched it to age
	//input++; was original
    age++; //had to replace this too
    System.out.println("Next year, you will be " + age);
	}
}
