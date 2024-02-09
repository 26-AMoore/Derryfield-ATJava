import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
	public static void main(String[] args) throws FileNotFoundException {

		File unemploymentinput = new File("InputFiles/unemploymentInput.txt");
		Scanner unemploymentIn = new Scanner(unemploymentinput);

		while (unemploymentIn.hasNextLine()) {
			Scanner unemploymentLine = new Scanner(unemploymentIn.nextLine()).useDelimiter("[,\\n]+");
			String name = unemploymentLine.next().trim();
			double percentage = Double.valueOf(unemploymentLine.next().trim());
			String rank = unemploymentLine.next().trim();
			String reigon = unemploymentLine.next().trim();
			System.out.println(reigon);

			System.out.printf("Ranked # %s: %s | %4.2f% | %s ", rank, name, percentage, reigon);
		}
	}
}
