public class Part1 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int lasteven = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		System.out.println("All elements at even indices: ");
		for (int i = 0; i < array.length; i += 2) {
			System.out.printf(array[i] + ((i == array.length - 1 || i == array.length - 2) ? " " : ", "));
		}
		System.out.println("");
		System.out.println("All even elements");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				lasteven = i;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.printf(array[i] + ((i == lasteven) ? " " : ", "));
			}
		}
		System.out.println("");
		System.out.println("all elements backwards");
		for (int i = array.length - 1; i > -1; i--) {
			System.out.printf(array[i] + ((i == 0) ? " " : ", "));
		}
		System.out.println("");
		System.out.println("only first and last elements");
		System.out.println(array[0] + ", " + array[array.length - 1]);
	}
}
