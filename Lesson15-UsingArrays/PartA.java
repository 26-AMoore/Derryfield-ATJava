import java.util.Arrays;
import java.util.Scanner;

public class PartA {
	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner in = new Scanner(System.in);
		boolean isTakingInput = true;
		String helper;
		int count = 0;

		do {
			System.out.print("What number would you like to add, or Q to quit: ");
			helper = in.next();
			if (helper.equals("q") || helper.equals("Q")) {
				isTakingInput = false;
				break;
			} else {
				if (count < array.length) {
					array[count] = Integer.valueOf(helper);
					count++;
				}
			}
		} while (isTakingInput && count < array.length);
		for (int i = 0; i < count; i++) {
			System.out.printf("*%d", array[i]);
		} System.out.print("*");
		System.out.println("");

		Arrays.sort(array);
		for (int i = array.length - 1; i > 9 - count; i--) {
			if (i != 9 - count + 1) {
				System.out.printf("%d,", array[i]);
			} else {
				System.out.printf("%d", array[i]);
			}
		}
		System.out.println("");
	}
}
