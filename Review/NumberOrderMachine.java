import java.util.Scanner;

public class NumberOrderMachine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double prevNum = 0;
		double newNum;
		Boolean isOrderedUp = false;
		Boolean isOrdered = false;
		Boolean isOrderedDown = false;

		System.out.println("Please write the numbers out");

		prevNum = in.nextInt();
		newNum = in.nextInt();

		if (prevNum > newNum) {
			isOrderedDown = true;
		} else if (prevNum < newNum) {
			isOrderedUp = true;
		}

		prevNum = newNum;
		newNum = in.nextInt();

		if (isOrderedUp) {
			if (prevNum < newNum){
				isOrdered = true;
			}

		} else if (isOrderedDown) {

			if (prevNum > newNum){
				isOrdered = true;
			}

		} 
		if (isOrdered) {
			System.out.println("The list is ordered");
		} else if (!isOrdered) {
			System.out.println("The list is not ordered");
		}
	}
}
