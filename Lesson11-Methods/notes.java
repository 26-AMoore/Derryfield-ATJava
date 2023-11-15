public class notes {
	
	public static int max(int x, int y) {
		int val;
		if (x > y) {
			val = x;
		} else {
			val = y;
		}
		return val;
	}
	public static void main(String[] args) {
		//without function
		int x = 10;
		int y = 5;
		int val;

		if (x > y) {
			val = x;
		} else {
			val = y;
		}
		System.out.println(val);

		x = 2;
		y = 4;
		if (x > y) {
			val = x;
		} else {
			val = y;
		}
		System.out.println(val);

		x = 7;
		y = -4;
		if (x > y) {
			val = x;
		} else {
			val = y;
		}
		System.out.println(val);


		//With function
		x = 10;
		y = 9;
		val = max(x, y);

		System.out.println(val);
	}
}
