import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Notes {
	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("scores.txt");
		Scanner in = new Scanner(inputfile);
		double score = 0;

		while (in.hasNext()) {
			score = in.nextDouble();
			System.out.printf("%.2f%n", score);
		}
		in.close();
	}
}
