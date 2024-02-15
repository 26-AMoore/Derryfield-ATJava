import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gdp {
	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("InputFiles/gdpInput.txt");
		Scanner line = new Scanner(inputFile);
		while (line.hasNext()) {
			Scanner parser = new Scanner(line.next()).useDelimiter("[;]");
			String name = parser.next();
			long gdp = Long.valueOf(parser.next().replaceAll(",", ""));
			int place = parser.nextInt();
			String reigon = parser.next();

			System.out.printf("Rank %d | %s | $%,24.2d | %-20s%n", place, name, gdp, reigon);
		}
	}
}
