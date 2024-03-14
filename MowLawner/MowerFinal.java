import java.util.Scanner;
import mow.*;
import mow.Mower.DIRECTION;

public class MowerFinal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What dimensions would you like the yard to be?");
		Yard yard = new Yard(in.nextInt(), in.nextInt());
		Mower mower = new Mower();
		randomize(yard, mower);
		yard.showYard(mower);
		while (!mower.finished) {
			mower.cutSpiralRight(yard);
			yard.showYard(mower);
			sleep(100);
			clear();
		}
		mower.finished = false;
		yard.regrow();
		randomize(yard, mower);
		while (!mower.finished) {
			mower.cutSpiralRight(yard);
			yard.showYard(mower);
			sleep(100);
			clear();
		}
	}

	private static void randomize(Yard yard, Mower mower) {
		int corner = (int)(Math.random()*4);
		int direction = (int)(Math.random()*4);
		int x = switch (corner) {
			case 0 -> 0;
			case 1 -> 0;
			case 2 -> yard.width() - 1;
			case 3 -> yard.width() - 1;
			default -> -1;
		};
		int y = switch (corner) {
			case 0 -> 0;
			case 1 -> yard.height() - 1;
			case 2 -> yard.height() - 1;
			case 3 -> 0;
			default -> -1;
		};
		mower.setPos(x, y);
		mower.setDirection(switch (direction) {
			case 0 -> DIRECTION.NORTH;
			case 1 -> DIRECTION.EAST;
			case 2 -> DIRECTION.SOUTH;
			case 3 -> DIRECTION.WEST;
			default -> DIRECTION.NORTH;
		});
	}

	public static void clear() {
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}

	public static void sleep(int x) {
		try {
			Thread.sleep(x);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
