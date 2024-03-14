import mow.*;
public class MowerShowcase {
	public static void main(String[] args) {
		Yard yard = new Yard(10, 10);
		Mower mower = new Mower(0, 0, Mower.DIRECTION.NORTH);
		yard.showYard(mower);
	}
}
