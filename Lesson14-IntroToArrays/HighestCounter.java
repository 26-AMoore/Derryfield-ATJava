import java.util.Scanner;
public class PartA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		int highest = 0;
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("NEW NUM:");
			nums[i] = in.nextInt();
			if (i == 0 || nums[i] > highest) {
				highest = nums[i];
			}
		}

		System.out.print("\033[H\033[2J");
		System.out.flush();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (nums[i] == highest) {
				System.out.print(" <== This one \n");
			} else {
				System.out.print("\n");
			}
		}
	}
}
