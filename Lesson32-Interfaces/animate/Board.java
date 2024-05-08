package animate;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class Board extends JPanel implements KeyListener, MouseListener {
	private SoundClip blop;
	private SoundClip blip;
	private final int SIDE_LEN = 150;
	private final int B_WIDTH = 350;
	private final int B_HEIGHT = 350;
	private int x = B_WIDTH / 2 - 9;
	private int y = B_HEIGHT / 2 - 9;
	private BufferedImage img;

	public Board() {
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		blop = new SoundClip("sounds/blop.wav");
		blop.open();
		blip = new SoundClip("sounds/blip.wav");
		blip.open();

		this.setFocusable(true);

		this.addKeyListener(this);

		this.addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.MAGENTA);
		g2d.fillOval(x, y, 19, 19);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			x = B_WIDTH / 2 - 9;
			y = B_HEIGHT / 2 - 9;
			this.repaint();
			blop.play();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX() - 9;
		y = e.getY() - 9;
		this.repaint();
		blip.play();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}
