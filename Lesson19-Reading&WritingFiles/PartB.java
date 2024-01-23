import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartB {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("InputFiles/quizzes.txt");
		File output = new File("OutputFiles/quizzesMod.txt");
		Scanner in = new Scanner(input);
		PrintWriter out = new PrintWriter(output);
		int i = 0;
		double total = 0;
		double helper;

		while (in.hasNext()) {
			i++;
			helper = in.nextDouble();
			out.printf("Quiz %03d:%7.2f%n", i, helper);
			total += helper;
		}
		out.println("----------------");
		out.printf("Average: %7.2f%n", total / i);
		out.close();
		in.close();
	}
}
