import java.awt.Container;

import javax.swing.*;

public class basicFrame {
	private static dungeonPanel jpanel = new dungeonPanel();
	private static inputManager input = new inputManager();

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(517, 440);
		frame.setTitle("Dungeon Crawler");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		pane.add(jpanel);
		frame.addKeyListener(input);
		jpanel.refresh = frame;
		frame.setVisible(true);
		polygonManager.init();
		jpanel.itimer.start();
	}
}
