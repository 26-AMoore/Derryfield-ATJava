

public class DiceRolling {
	static enum dienum {ONE, TWO, THREE, FOUR, FIVE, SIX}
	static dienum rolledNum;
	static double whatWasRolled;
    public static void main(String[] args){
		dice.roll();
		System.out.println(rolledNum);
		if (rolledNum == dienum.ONE){
		System.out.printf("   %n * %n   %n");
		}
		if (rolledNum == dienum.TWO){
		System.out.printf("*  %n   %n  *%n");
		}
		if (rolledNum == dienum.THREE){
		System.out.printf("*  %n * %n  *%n");
		}
		if (rolledNum == dienum.FOUR){
		System.out.printf("* *%n   %n* *%n");
		}
		if (rolledNum == dienum.FIVE){
		System.out.printf("* *%n * %n* *%n");
		}
		if (rolledNum == dienum.SIX){
		System.out.printf("* *%n* *%n* *%n");
		}
    }


	class dice {
	    public static dienum roll(){
	        System.out.println("Rolling the die");
			whatWasRolled = Math.random();		
			if (whatWasRolled <= .16666666666){
			rolledNum = dienum.ONE;
			} else if (whatWasRolled <= .333333333){
			rolledNum = dienum.TWO;
			} else if (whatWasRolled <= .5){
			rolledNum = dienum.THREE;
			} else if (whatWasRolled <= .666666666){
			rolledNum = dienum.FOUR;
			} else if (whatWasRolled <= .833333333){
			rolledNum = dienum.FIVE;
			} else if (whatWasRolled <= 1) {
			rolledNum = dienum.SIX;
			}  
			return(rolledNum);
		}
	}
}

/*Part D: AT Students Only - Simulate Dice Roll
Write a program that simulates the roll of a six sided die:
Use the Math.random() function to simulate the roll.
Display the outcome using an ASCII representation of the die.
Represent the die with a class.
Optional: Can you figure out how to play tones for your die roll?
 */
