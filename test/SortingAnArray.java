import java.util.Arrays;

public class SortingAnArray {
	public static void main(String[] args) {
		int[] orig = new int[5];
		for (int i = 0; i < orig.length; i++) {
			orig[i] = (int)(Math.random()*100);
		}
		for (int i = 0; i < orig.length; i++) {
			System.out.println(orig[i]);
		}
		Arrays.sort(orig);
		for (int i = 0; i < orig.length; i++) {
			System.out.println(orig[i]);
		}
	}
}
