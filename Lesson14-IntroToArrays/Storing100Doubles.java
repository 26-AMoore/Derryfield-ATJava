import java.util.Scanner;

public class Storing100Doubles {
	public static void main(String[] args) {
		double[] nums = new double[1];
		Scanner in = new Scanner(System.in);
		int i = 0;
		
		do {
			System.out.print("What is your score: ");
			nums = addToArray(nums, in.nextDouble());
			i++;
		} while (i > 10);
		System.out.println("your avrage is " + avg(nums));
	}
	public static double avg(double[] nums) {
		double max=0;
		for (int i = 0; i < nums.length; i++) {
			max += nums[i];
		}
		return max / nums.length - 1;
	}
	public static double[] addToArray(double[] prev, double add) {
		double[] end = new double[prev.length + 1];
		for (int i = 0; i < prev.length; i++) {
			end[i] = prev[i];
		}
		end[end.length] = add;
		return end;
	}
}
