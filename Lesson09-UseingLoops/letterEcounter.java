import java.util.Scanner;
public class letterEcounter {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String sentance;
		int Es = 0;

		System.out.printf("Give me your sentance please: ");
		sentance = in.nextLine();
		for (int i = 0; i <= sentance.length() - 1; i++) {
			if (sentance.charAt(i) == 'e'){
				Es++;
			} 
		}
		System.out.println("There are "+ Es +" E's in that sentance");
	}
}
