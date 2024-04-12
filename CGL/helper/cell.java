package helper;
public class cell {
	private boolean state;
	private int x;
	private int y;
	public cell(boolean i, int inx, int iny) {
		state = i;
		x = inx; y = iny;
	} cell() {state = false; x = 0; y = 0;}

	public boolean getState() {
		return state;
	}
	public void toggle() {
		state = !state;
	}
}
