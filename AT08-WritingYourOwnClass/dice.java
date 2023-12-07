import java.util.Scanner;

public class dice {
	public static void main(String[] args) {
		boolean isGaming = true;
		Die die = new Die();
		int whatToDo;
		Scanner in = new Scanner(System.in);

		System.out.println("Pick a number, or type any other character to exit");
		do {
			System.out.println("What would you like to do: ");
			System.out.println("1) Roll the die");
			System.out.println("2) Read the die");
			System.out.println("3) Draw the die");
			System.out.println("4) Set the die sides");
			System.out.println("5) Read the die sides");
			System.out.println("6) clear the screen");

			if (in.hasNextInt()) {
				whatToDo = in.nextInt();
				switch (whatToDo) {
					case 1:
						die.roll();
						System.out.println("You have succesfully rolled the die");
						break;
					case 2: 
						System.out.println("You rolled a "+die.getValue());
						break;
					case 3: 
						die.draw();
						break;
					case 4: 
						System.out.println("What would you like to set the side count to: ");
						die.setSides(in.nextInt());
						break;
					case 5: 
						System.out.println("The current die is a d"+die.getSides());
						break;
					case 6:
						System.out.print("\033[H\033[2J");
					default:
						System.out.println("That is not a valid number, Please retry");
				}
			} else {isGaming = false;}
		} while (isGaming);
		System.out.println("Thank you for playing");
	}
}

class Die {
	//member vars
	private int value; //the value of the die
	private double sides; //the amount of sies on the die 	//Idk why but this needs to be a double or the roll always returns 0
	
	//constructers
	public Die(int i, int sides) {
		//set the die value to one
		this.value = i;
		this.sides = sides;
	}
	Die() {this.value = 1; this.sides = 6;}

	//methods
	public int getValue(){
		return value;
	}
	
	public void setValue(int newValue){
		//set to only valid values
		if (newValue <= sides && newValue > 0) {
			value = newValue;
		}
	}

	public int setSides(int i){
		sides = i;
		return 1;
	} 
	public int setSides() {
		sides = 6;
		return 0;
	}
	public int getSides() {
		return (int)sides;
	}

	public void draw() {
		if (value == 1){
			System.out.printf("   %n * %n   %n");
		}
		if (value == 2){
			System.out.printf("*  %n   %n  *%n");
		}
		if (value == 3){
			System.out.printf("*  %n * %n  *%n");
		}
		if (value == 4){
			System.out.printf("* *%n   %n* *%n");
		}
		if (value == 5){
			System.out.printf("* *%n * %n* *%n");
		}
		if (value == 6){
			System.out.printf("* *%n* *%n* *%n");
		}
		else {
			System.out.println("Nope, I'm not drawing that number");
		}
	}

	public void roll() {
		double seed = Math.random();
		for (int i = 0; i < sides; i++) {
			if (seed > 1 / (sides) * i && seed < 1 / sides * (i + 1)) {
				this.value = i;
			}
			//double first  = 1 / (sides) * i;
			//double second = 1/sides * (i+1);
			//System.out.println("done");
			//System.out.println("first: "+first + "	i: " + i);
			//System.out.println("last: "+second + "	sides: "+ sides);
		}
	}
}
