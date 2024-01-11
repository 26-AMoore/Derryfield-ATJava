import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		String helper;
		boolean isTakingInput = true;
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
		removeOdd(array);
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
	public static void removeOdd(ArrayList<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) %2 != 0) {
				array.remove(i);
			}
		}
	}
}
