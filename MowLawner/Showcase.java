import mow.Yard;
public class Showcase {
	public static void main(String[] args) {
		Yard yard = new Yard(10, 10);
		yard.showYard();
		System.out.println(yard.height());
		System.out.println(yard.width());
		System.out.println(yard.getPos(5, 5));
		yard.mow(5, 5);
		yard.getPos(5, 5);
		yard.showYard();
	}
}
