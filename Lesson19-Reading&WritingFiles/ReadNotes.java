import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadNotes {
	public static void main(String[] args) throws FileNotFoundException {
		File inputfile = new File("scores.txt");
		File outputFile = new File("scoresFormatted.txt");
		Scanner in = new Scanner(inputfile);
		double score = 0;

		PrintWriter out = new PrintWriter(outputFile);

		while (in.hasNext()) {
			score = in.nextDouble();
			out.printf("%.2f%n", score);
		}
		out.close();
		in.close();
	}
}
