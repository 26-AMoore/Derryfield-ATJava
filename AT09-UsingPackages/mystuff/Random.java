package mystuff;

public class Random {
	public static int getRandomInteger(int highest) {
		return (int)((Math.random() * highest) + 1);
	}
}
