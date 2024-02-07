import java.io.File;
import java.util.Scanner;

public class PracticalProblem {
	public static void main(String[] args) {
		File input = new File("InputFiles/billionaires.txt");
		try {
			Scanner lineIn = new Scanner(input).useDelimiter("[\\n]+");
			while (lineIn.hasNext()) {
				String line = lineIn.next();
				Scanner in = new Scanner(line).useDelimiter("[;]+");
				String name = in.next().trim();
				double cash = Double.valueOf(in.next().replaceAll("\\$", "").replaceAll(",", "").trim());
				String country = in.next().trim();
				System.out.printf("%-16s : $ %,17.2f | $ %,17.2f | %s%n", name, cash, cash * 0.03, country);
			}
		} catch (Exception e) {
			System.out.println("There was an error");
			System.err.println(e);
		}
	}
}
