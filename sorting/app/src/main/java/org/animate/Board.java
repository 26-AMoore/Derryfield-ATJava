package org.animate;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class Board extends JPanel {
	private final int B_WIDTH = 1280;
	private final int B_HEIGHT = 720;
	private Pillar [] array = new Pillar[(int)B_WIDTH / 3];

	public Board() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		Pillar.setMaxHeight(B_HEIGHT);

		for (int i = 0; i < array.length; i++) {
			Pillar builder = new Pillar("128128128", i, i);
			array[i] = builder;
		}

//		ArrayUtils.scramble(array);

		for (int i = 0; i < array.length; i++) {
			array[i].setPlace(i);
		}

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		for (int i = 0; i < array.length; i++) {
			array[i].drawPillar(g2d);
		}
	}
}

class ArrayUtils {

	public static void scramble(Object[] array) {
		Random rng = new Random();
		for (int i = array.length - 1; i > 0; i--) {
			int index = rng.nextInt(i + 1);

			Object a = array[index];
			array[index] = array[i];
			array[i] = a;
		}
	}

}
