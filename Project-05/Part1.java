public class Part1 {
	public static void main(String[] args) {
		String first;
	}
	public static int FirstNum(String sec1) {
		int firstsec;
		for (int i = 0; i < sec1.length(); i++) {
			if (sec1.charAt(i) == '.') {
				firstsec = Integer.valueOf(sec1.substring(0, i));
			}
		}
		return firstsec;
	}

}
