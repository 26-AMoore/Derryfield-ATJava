import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountChars {
	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File("InputFiles/countInput.txt");
		Scanner in = new Scanner(inputFile).useDelimiter("");
		Character c; 
		int charCount = 0;

		while (in.hasNext()) {
			c = in.next().charAt(0);
			charCount++;
			if (c.isDigit()) {
				
			}
		}
		System.out.println(charCount);
		in.close();
	}
}
