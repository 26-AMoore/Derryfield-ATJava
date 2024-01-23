import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		int targetCount = 0;
		int[] array = new int[20];
		int count = 0;
		String helper;
		Scanner in = new Scanner(System.in);
		boolean isTakingInput = true;
		int target;

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
			System.out.print(array[i]+", ");
		}
		System.out.println("Enter the target number: ");
		target = in.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				targetCount++;
			}
		}
		System.out.println("The target appears " + targetCount + " times");
	}
}
