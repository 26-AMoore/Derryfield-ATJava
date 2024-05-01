package animate;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;


public class Board extends JPanel {
	private BufferedImage img;
	private int x = 0;
	private int y = 0;
	private final int B_WIDTH = 720;
	private final int B_HEIGHT = 720;
	private Timer timer;
	private final int INITIAL_DELAY = 100;
	private final int PERIOD_INTERVAL = 10;
	private int xSpeed = 3;
	private int ySpeed = 3;
	private int rotation = 0;
	private int rotationRate = 3;


	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		x = 0;
		y = B_HEIGHT / 2;
		timer = new Timer();
		timer.scheduleAtFixedRate(new ScheduledUpdate(),
				INITIAL_DELAY, PERIOD_INTERVAL);


		try {
			File imageFile = new File("media/Andy.png");
			img = ImageIO.read(imageFile);
//			setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
			setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
			System.out.println("loaded");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private class ScheduledUpdate extends TimerTask {
		public void run() {
			x += xSpeed;
			y += ySpeed;
			rotation += rotationRate;
			rotation = rotation % 360;

			if (y > B_HEIGHT) {
				y = 0;
			}

			if (x > B_WIDTH) {
				x = 0;
			}
			repaint();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		AffineTransform affineTransform = new AffineTransform();
	
		if (img != null) {
			affineTransform.translate(x - img.getWidth() / 2, y - img.getHeight() / 2);
			affineTransform.rotate(Math.toRadians(rotation), img.getWidth() / 2, img.getHeight() / 2);
			g2d.drawImage(img, affineTransform, null);
		} else {
			g2d.setColor(Color.BLUE);
			g2d.drawString("Unable to load image!", 25, 25);
		}
	}
}


