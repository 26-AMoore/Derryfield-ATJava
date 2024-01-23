import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
	public static void main(String[] args) {
		ArrayList<Integer> temps = new ArrayList<Integer>();
		int coldest;
		String helper;
		boolean isTakingInput = true;
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("What temp would you like to add, or Q to quit: ");
			helper = in.next();
			if (helper.equals("q") || helper.equals("Q")) {
				break;
			} else {
				temps.add(Integer.valueOf(helper));
			}
		} while (isTakingInput);

		coldest = whatCold(temps);
		for (int i = 0; i < temps.size(); i++) {
			System.out.print(temps.get(i));
			if (temps.get(i) == coldest) {
				System.out.print(" <== Lowest");
				System.out.println("");
			} else {
				System.out.println("");
			}
		}
	}
	public static int whatCold(ArrayList<Integer> array) {
		int coldest = array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (coldest >= array.get(i)) {
				coldest = array.get(i);
			}
		}
		return coldest;
	}
}
