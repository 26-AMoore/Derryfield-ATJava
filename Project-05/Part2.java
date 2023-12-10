import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] digits = new int[5];
		String end ="|";
		int total = 0;
		System.out.println("What is the postal code?");
		int toParse = in.nextInt();
		digits[4] = toParse % 10;
		digits[3] = toParse % 100 / 10;
		digits[2] = toParse % 1000 / 100;
		digits[1] = toParse % 10000 / 1000;
		digits[0] = toParse % 100000 / 10000;

		for (int i = 0; i < 5; i++) {
			total += digits[i];
		}
		for (int i = 0; i < digits.length; i++) {
			end = end + encode(digits[i]);
		}
		System.out.println(end+encode(total%10)+"|");
	}

	public static String encode(int input) {
		String encodeded = switch (input) {
			//wtf postal service, just use binary
			case 1 -> ":::||";
			case 2 -> "::|:|";
			case 3 -> "::||:";
			case 4 -> ":|::|";
			case 5 -> ":|:|:";
			case 6 -> ":||::";
			case 7 -> "|:::|";
			case 8 -> "|::|:";
			case 9 -> "|:|::";
			case 0 -> "||:::";
			default -> "XXXXX";
			};
		return encodeded;
	}
}
