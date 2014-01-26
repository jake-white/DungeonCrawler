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
		g.setColor(Color.darkGray);
		g.fillRect(0, 0, 500, 400);
		Graphics g2d = (Graphics2D) g;
		AffineTransform saveTransform = ((Graphics2D) g2d).getTransform();
		AffineTransform scaleMatrix_left = new AffineTransform();
		AffineTransform scaleMatrix_right = new AffineTransform();
		scaleMatrix_left.translate(100, 100);
		scaleMatrix_right.translate(150, 100);
		scaleMatrix_left.scale(0.5, 0.5);
		scaleMatrix_right.scale(0.5, 0.5);

		if (polygonManager.distance >= 2) {
			if(mapManager.left1)
			{
				g2d.setColor(Color.GRAY);
			((Graphics2D) g2d).setTransform(scaleMatrix_left);
			g2d.fillPolygon(drawings.left1);
			g2d.setColor(Color.BLACK);
			((Graphics2D) g2d).setTransform(scaleMatrix_left);
			g2d.drawPolygon(drawings.left1);
			}
			g2d.setColor(Color.GRAY);
			if(mapManager.right1)
			{
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
		if (polygonManager.distance >= 2) {
			g2d.setColor(Color.GRAY);
			if(mapManager.left2)
			{
			((Graphics2D) g2d).setTransform(scaleMatrix2_left);
			g2d.fillPolygon(drawings.left2);
			g2d.setColor(Color.BLACK);
			((Graphics2D) g2d).setTransform(scaleMatrix2_left);
			g2d.drawPolygon(drawings.left2);
			}
			g2d.setColor(Color.GRAY);
			if(mapManager.right2)
			{
			((Graphics2D) g2d).setTransform(scaleMatrix2_right);
			g2d.fillPolygon(drawings.right2);
			g2d.setColor(Color.BLACK);
			((Graphics2D) g2d).setTransform(scaleMatrix2_right);
			g2d.drawPolygon(drawings.right2);
			}
		}
		((Graphics2D) g2d).setTransform(saveTransform);
		if(polygonManager.distance <= 3)
		g.setColor(Color.GRAY);
		else
			g.setColor(Color.BLACK);
		g.fillPolygon(drawings.currentforward);
		g.setColor(Color.BLACK);
		g.drawPolygon(drawings.currentforward);	

		polygonManager.update();
		if (polygonManager.distance >= 1) {
			g.setColor(Color.GRAY);
			if(mapManager.left)
			{
			g.fillPolygon(drawings.currentleft);
			g.setColor(Color.BLACK);
			g.drawPolygon(drawings.currentleft);
			g2d.setColor(Color.GRAY);
			}
			if(mapManager.right)
			{
			g.fillPolygon(drawings.currentright);
			g.setColor(Color.BLACK);
			g.drawPolygon(drawings.currentright);
			}
		}
		if (polygonManager.distance >= 2) {
			g.drawLine(100, 300, 400, 300);
			g.drawLine(0, 400, 500, 400);
			g.drawLine(100, 100, 400, 100);

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
