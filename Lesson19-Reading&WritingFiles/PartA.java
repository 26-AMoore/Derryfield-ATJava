import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
	public static void main(String[] args) throws FileNotFoundException{
		File input = new File("InputFiles/temps.txt");
		Scanner in = new Scanner(input);
		ArrayList<Integer> temps = new ArrayList<Integer>();
		int coldest;


		while (in.hasNext()) {
			temps.add(in.nextInt());
		}
		coldest = whatCold(temps);
		for (int i = 0; i < temps.size(); i++) {
			System.out.print(temps.get(i));
			if (temps.get(i) == coldest) {
				System.out.print(" <== Lowest");
				System.out.println("");
			} else {
				System.out.println("");
			}
		}
		in.close();
	}
	public static int whatCold(ArrayList<Integer> array) {
		int coldest = array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (coldest >= array.get(i)) {
				coldest = array.get(i);
			}
		}
		return coldest;
	}
}
