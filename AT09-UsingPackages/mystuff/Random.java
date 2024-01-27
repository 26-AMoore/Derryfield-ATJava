package mystuff;

public class Random {
	public static int getRandomInteger(int highest) {
		int random = (int)(Math.random() * highest + 1);
		return random;
	}
}
