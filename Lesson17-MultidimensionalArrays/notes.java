public class notes {
	public static void main(String[] args) {
		String[][] chart = {
			{"Jane", "John", "Jaul", "James"},
			{"Jerald", "Jeff", "Jerry", "Jeffrey"},
			{"Johnny", "Jean", "Jaque", "Jonson"},
			{"Jen", "Jenson", "Jenny", "Jess"}
		};

		for (int i = 0; i < chart.length; i++) {
			for (int j = 0; j < chart[i].length; j++) {
				System.out.println(chart[i][j]);
			}
		}
	}
}
