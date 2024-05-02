package org;
import org.animate.Application;
import java.awt.EventQueue;

public class PartA {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
		Application myApp = new Application();
		myApp.setVisible(true);
		});
	}
}
