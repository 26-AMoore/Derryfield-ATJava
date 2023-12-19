import java.util.Scanner;

public class PartA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] array = new double[200];
		int count = 0;
		String helper;
		boolean isTakingInput = true;
		do {
			System.out.print("Please type your quiz grade, or Q to quit: ");
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
		} while (isTakingInput);

		for (int i = 0; i < count; i++) {
			System.out.println("Quiz " + i + "'s score: " + array[i]);
		}

		System.out.println("Your avrage is: " + avg(array) + ", would you like to drop your lowest score? (y,n)");
		helper = in.next();
		if (helper.equals("y") || helper.equals("Y")) {
			dropLowest(array, count);
			System.out.println("Your new avrage is: " + avg(array));
		} else {
			System.out.println("Okay, your grade is still " + avg(array));
		}
	}
	public static double avg(double[] array) {
		double avrage;
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		avrage = total / array.length;
		return avrage;
	}
	public static void dropLowest(double[] array, int count) {
		double lowest = array[0];
		int lowestLocation = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < lowest) {
				lowest = array[i];
				lowestLocation = i;
			}
		}
		array[lowestLocation] = array[count];
	}
}

/*
 *Scan in quiz scores from the user until the user enters 'q' to quit
Print the quiz scores in a neat manner for the user to review
Ask the user if they would like to drop the lowest score (type 'y' to do so)
If the user wants to drop the lowest score, use a method to drop the lowest score from the array of doubles and then reprint the scores with the lowest value removed
If there are more than one quiz with the same lowest score, only drop the first instance of the score
Preserve the order of the remaining test scores as you drop the lowest score
 */
