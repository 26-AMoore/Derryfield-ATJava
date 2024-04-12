package animate;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {
	private final int FRAME_WIDTH = 640;
	private final int FRAME_HEIGHT = 480;
	private String title = "title";
	public Application() {
		int border_width = 0;
		int bar_height = 28;

		Board board = new Board();
		this.setTitle(title);
		this.add(board);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		int application_height = (int) board.getPreferredSize().getHeight() + bar_height + border_width;
		int application_width = (int) board.getPreferredSize().getWidth() + 2 * border_width;
		this.setSize(application_width, application_height);
	}
}
