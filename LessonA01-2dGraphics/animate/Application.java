package animate;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class Application extends JFrame {
	private final int FRAME_WIDTH = 640;
	private final int FRAME_HEIGHT = 480;
	private String title = "title";
	public Application() {
		int border_width = 0;
		int bar_height = 0;

		/*
		String os = System.getProperty(os.name);

        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case OTHER:
                break;
        }
		*/
		
		this.setTitle(title);
		this.setSize(FRAME_WIDTH + border_width, FRAME_HEIGHT + bar_height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
