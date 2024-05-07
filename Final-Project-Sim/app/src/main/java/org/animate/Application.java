package org.animate;
import javax.swing.JFrame;

public class Application extends JFrame {
	private String title = "title";
	public Application() {
		int border_width = 0;
		int bar_height = 28;

		Board board = new Board();
		Cannon cannon = new Cannon(15, 640);
		this.setTitle(title);
		this.add(board);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		int application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
		int application_width = (int) board.getPreferredSize().getWidth() + 2 * border_width;
		this.setSize(application_width, application_height);
	}
}
