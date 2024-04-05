package animate;
import javax.swing.JFrame;

public class Application extends JFrame {
	private final int FRAME_WIDTH = 640;
	private final int FRAME_HEIGHT = 480;
	private String title = "title";
	public Application() {
		this.setTitle(title);
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
