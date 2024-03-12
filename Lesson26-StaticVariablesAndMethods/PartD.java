import java.util.ArrayList;

public class PartD {
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			myArray.add(i);
		}
		System.out.println("before: " + myArray.toString());
		swaaaap.swap(myArray, 3, 8);
		System.out.println("after: " + myArray.toString());
	}
}
class swaaaap {
	public static void swap(ArrayList<Integer> array, int i, int j) {
		int buf = array.indexOf(i);
		array.set(i, j);
		array.set(j, buf);
	}
}
