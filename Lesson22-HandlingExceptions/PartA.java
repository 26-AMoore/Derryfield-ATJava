import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
	public static void main(String[] args) {
		Scanner inKeyboard = new Scanner(System.in);
		boolean fileFound = false;
		System.out.println("What is the file you would like to read? or # to quit");
		String name = inKeyboard.next();

		while (!fileFound && !name.trim().equals("#")) {
			try {
				File input = new File(name);
				Scanner in = new Scanner(input);
				while (in.hasNext()) {
					System.out.println(in.next());
				}
				in.close();
				break;
			} catch (FileNotFoundException exception) {
				System.out.println("Error: that file is not found, please put the correct file name:");
				name = inKeyboard.next();
			}
		}
		System.out.println("Thank you, and goodbye");
		inKeyboard.close();
	}
}
