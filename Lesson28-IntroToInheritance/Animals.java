import zoo.*;

public class Animals {
	public static void main(String[] args) {
		Mammal john = new Mammal("john", 100);
		MarineMammal ella = new MarineMammal("ella", 60);
		Bovine carl = new Bovine("carl", 400);
		System.out.println(carl.getName() + " " + carl.getWeight());
		System.out.println(ella.getName() + " " + ella.getWeight());
		System.out.println(john.getName() + " " + john.getWeight());
		carl.feedHay(100);
		ella.feedFish(30);
		john.hashCode();
		System.out.println(carl.getName() + " " + carl.getWeight());
		System.out.println(ella.getName() + " " + ella.getWeight());
		System.out.println(john.getName() + " " + john.getWeight());
	}
}
