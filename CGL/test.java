public class test {
	public static boolean[][] board;
	public static int[][] test;
	public static void main(String[] args) {
		System.out.println(args.toString());
		int col = Integer.valueOf(args[1]) / 2;
		board = new boolean[Integer.valueOf(args[2]) - 1][col];
		test = new int[Integer.valueOf(args[2]) - 1][col];

		fill();
		while (true) {
			clear();
			show();
			eval(Double.valueOf(args[0]));
			try {
				Thread.sleep(150);
			} catch (Exception e) {
				System.out.println("nope");
			}
		}
	}
	public static void mutate(Integer chance) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (Math.random() < chance/100) {
					board[i][j] = !board[i][j];
				}
			}
		}
	}
	public static void fill() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (Math.random() > .5) {
					board[i][j] = true;
				}
			}
		}
	}
	public static void eval(double chance) {
		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {
				test[i][j] = surrounding(i, j);
			}
		}
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] == 3) {
					board[i][j] = true;
				} else if (test[i][j] == 2 && board[i][j]) {
					board[i][j] = true;
				} else if (test[i][j] == 2 && !board[i][j]) {
					if (chance > 0) {
						if (Math.random() * chance < 1 / chance) {
							board[i][j] = true;
						}
					}
				} else {
					board[i][j] = false;
				}
			}
		}
	}
	public static void show() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print((!board[i][j])? "  " : "⬜");
			}
			System.out.println("");
		}
	}
	public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
	}
	public static int surrounding(int x, int y) {
		int count = 0;
		if (board[x+1][y+1]) {
			count++;
		} if (board[x][y+1]) {
			count++;
		} if (board[x-1][y+1]) {
			count++;
		} if (board[x+1][y]) {
			count++;
		} if (board[x-1][y]) {
			count++;
		} if (board[x+1][y-1]) {
			count++;
		} if (board[x][y-1]) {
			count++;
		} if (board[x-1][y-1]) {
			count++;
		}
		return count;
	}
}
