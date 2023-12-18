import java.util.Scanner;

public class PartA {
	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("What number would you like to add?");

			if (in.next() != "q" && in.next() != "Q") {
				array[i] = in.nextInt();
			}
		}
		for (int i : array) {
			System.out.println(array[i]);
		}
		
	}
}
//take 10 inputs or Q to quit, print 1*4*2*4*0*2 THEN sort and print 0, 1, 2, 2, 4, 4
