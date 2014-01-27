import java.awt.Container;
import java.io.File;

import javax.swing.*;

public class basicFrame {
	private static dungeonPanel jpanel = new dungeonPanel();
	private static inputManager input = new inputManager();

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(507, 430);
		frame.setTitle("Dungeon Crawler");
		frame.setLocation(5, 5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		Container pane = frame.getContentPane();
		pane.add(jpanel);
		frame.addKeyListener(input);
		jpanel.refresh = frame;
		frame.setVisible(true);
		polygonManager.init();
		jpanel.itimer.start();
		musicManager.background(new File("resources/reactor.wav"));
		imageManager.loadBufferedImage();
		long start_time = System.currentTimeMillis();
	}
}
