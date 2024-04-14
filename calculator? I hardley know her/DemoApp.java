import animate.Application;
import java.awt.EventQueue;

public class DemoApp {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
		Application myApp = new Application();
		myApp.setVisible(true);
//		while (true) {
//			try {
//				Thread.sleep(10000);
//			} catch (Exception e) {
//				System.err.println(e.getMessage());
//			}
//			myApp.resize();
//		}
		});
		
	}
}
