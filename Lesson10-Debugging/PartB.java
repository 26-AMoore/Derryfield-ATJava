import java.util.Scanner;
public class PartB {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of cookies: ");
		int num = in.nextInt();
		double discount = 0;

		if (num > 12) {
			discount = 0.10;
		} else if (num > 6) {
			discount = 0.05;
		}
		System.out.println("Discount = " + discount);
	}
}

//Compliation error, double was capitalized and discount had a chance to not be set
//Logic error, should put num > 12 first, or it will always return 0.05 instead
