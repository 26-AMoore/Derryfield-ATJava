public class AllEvenIntsTo100 {
	public static void main(String[] args) {
		int total = 0;
		int whatToAdd = 0;

		for (int i = 0; i <= 100; i = i+2) {
			total = total + i;
			//System.out.printf("Total = %d, i = %d%n",total, i);
		}
		System.out.println(total);
	}
}
