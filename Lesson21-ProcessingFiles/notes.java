import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class notes {
	public static void main(String[] args) throws FileNotFoundException {
		/*
		File inputFile = new File("/home/xela/software/Derryfield-ATJava/Lesson21-ProcessingFiles/InputFiles/input.txt");
		Scanner in = new Scanner(inputFile);

		while (in.hasNextLine()) {
			String line = in.nextLine();
			int i = 1;

			while (Character.isDigit(line.charAt(i - 1)) == false) {
				i++;
			}

			String name = line.substring(0, i).trim();
			int population = Integer.valueOf(line.substring(i, line.length() - 1).trim());
	 	}
		*/

		File obesityinput = new File("/home/xela/software/Derryfield-ATJava/Lesson21-ProcessingFiles/InputFiles/ObesityInput.txt");
		Scanner obesityIn = new Scanner(obesityinput);

		while (obesityIn.hasNextLine()) {
			Scanner obesityLine = new Scanner(obesityIn.nextLine()).useDelimiter("[,\\n]+");
			String name = obesityLine.next().trim();
			double percentage = Double.valueOf(obesityLine.next().trim());
			String reigon = obesityLine.next().trim();

			System.out.printf("name : %s percent : %f : reigon : %s%n", name, percentage, reigon);
		}
	}
}
