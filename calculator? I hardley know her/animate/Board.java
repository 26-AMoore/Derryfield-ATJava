package animate;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Board extends JPanel {
	private final int SIDE_LEN = 1;
	private final int B_WIDTH = 350;
	private final int B_HEIGHT = 350;

	public Board() {
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);

		int x_t = B_WIDTH / 2;
		int y_t = B_HEIGHT / 2;
		x_t = x_t - SIDE_LEN / 2;
		y_t = y_t - SIDE_LEN / 2;
		Rectangle x_axis = new Rectangle(0, B_HEIGHT / 2, B_WIDTH, 1);
		g2d.fill(x_axis);

		Rectangle y_axis = new Rectangle(B_WIDTH / 2, 0, 1, B_HEIGHT);
		g2d.fill(y_axis);

		int prev_y = 1;
		int prev_x = -1 * B_WIDTH / 2;
		for (int i = -1 * B_WIDTH / 2; i < B_WIDTH / 2; i += 1) {
			double x = i;
			double y = (B_HEIGHT - (1.5*x-50));
			if (y >= 0 && y >= -1 * B_HEIGHT) {
				Rectangle rect = new Rectangle(prev_x + B_WIDTH / 2, (int)y - B_HEIGHT / 2,  (int)x - prev_x, prev_y - (int)y);
				g2d.fill(rect);
			}
			prev_y = (int)y;
			prev_x = (int)x;
		}
	}
	public static int function() {
		return 1;
	}
}
