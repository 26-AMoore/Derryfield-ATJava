import java.util.Scanner;

public class SortingInts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1;
		double num2;
		double num3;

		double firstnum = 0;
		double lastnum = 0;
		double midnum = 0;


		System.out.println("Please give three inputs: ");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		num3 = in.nextDouble();

		if (num1 >= num2 && num1 >= num3) {
			firstnum = num1;
		}
		if (num2 >= num1 && num2 >= num3) {
			firstnum = num2;
		}
		if (num3 >= num2 && num3 >= num1) {
			firstnum = num3;
		}


		if (num1 <= num2 && num1 <= num3) {
			lastnum = num1;
		}
		if (num2 <= num1 && num2 <= num3) {
			lastnum = num2;
		}
		if (num3 <= num2 && num3 <= num1) {
			lastnum = num3;
		}


		if ( firstnum > num1 && num1 > lastnum) {
			midnum = num1;
		}
		if ( firstnum > num2 && num2 > lastnum) {
			midnum = num2;
		}
		if ( firstnum > num3 && num3 > lastnum) {
			midnum = num3;
		}
		System.out.println(firstnum+" "+midnum+" "+lastnum);
	}
}
