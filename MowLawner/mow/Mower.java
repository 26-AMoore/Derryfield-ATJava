package mow;
public class Mower {
	public boolean finished = false;
	private int x;
	private int y;
	public enum DIRECTION {NORTH, EAST, SOUTH, WEST};
	private DIRECTION facing = DIRECTION.NORTH;

	public Mower(int X, int Y, DIRECTION dir) {
		DIRECTION facing = dir;
		int x = X;
		int y = Y;
	} public Mower() {int x = 0; int y = 0; DIRECTION facing = DIRECTION.NORTH;}

	public DIRECTION getDirection() {
		return facing;
	}
	public void setDirection(DIRECTION dir) {
		facing = dir;
	}
	public int getXPos() {
		return x;
	}
	public int getYPos() {
		return y;
	}
	public void setPos(int X, int Y) {
		x = X;
		y = Y;
	}
	public char getInfront(Yard yard) {
		char infront;
		int frontY = switch (facing) {
			case NORTH -> y-1;
			case SOUTH -> y+1;
			default -> y;
		};
		int frontX = switch (facing) {
			case EAST -> x+1;
			case WEST -> x-1;
			default -> x;
		};
		infront = yard.getPos(frontX, frontY);
		return infront;
	}
	public void turnLeft() {
		facing = switch (facing) {
			case NORTH -> DIRECTION.WEST;
			case WEST -> DIRECTION.SOUTH;
			case SOUTH -> DIRECTION.EAST;
			case EAST -> DIRECTION.NORTH;
		};
	}
	public void turnRight() {
		facing = switch (facing) {
			case NORTH -> DIRECTION.EAST;
			case EAST -> DIRECTION.SOUTH;
			case SOUTH -> DIRECTION.WEST;
			case WEST -> DIRECTION.NORTH;
		};
	}
	public void drive(int distance) {
		switch (facing) {
			case NORTH -> y+=distance;
			case SOUTH -> y-=distance;
			case EAST -> x+=distance;
			case WEST -> x-=distance;
		};
	} public void drive() {
		int distance = 1;
		switch (facing) {
			case NORTH -> y-=distance;
			case SOUTH -> y+=distance;
			case EAST -> x+=distance;
			case WEST -> x-=distance;
		};
	}

	private int turns;
	public void cutSpiralRight(Yard yard) {
		yard.mow(this.x, this.y);

		switch (this.getInfront(yard)) {
			case '+' -> this.drive();
			case 'R' -> this.turnRight();
			case ' ' -> this.turnRight();
		};
		switch (this.getInfront(yard)) {
			case ' ' -> turns++;
			case 'R' -> turns++;
			case '+' -> turns = 0;
		};
		if (turns == 4) {
			finished = true;
		}
	}
	public void cutSpiralLeft(Yard yard) {
		yard.mow(this.x, this.y);

		switch (this.getInfront(yard)) {
			case '+' -> this.drive();
			case 'R' -> this.turnLeft();
			case ' ' -> this.turnLeft();
		};
		switch (this.getInfront(yard)) {
			case ' ' -> turns++;
			case 'R' -> turns++;
			case '+' -> turns = 0;
		};
		if (turns == 4) {
			finished = true;
		}
	}

	private void left(Yard yard) {
		yard.mow(x, y);
		this.turnLeft();
		this.drive();
		this.turnLeft();
	}
	private void right(Yard yard) {
		yard.mow(x, y);
		this.turnRight();
		this.drive();
		this.turnRight();
	}

	private int getCorner(Yard yard) {
		if (x == 0 && y == 0) {
			return 0;
		} else if (x == yard.width() - 1 && y == 0) {
			return 1;
		} else if (x == 0 && y == yard.height() - 1) {
			return 2;
		} else if (x == yard.width() - 1 && y == yard.height() - 1) {
			return 3;
		} else {return -1;}
	}

	public void cutLinear(Yard yard) {
		boolean lastTurnRigth = false;
		int corner = getCorner(yard);
		
		while (!finished) {
			if (this.getInfront(yard) == '+') {
				yard.mow(x, y);
				this.drive();
			} else {
				if (lastTurnRigth) {
					this.left(yard);
				} else {
					this.right(yard);
				}
				lastTurnRigth = !lastTurnRigth;
			}
		}
	}
}
