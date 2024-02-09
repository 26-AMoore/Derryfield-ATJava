import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class notes {
	public static void main(String[] args) {
		Scanner inKeyboard = new Scanner(System.in);
		boolean fileFound = false;
		String name = args.toString().trim();

		while (!fileFound) {
			try {
				File input = new File(name);
				Scanner in = new Scanner(input);
				while (in.hasNext()) {
					System.out.println(in.next());
				}
				in.close();
				break;
			} catch (FileNotFoundException exception) {
				System.out.println("HEY STUPID, THATS NOT A FILE, GIVE ME THE RIGHT ONE 󱚝");
				name = inKeyboard.next();
			}
		}
		inKeyboard.close();
	}
}
