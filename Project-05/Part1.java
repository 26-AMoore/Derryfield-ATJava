import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		String first;
		String second;
		boolean found = false;
		boolean isEqual = false;
		String smallerOne = "yeeeHaw";
		Scanner in = new Scanner(System.in);
		String firstPart;
		String secondPart;
		
		System.out.println("What is the first section name?");
		first = in.next();
		System.out.println("What is the second section name?");
		second = in.next();
		firstPart = first;
		secondPart = second;
		while (!found) {
			if (firstPart == "null" && secondPart == "null") {
				System.out.println("They are the same");
				isEqual = true;
				break;
			}
			if (firstNum(firstPart) > firstNum(secondPart)) {
				smallerOne = second;
				found = true;
			} else if (firstNum(secondPart) > firstNum(firstPart)) {
				smallerOne = first;
				found = true;
			} else {
				firstPart = getNext(firstPart);
				secondPart = getNext(secondPart);
			}
		}
		if (!isEqual) {
			System.out.println("The first section is "+ smallerOne);
		}
	}
	public static int firstNum(String sec1) {
		for (int i = 0; i < sec1.length(); i++) {
			if (sec1.charAt(i) == '.') {
				return Integer.valueOf(sec1.substring(0, i));
			} else if (i == sec1.length()-1) {
				return Integer.valueOf(sec1);
			}
		}
		return 0;
	}
	public static String getNext(String sec) {
		for (int i = 0; i < sec.length(); i++) {
			if (sec.charAt(i) == '.') {
				return sec.substring(i+1, sec.length());
			} else if (i == sec.length()) {
				return "same";
			}
		}
		return "null";
	}

}
