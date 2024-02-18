import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Counter cake = new Counter();
		Counter pie = new Counter();
		boolean inputting = true;
		String helper;

		while (inputting) {
			System.out.println("Do you like cake, or pie better? (c/p/Q)");
			helper = in.next();

			if (helper.trim().equalsIgnoreCase("p")) {
				pie.increase();
			} else if (helper.trim().equalsIgnoreCase("c")) {
				cake.increase();
			} else {
				inputting = false;
			}
		}
		System.out.println("There were at total of " + cake.getCount() + " cake enjoyers, and " + pie.getCount() + " pie enjoyers");
	}
}
class Counter {
	private int count;

	public int getCount() {
		return count;
	}

	public void resetCount() {
		count = 0;
	}

	public void increase() {
		if (count < 9999) {
			count++;
		} else {
			count = 0;
		}
	}
}
