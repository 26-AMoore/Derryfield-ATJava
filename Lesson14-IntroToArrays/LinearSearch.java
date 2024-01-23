
public class LinearSearch {
	public static void main(String[] args) {
		int[] values = {1,3,4,5,64,1,4,51,2};
		int whatToFind = 2;
		boolean found = false;
		int pos = 0;
		while (pos < values.length && !found) {
			if (values[pos] == whatToFind) {
				System.out.println("found at "+pos);
				found = true;
			} else {
				pos++;
			}
		}
	}
}
