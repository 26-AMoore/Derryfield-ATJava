
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartC {
	public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.blue);

        JComponent component = new JComponent() {
	        public void paintComponent(Graphics graph) {
    		    draw(graph);
				System.out.println("I got run");
            }
        };

		
		frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());


	}

	public static double calcX( double r, double theta) {
		return r * Math.cos(theta);
	}

	public static double calcY(double r, double theta) {
		return r * Math.sin(theta);
	}

	public static double calcR(double theta) {
		return Math.cos(2*theta);
	}

    public static void draw(Graphics g) {
        // by default, this method draws a blue square.
		double theta;
		double x;
		double y;
		double r;

		g.setColor(Color.black);
		for (int i = 0; i < 1000000; i++) {
			theta = (2 * Math.PI) / 1000000 * i;
			r = calcR(theta);
			x = calcX(r, theta) * 150;
			y = calcY(r, theta) * 150;
			g.fillRect((int)x + 199, (int)y + 199, 1, 1);
		}
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }
}
