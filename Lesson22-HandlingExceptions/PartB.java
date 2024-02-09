import java.io.File;
import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Scanner in;
		try {
			File input = new File("birthyears.txt");
			in = new Scanner(input).useDelimiter("[,\\s]+");
		} catch (Exception e) {
			System.out.println("The file was not found :(");
			in = new Scanner(System.in);
		}
		String name;
		int age;

		while (in.hasNext()) {
			name = in.next();
			try {
				age = Integer.parseInt(in.next());
				System.out.println(name + "'s birthday is " + age);
			} catch (Exception e) {
				System.out.println("I do not know what year " + name + " was born");
			}
		}
		in.close();
	}
}
