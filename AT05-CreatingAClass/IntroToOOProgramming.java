import java.util.Scanner;

public class IntroToOOProgramming {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Dog theDog = new Dog();
		int input = 1;

		System.out.println("What is your dogs name?");
		theDog.setname(in.next());
		System.out.println("what is your dogs breed?");
		theDog.setbreed(in.next());
		while (input != 0) {
			System.out.println("");
			System.out.println("What would you like to do with your dog?");
			System.out.println("0)Stop");
			System.out.println("1)Pet "+theDog.name());
			System.out.println("2)Play with "+theDog.name());
			System.out.println("3)Feed "+theDog.name());
			System.out.println("4)Let "+theDog.name()+" sleep for a bit");
			input = in.nextInt();

			if (input == 1) {
				System.out.println("You pet "+theDog.name+" and they are happy!");
			} else if (input == 2) {
				System.out.println("You play with "+theDog.name+" they wag their tail a lot!");
			} else if (input == 3) {
				System.out.println("You feed "+theDog.name()+" they smile up at you!");
			} else if (input == 4) {
				System.out.println("You let "+theDog.name()+" sleep for a little while, but they want to play again now!");
			}
		}
		System.out.println("You are done having fun for now, hopefull you'll play again soon");
	}
}

class Dog {
	String name = "";
	String breed = "";
	int happieness = 0;

	public String name(){
		return name;
	}
	public void setname(String dogname){
		name = dogname;
	}
	public void setbreed(String dogbreed){
		breed = dogbreed;
	}
	public int showhappieness(){
		return happieness;
	}
	public String showbreed(){
		return breed;
	}
	public void pet() {
		happieness++;
	}
	public void play(){
		happieness = happieness + 3;
	}
	public void feed() {
		happieness = happieness + 5;
	}
	public void sleep() {
		happieness = happieness / 2;
	}
}
