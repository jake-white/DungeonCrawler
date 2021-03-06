import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class dungeonPanel extends JPanel {
	static JFrame refresh;
	public Timer itimer = new Timer(30, new inputTimer());
	private boolean debug = false, release;

	public void paintComponent(Graphics g) {

		polygonManager.update();
		if (battleManager.encounter)
			battleManager.battleMechanics();
		Font outputFont = g.getFont().deriveFont(17.0F);
		Font smallFont = g.getFont().deriveFont(12.0F);
		mapManager.wallManager();
		g.setColor(drawings.ceiling);
		g.fillRect(0, 0, 501, 200);
		g.setColor(drawings.floor);
		g.fillRect(0, 200, 501, 201);
		g.setColor(Color.darkGray);
		g.fillRect(505, 0, 50, 401);
		g.setColor(Color.GRAY);
		g.fillRect(0, 405, 560, 129);
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
		if ((mapManager.roomno == 18 || mapManager.roomno >= 37)
				&& mapManager.facing == 'l' && !mapManager.gate)
			g.setColor(Color.GREEN);
		g.fillPolygon(drawings.currentforward);
		g.setColor(Color.BLACK);
		g.drawPolygon(drawings.currentforward);
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
				|| polygonManager.left_ext2) {
			if (polygonManager.left_ext)
				g.setColor(drawings.lighting_gray);
			else if (polygonManager.left_ext1)
				g.setColor(drawings.lighting_gray1);
			else if (polygonManager.left_ext2)
				g.setColor(drawings.lighting_gray2);
			g.fillPolygon(drawings.left_ext);
			g.setColor(Color.BLACK);
			g.drawPolygon(drawings.left_ext);
		}
		if (polygonManager.right_ext || polygonManager.right_ext1
				|| polygonManager.right_ext2) {
			if (polygonManager.right_ext)
				g.setColor(drawings.lighting_gray);
			else if (polygonManager.right_ext1)
				g.setColor(drawings.lighting_gray1);
			else if (polygonManager.right_ext2)
				g.setColor(drawings.lighting_gray2);
			g.fillPolygon(drawings.right_ext);
			g.setColor(Color.BLACK);
			g.drawPolygon(drawings.right_ext);

		}
		if (mapManager.roomno == 18 && mapManager.facing == 'l'
				&& mapManager.gate) {
			Image scaledImage = imageManager.gate1.getScaledInstance(500, 400,
					Image.SCALE_FAST);
			g.drawImage(scaledImage, 0, 0, 500, 400, null);
		} else if (mapManager.roomno == 18 && mapManager.facing == 'l'
				&& !mapManager.gate) {
			Image scaledImage = imageManager.gate2.getScaledInstance(500, 400,
					Image.SCALE_FAST);
			g.drawImage(scaledImage, 0, 0, 500, 400, null);
		} else if (mapManager.roomno == 36 && mapManager.facing == 'l'
				&& !mapManager.chest_open)
			g.drawImage(imageManager.chest1, 175, 275, null);
		else if (mapManager.roomno == 36 && mapManager.facing == 'l'
				&& mapManager.chest_open)
			g.drawImage(imageManager.chest2, 175, 250, null);
		if (mapManager.key_get)
			g.drawImage(imageManager.keyblade, 507, 40, null);
		g.drawImage(imageManager.sword, 507, 5, null);
		float hp_percent = 0;
		if (battleManager.encounter) {
			g.setColor(Color.BLACK);
			g.setFont(outputFont);
			g.drawString(battleManager.output, 5, 420);
			g.setColor(Color.RED);
			g.fillRect(400, 412,
					(Math.round(battleManager.hp * 100) / battleManager.maxhp),
					10);
			g.setColor(Color.BLACK);
			g.drawRect(397, 409, 105, 15);
			g.drawString(battleManager.hp + " / " + battleManager.maxhp, 397,
					440);
			g.setColor(Color.BLUE);
			g.fillRect(
					400,
					462,
					Math.round((battleManager.mana * 100)
							/ battleManager.maxmana), 10);
			g.setColor(Color.BLACK);
			g.drawRect(397, 459, 105, 15);
			g.drawString(battleManager.mana + " / " + battleManager.maxmana,
					397, 490);
			if (battleManager.selected == 1)
				g.setColor(Color.BLUE);
			else
				g.setColor(Color.WHITE);
			g.fillRect(5, 440, 100, 20);
			if (battleManager.selected == 2)
				g.setColor(Color.BLUE);
			else
				g.setColor(Color.WHITE);
			g.fillRect(110, 440, 100, 20);
			if (battleManager.selected == 3)
				g.setColor(Color.BLUE);
			else
				g.setColor(Color.WHITE);
			g.fillRect(5, 465, 100, 20);
			if (battleManager.selected == 4)
				g.setColor(Color.BLUE);
			else
				g.setColor(Color.WHITE);
			g.fillRect(110, 465, 100, 20);
			g.setColor(Color.BLACK);
			if (battleManager.selected == 1)
				g.setColor(Color.WHITE);
			else
				g.setColor(Color.BLACK);
			g.drawString("SWORD", 10, 457);
			if (battleManager.selected == 2)
				g.setColor(Color.WHITE);
			else
				g.setColor(Color.BLACK);
			g.drawString("FIRE MAGIC", 115, 457);
			if (battleManager.selected == 3)
				g.setColor(Color.WHITE);
			else
				g.setColor(Color.BLACK);
			g.drawString("H-POTION", 10, 482);
			if (battleManager.selected == 4)
				g.setColor(Color.WHITE);
			else
				g.setColor(Color.BLACK);
			g.drawString("M-POTION", 115, 482);
			g.setFont(smallFont);
			if (battleManager.monster[battleManager.monsterType]
					.equals("cactuar")) {
				g.drawImage(imageManager.cactuar, 190, 270, 150, 150, null);
			} else if (battleManager.monster[battleManager.monsterType]
					.equals("bomb")) {
				g.drawImage(imageManager.bomb, 180, 230, 150, 160, null);
			} else if (battleManager.monster[battleManager.monsterType]
					.equals("slime")) {
				g.drawImage(imageManager.slime, 170, 260, 150, 150, null);
			} else if (battleManager.monster[battleManager.monsterType]
					.equals("imp")) {
				g.drawImage(imageManager.imp, 170, 280, 150, 150, null);
			}
		}
		if (inputManager.input('`') && release) {
			debug = !debug;
		}
		if(inputManager.input('`'))
			release = false;
		else
			release = true;
		if (debug) {
			g.setColor(Color.RED);
			g.drawRect(50, 0, 300, 50);
			g.drawString("distance = " + polygonManager.distance, 60, 10);
			g.drawString("room# = " + mapManager.roomno, 140, 10);
			g.drawString("facing = " + mapManager.facing, 220, 10);
			g.drawString("advance = " + mapManager.advance, 60, 30);
			g.drawString("gate = " + mapManager.gate, 150, 30);
			g.drawString("encounter = " + battleManager.encounter, 230, 30);
			g.drawString("hp = " + battleManager.hp, 340, 30);
			g.drawString("maxhp = " + battleManager.maxhp, 390, 30);
		}

	}

	private class inputTimer implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			refresh.repaint();

		}
	}
}
