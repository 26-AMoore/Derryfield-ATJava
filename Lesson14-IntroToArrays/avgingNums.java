public class avgingNums {
	public static void main(String[] args) {
		double[] numbers = {8, 6, 7, 5, 3, 0, 9};
		double avg = 0;

		for (double d : numbers) {
			System.out.println(d);
			avg += d;
		}

//		System.out.println(avg);
		avg = avg / numbers.length;
		System.out.printf("Avg: %.2f%n",avg);
		
	}
}

