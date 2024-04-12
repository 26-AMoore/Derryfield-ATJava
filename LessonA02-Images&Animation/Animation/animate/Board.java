package animate;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.TimerTask;
import java.util.Timer;

private int x = B_WIDTH / 2, y;
public class Board extends JPanel {
	private final int B_WIDTH = 350, B_HEIGHT = 350;
	private final int DIAMATER = 20;
	
	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		x = 0;
		timer = new Timer();
		y = B_HEIGHT / 2;
	}

	public void PaintComponet(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.MAGENTA);
		g2d.fillOval(x - DIAMATER / 2, y - DIAMATER / 2, DIAMATER, DIAMATER);
	}
}

private Timer timer;
private final int INITIAL_DELAY = 100;
private final int PERIOD_INTERVAL = 25;
private int xSpeed = 2;

private class ScheduledUpdate extends TimerTask {
	public void run() {
		x += xSpeed;
		if (x > B_WIDTH) {
			x = 0;
		}
		repaint();
	}
}



