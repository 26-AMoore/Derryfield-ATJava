public class PartB {
	public static void main(String[] args) {
		double[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; //Should be 5.00
		double avg = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%.2f %n", array[i]);
		}

		avg = sum(array);
		System.out.println("-- your avrage is --");
		System.out.printf("%.2f %n", avg);
	}
	public static double sum(double... values) {
		double total = 0;
		for (int i = 0; i < values.length; i++) {
			total = total + values[i];
		}
		total = total / values.length;
		return total;
	}
}
