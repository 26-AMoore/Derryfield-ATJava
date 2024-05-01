package animate;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import animate.SoundClip;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class Board extends JPanel implements KeyListener {
	private SoundClip noise;
	private final int SIDE_LEN = 150;
	private final int B_WIDTH = 350;
	private final int B_HEIGHT = 350;
	private BufferedImage img;

	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		noise = new SoundClip("sounds/blop.wav");
		noise.open();

		this.setFocusable(true);

		this.addKeyListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			System.out.println("SPACE");
			noise.play();
			try {
				Thread.sleep(10);
			} catch (Exception x) {
			}

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.err.println("LEFT");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
