import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		String helper;
		Scanner in = new Scanner(System.in);
		boolean isTakingInput = true;
		ArrayList<Integer> array = new ArrayList<Integer>();
		int total = 0;
		do {
			System.out.print("What number would you like to add, or Q to quit: ");
			helper = in.next();
			if (helper.equals("q") || helper.equals("Q")) {
				isTakingInput = false;
				break;
			} else {
				array.add(Integer.valueOf(helper));
			}
		} while (isTakingInput);

		for (int i = 0; i < array.size(); i++) {
			if (i % 2 == 0) {
				total += array.get(i);
			} else if (i % 2 != 0) {
				total -= array.get(i);
			}
		}
		System.out.println(total);
	}
}
