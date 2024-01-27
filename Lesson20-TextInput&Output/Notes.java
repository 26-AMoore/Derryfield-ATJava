import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Notes {
	public static void main(String[] args) throws FileNotFoundException {
		File outputFile = new File("OutputFiles/NotesOutput.txt");
		File inputFile = new File("InputFiles/poem.txt");
		PrintWriter output = new PrintWriter(outputFile);
		Scanner in = new Scanner(inputFile).useDelimiter("[,.\\s\\t\\n]+"); //also can use [^A-Za-z0-9]
		int words = 0;
		while (in.hasNext()) {
			System.out.println(in.next());
			words++;
		}
		System.out.println(words + " words");
		in.close();
		output.close();
	}
}
