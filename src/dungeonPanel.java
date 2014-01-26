import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

import javax.swing.*;

public class dungeonPanel extends JPanel {
	static JFrame refresh;
	public Timer itimer = new Timer(30, new inputTimer());

	public void paintComponent(Graphics g) {
		mapManager.wallManager();
		g.setColor(drawings.ceiling);
		g.fillRect(0, 0, 500, 200);
		g.setColor(drawings.floor);
		g.fillRect(0, 200, 500, 200);
		Graphics g2d = (Graphics2D) g;
		AffineTransform saveTransform = ((Graphics2D) g2d).getTransform();
		AffineTransform scaleMatrix_left = new AffineTransform();
		AffineTransform scaleMatrix_right = new AffineTransform();
		scaleMatrix_left.translate(100, 100);
		scaleMatrix_right.translate(150, 100);
		scaleMatrix_left.scale(0.5, 0.5);
		scaleMatrix_right.scale(0.5, 0.5);

		if (polygonManager.distance >= 2) {
			if (mapManager.left1) {
				g2d.setColor(drawings.lighting_gray1);
				((Graphics2D) g2d).setTransform(scaleMatrix_left);
				g2d.fillPolygon(drawings.left1);
				g2d.setColor(Color.BLACK);
				((Graphics2D) g2d).setTransform(scaleMatrix_left);
				g2d.drawPolygon(drawings.left1);
			}
			g2d.setColor(drawings.lighting_gray1);
			if (mapManager.right1) {
				((Graphics2D) g2d).setTransform(scaleMatrix_right);
				g2d.fillPolygon(drawings.right1);
				g2d.setColor(Color.BLACK);
				((Graphics2D) g2d).setTransform(scaleMatrix_right);
				g2d.drawPolygon(drawings.right1);
			}
		}
		AffineTransform scaleMatrix2_left = new AffineTransform();
		AffineTransform scaleMatrix2_right = new AffineTransform();
		scaleMatrix2_left.translate(150, 150);
		scaleMatrix2_right.translate(225, 150);
		scaleMatrix2_left.scale(0.25, 0.25);
		scaleMatrix2_right.scale(0.25, 0.25);
		g2d.setColor(drawings.lighting_gray2);
		if (polygonManager.distance >= 2) {
			if (mapManager.left2) {
				((Graphics2D) g2d).setTransform(scaleMatrix2_left);
				g2d.fillPolygon(drawings.left2);
				g2d.setColor(Color.BLACK);
				((Graphics2D) g2d).setTransform(scaleMatrix2_left);
				g2d.drawPolygon(drawings.left2);
			}
			g2d.setColor(drawings.lighting_gray2);
			if (mapManager.right2) {
				((Graphics2D) g2d).setTransform(scaleMatrix2_right);
				g2d.fillPolygon(drawings.right2);
				g2d.setColor(Color.BLACK);
				((Graphics2D) g2d).setTransform(scaleMatrix2_right);
				g2d.drawPolygon(drawings.right2);
			}
		}
		((Graphics2D) g2d).setTransform(saveTransform);
		if (polygonManager.distance <= 3) {
			if (polygonManager.distance == 0)
				g.setColor(drawings.lighting_gray);
			else if (polygonManager.distance == 1)
				g.setColor(drawings.lighting_gray1);
			else if (polygonManager.distance >= 2)
				g.setColor(drawings.lighting_gray2);
		} else
			g.setColor(Color.BLACK);
		g.fillPolygon(drawings.currentforward);
		g.setColor(Color.BLACK);
		g.drawPolygon(drawings.currentforward);

		polygonManager.update();
		g.setColor(drawings.lighting_gray);
		if (polygonManager.distance >= 1) {
			if (mapManager.left) {
				g.fillPolygon(drawings.currentleft);
				g.setColor(Color.BLACK);
				g.drawPolygon(drawings.currentleft);
				g2d.setColor(drawings.lighting_gray);
			}
			if (mapManager.right) {
				g.fillPolygon(drawings.currentright);
				g.setColor(Color.BLACK);
				g.drawPolygon(drawings.currentright);
			}
		}
		if (polygonManager.left_ext || polygonManager.left_ext1
				|| polygonManager.left_ext2)
		{
			if(polygonManager.left_ext)
				g.setColor(drawings.lighting_gray);
			else if(polygonManager.left_ext1)
				g.setColor(drawings.lighting_gray1);
			else if(polygonManager.left_ext2)
				g.setColor(drawings.lighting_gray2);
			g.fillPolygon(drawings.left_ext);
			g.setColor(Color.BLACK);
			g.drawPolygon(drawings.left_ext);
		}
		if (polygonManager.right_ext || polygonManager.right_ext1
				|| polygonManager.right_ext2)
		{
			if(polygonManager.right_ext)
				g.setColor(drawings.lighting_gray);
			else if(polygonManager.right_ext1)
				g.setColor(drawings.lighting_gray1);
			else if(polygonManager.right_ext2)
				g.setColor(drawings.lighting_gray2);
			g.fillPolygon(drawings.right_ext);
			g.setColor(Color.BLACK);
			g.drawPolygon(drawings.right_ext);
		}
		g.setColor(Color.RED);
		g.drawRect(50, 0, 300, 50);
		g.drawString("distance = " + polygonManager.distance, 60, 10);
		g.drawString("room# = " + mapManager.roomno, 140, 10);
		g.drawString("facing = " + mapManager.facing, 200, 10);
		g.drawString("advance = " + mapManager.advance, 60, 30);

	}

	private class inputTimer implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			refresh.repaint();
		}
	}
}
