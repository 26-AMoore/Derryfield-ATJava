package animate;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Board extends JPanel {
	private final int SIDE_LEN = 3;
	private final int B_WIDTH = 350;
	private final int B_HEIGHT = 350;

	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.MAGENTA);

		int x_t = B_WIDTH / 2;
		int y_t = B_HEIGHT / 2;
		x_t = x_t - SIDE_LEN / 2;
		y_t = y_t - SIDE_LEN / 2;

		int prev_y = 1;
		for (int x = 0; x < B_WIDTH ; x += 1) {
			int y = B_HEIGHT - (15 * x + 3);
			if (y >= 0) {
				Rectangle rect = new Rectangle(x, y, SIDE_LEN, prev_y - y);
				g2d.fill(rect);
			}
			prev_y = y;
		}
	}
}
