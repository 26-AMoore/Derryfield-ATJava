import java.util.Scanner;

public class Part3 {
	public static void main(String[] args) {
		boolean helping = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a size for the board");
		int size = in.nextInt();
		int[][] array = new int[size][size];
		boolean playing = true;
		int player = 0;
		int winner = 0;
		boolean inputting = true;
		String helper = "null";
		int otherHelper;
		boolean flipptyflop = true;
		int turns = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}
		while (playing) {
			if (flipptyflop) {
				player++;
			}
			clearScreen();
			System.out.println("It is player " + ((player == 1) ? "One's" : "Two's") + " turn");
			if (player == 2) {
				player = 0;
			}
			System.out.println("Please input where you would like to play, or help for help: ");
			draw(array);
			if (helping) {
				System.out.println("input a number to place your piece there");
				rules(array);
				helping = false;
			}
			do {
				if (turns == size * size) {
					inputting = false;
					playing = false;
					winner = 3;
				}
				if (playing) {
					helper = in.next();
				}
				if (helper.equals("help")) {
					helping = true;
				} else if (Integer.valueOf(helper) <= size * size && Integer.valueOf(helper) >= 1) {
					//this is a weird bit of code, but it translates the single digit given into the coordiants on the array
					otherHelper = Integer.valueOf(helper) - 1;
					if (array[otherHelper / size][otherHelper % size] == 0) {
						if (player == 1) {
							array[otherHelper / size][otherHelper % size] = 1;
						} else if (player == 0) {
							array[otherHelper / size][otherHelper % size] = (-1);
						}
						inputting = false;
						flipptyflop = true;
						turns++;
					} else {
						System.out.println("hey, someone already played there, try your luck somewhere else");
						flipptyflop = false;
					}
					winner = checkWin(array);
					if (winner != 0) {
						playing = false;
					}
				} else {
					System.out.println("Input is not valid, please try again");
				}

			} while (inputting);
		}
		clearScreen();
		draw(array);
		if (winner == 1) {
			System.out.println("Player one won");
		} else if (winner == 2) {
			System.out.println("Player two won");
		} else if (winner == 3) {
			System.out.println("You tied");
		} else {
			System.out.println("You found the secret ending, I have no idea how you did, but you did.");
		}
	}

	public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
	public static void draw(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0) {
					System.out.print(".");
				} else if (array[i][j] == 1) {
					System.out.print("X");
				} else if (array[i][j] == (-1)) {
					System.out.print("O");
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	public static void rules(int[][] prevarray) {
		int digits;
		int[][] array = new int[prevarray.length][prevarray.length];
		int num = 1;

		digits = (int)(Math.floor(Math.log10(array[0][0]) + 1)); //Thank you math stack exchange
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i >= digits) {
					digits = i;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%" + digits +"d",array[i][j]);
			}
			System.out.println("");
		}
	}
	public static int checkWin(int[][] array) {
		int total = 0;
		int winner = 0;
		for (int i = 0; i < array.length; i++) { //for checking if a row has a win
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
			}
			winner = evaltotal(total, array);
			total = 0;
		}
		if (winner != 0) {
			return winner;
		}
		for (int i = 0; i < array.length; i++) { //if a colum has a win
			for (int j = 0; j < array[i].length; j++) {
				total += array[j][i];
				System.out.println(array[j][i] + "   " + total);
			}
			System.out.println("---------------");
			winner = evaltotal(total, array);
			total = 0;
			if (winner != 0) {
				return winner;
			}
		}
		total = 0;
		for (int i = 0; i < array.length; i++) { //if a diagnal from top left to bottom right
			total += array[i][i];
		}
		winner = evaltotal(total, array);
		if (winner != 0) {
			return winner;
		}
		total = 0;
		for (int i = 0; i < array.length; i++) { //if a diagnal from bottom left to top right
			total += array[array.length-1-i][i];
		}
		winner = evaltotal(total, array);
		total = 0;
		return winner;
	}
	public static int evaltotal(int total, int[][] array) {
		int winner = 0;
		if (total == array.length) {
			winner = 1;
		} else if (total == -1* array.length) {
			winner = 2;
		} else {
			total = 0;
		}
		return winner;
	}
}
