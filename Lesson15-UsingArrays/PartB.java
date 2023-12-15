import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		int[] array = new int[20];
		int count = 0;
		String helper = "z";
		Scanner in = new Scanner(System.in);

		do {
			System.out.print("Please enter a integer value or q to quit: ");
			if (in.hasNextInt()) {
				array[count] = in.nextInt();
				count++;
			} else {
				helper = in.next();
	 	}
			if (helper.charAt(0) == 'q' || helper.charAt(0) == 'Q') {
				System.out.println("end");
				break;
			}
		} while (in.hasNext() && count < array.length); 
		for (int i = 0; i < count; i++) {
			System.out.print(array[i]+", ");
		}
	}
}
