package zero.sinisi.rune.gaze;

import javax.swing.JFrame;

import zero.sinisi.rune.gaze.ui.Application;

public class Main {

	public static void main(String[] args) {
		Application app = new Application();
		app.setSize(400, 200);
		app.setLocationRelativeTo(null);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
