package mow;
public class Yard {
	private char[][] yard;
	public Yard(int i, int j) {
		yard = new char[i + 2][j + 2];
		fillYard();
	} Yard() {yard = new char[12][12]; }

	private char[][] fillYard() {
		for (int i = 0; i < yard.length; i++) {
			for (int j = 0; j < yard[i].length; j++) {
				if (i == 0 || i == yard.length - 1 || j == 0 || j == yard[i].length - 1) {
					yard[i][j] = 'R';
				} else {
					yard[i][j] = '+';
				}
			}
		}
		return yard;
	}

	public void showYard(Mower mow) {
		for (int i = 0; i < yard.length; i++) {
			for (int j = 0; j < yard[i].length; j++) {
				if (mow.getXPos() == j - 1 && mow.getYPos() == i - 1) {
					switch (mow.getDirection()) {
						case NORTH -> System.out.print("^");
						case EAST -> System.out.print(">");
						case SOUTH -> System.out.print("v");
						case WEST -> System.out.print("<");
					}
				} else {
					System.out.print(yard[i][j]);
				}
			}
			System.out.println();
		}
	}

	public int height() {
		return yard.length - 2;
	}

	public int width() {
		return yard[0].length - 2;
	}

	public void mow(int x, int y) {
		if (yard[y + 1][x + 1] != 'R') {
			yard[y+ 1][x + 1] = ' ';
		}
	}

	public void regrow() {
		yard = fillYard();
	}

	public char getPos(int x, int y) {
		return yard[y + 1][x + 1];
	}
}
