import java.util.Scanner;

public class MakeTextEfficient {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String phrase;

		System.out.println("Please give me a phrase: ");
		phrase = in.nextLine();
		for (int i = 0; i < phrase.length(); i = i + 2) {
			System.out.print(phrase.charAt(i));
		}
		System.out.println("");
	}
}

/*Write a program that asks the user for a phrase and then prints only the characters in the phrase 
 * that have an index of zero or an even number.  For example, the phrase "Susan" would be printed as "Ssn". 
 * The phrase "Hello There!" would be printed as "HloTee".*/

