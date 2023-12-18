public class notes {
	public static void main(String[] args) {
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		double[] values = {2,4,6};

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		square(values);
		System.out.println("-- squared --");
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
	public static void square(double[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];
		}
	}
}
