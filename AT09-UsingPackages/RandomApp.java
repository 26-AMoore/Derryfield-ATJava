import mystuff.Random;

public class DemoApp {
	public static void main(String[] args) {
		int number = Random.getRandomInteger(7);
		System.out.println("The random integer is " + number);
	}
}
