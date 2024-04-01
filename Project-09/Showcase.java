import java.util.Scanner;
import org.derryfield.toys.Magic8Ball;

public class Showcase {
	public static void main(String[] args) {
		Magic8Ball ball = new Magic8Ball();
		Scanner in = new Scanner(System.in);
		boolean takingInput = true;

		while (takingInput) {
			System.out.println("(R)ead, r(O)ll, (Q)uit");
			switch (in.next().charAt(0)) {
				case 'R' -> System.out.println(ball.read());
				case 'O' -> ball.roll();
				case 'Q' -> takingInput = false;
				default -> System.out.println("Invalid char, please retry");
			}
		}
		System.out.println("Thanks for playing! :)");
	}
}
