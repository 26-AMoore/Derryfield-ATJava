import java.util.Scanner;

public class PartC {
	public static void main(String[] args) {
		int vowels;
		String input;
		Scanner in = new Scanner(System.in);

		System.out.println("Please input the String for me to count the vowels");
		input = in.nextLine();
		vowels = countVowels(input);
		System.out.println("There are "+ vowels+ " vowels in that String");
	}

	public static int countVowels(String a) {
		boolean IsItAVowel;
		int vowelCount = 0;
		for (int i = 0; i < a.length(); i++) {
			IsItAVowel = isVowel(a.charAt(i));
			if (IsItAVowel == true) {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public static boolean isVowel(char a) {
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			return true;
		} else {
			return false;
		}
	}
}
