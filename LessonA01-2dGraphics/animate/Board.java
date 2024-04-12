package animate;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class Board extends JPanel {
	private final int SIDE_LEN = 150;
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

		AffineTransform affineTransform = new AffineTransform();
		affineTransform.translate(x_t, y_t);
		affineTransform.rotate(22.5, SIDE_LEN / 2, SIDE_LEN / 2);

		Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);

		Shape transformedShape = affineTransform.createTransformedShape(rect);

		g2d.fill(transformedShape);
	}
}
