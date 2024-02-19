import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("inputFiles/characters.txt");
		Scanner in = new Scanner(input).useDelimiter("");
		int charcount = 0;
		int digitCount = 0;

		while (in.hasNext()) {
        	char c = in.next().charAt(0);
    		System.out.print(c);
			if (Character.isDigit(c)) {
				digitCount++;
			} else if (Character.isLetter(c)) {
				charcount++;
			}

		}
		System.out.println("digits  " + digitCount);
		System.out.println("letters " + charcount);
		System.out.println("count " + (digitCount + charcount));
	}
}
