import java.util.Scanner;

public class Ride {
	public static void main(String[] args) {
		GearedBicycle b = new GearedBicycle();
		Scanner in = new Scanner(System.in);
		boolean biking = true;
		while (biking) {
			b.display();
			System.out.println("Speed: " + b.getSpeed());
			System.out.println("Gear:  " + b.getGear());
			System.out.println("(P)edal, shift(U)p, shift(D)own, (B)reak, (Q)uit");
			switch (in.next().charAt(0)) {
				case 'P' -> b.pedal();
				case 'U' -> b.shiftUp();
				case 'D' -> b.shiftDown();
				case 'B' -> b.brake();
				case 'Q' -> biking = false;
			}
		}
	}
}
