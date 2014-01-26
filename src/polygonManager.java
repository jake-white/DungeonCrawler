import java.awt.*;
import java.io.File;

public class polygonManager {
	public static int distance = 3;
	public static int length = 20;
	public static int height = 10;
	public static double time = 0;
	public static int leftextension,rightextension;
	public static boolean left_ext, right_ext, left_ext1, right_ext1, left_ext2, right_ext2;

	public static void init() {

		int[] left_xpoints = { 0, 100, 100, 0 };
		int[] left_ypoints = { 0, 100, 300, 400 };
		int[] right_xpoints = { 500, 400, 400, 500 };
		int[] right_ypoints = { 0, 100, 300, 400 };
		int[] forward_xpoints = { 250 - polygonManager.length,
				250 + polygonManager.length, 250 + polygonManager.length,
				250 - polygonManager.length };
		int[] forward_ypoints = { 200 - polygonManager.length / 2,
				200 - polygonManager.length / 2,
				200 + polygonManager.length / 2,
				200 + polygonManager.length / 2 };
		drawings.currentforward = new Polygon(forward_xpoints, forward_ypoints,
				4);
		drawings.currentleft = new Polygon(left_xpoints, left_ypoints, 4);
		drawings.currentright = new Polygon(right_xpoints, right_ypoints, 4);
		drawings.left2 = new Polygon(left_xpoints, left_ypoints, 4);
		drawings.right2 = new Polygon(right_xpoints, right_ypoints, 4);
		drawings.left1 = new Polygon(left_xpoints, left_ypoints, 4);
		drawings.right1 = new Polygon(right_xpoints, right_ypoints, 4);
	}

	public static void update() {
		int[] forward_xpoints = { 250 - length / 2 - leftextension, 250 + length / 2 + rightextension,
				250 + length / 2 + rightextension, 250 - length / 2 - leftextension };
		int[] forward_ypoints = { 200 - height / 2, 200 - height / 2,
				200 + height / 2, 200 + height / 2 };
		int[] left_extpoints = {0, 100, 100, 0};
		int[] left_extpoints1 = {100, 150, 150, 100};
		int[] left_extpoints2 = {150, 175, 175, 150};
		int[] right_extpoints = {500, 400, 400, 500};
		int[] right_extpoints1 = {400, 350, 350, 400};
		int[] right_extpoints2 = {350, 325, 325, 350};
		drawings.currentforward = new Polygon(forward_xpoints, forward_ypoints,
				4);
		int[] ext_ypoints = {100, 100, 300, 300};
		int[] ext_ypoints1 = {150, 150, 250, 250};
		int[] ext_ypoints2 = {175, 175, 225, 225};
		if(left_ext)
		drawings.left_ext = new Polygon(left_extpoints, ext_ypoints,
				4);
		else if(left_ext1)
			drawings.left_ext = new Polygon(left_extpoints1, ext_ypoints1,
					4);
		else if(left_ext2)
			drawings.left_ext = new Polygon(left_extpoints2,ext_ypoints2,
					4);
		else
			drawings.left_ext = new Polygon(left_extpoints1, ext_ypoints1,
					4);
		if(right_ext)
			drawings.left_ext = new Polygon(right_extpoints, ext_ypoints,
					4);
		else if(right_ext1)
			drawings.left_ext = new Polygon(right_extpoints1, ext_ypoints1,
					4);
		else if(right_ext2)
			drawings.left_ext = new Polygon(right_extpoints2, ext_ypoints2,
					4);
		leftextension = 0;
		rightextension = 0;
		left_ext = false; right_ext = false; left_ext1 = false; right_ext1 = false; left_ext2 = false; right_ext2 = false;
		if (distance == 0) {
			length = 500;
			height = 400;
		}
		if (distance == 1) {
			length = 300;
			height = 200;
			if(!mapManager.left)
				leftextension = 100;
			if(!mapManager.right)
				rightextension = 100;
		} else if (distance == 2) {
			if(!mapManager.left1)
				leftextension = 50;
			if(!mapManager.right1)
				rightextension = 50;
			length = 200;
			height = 100;
		} else if (distance == 3) {
			if(!mapManager.left2)
				leftextension = 25;
			if(!mapManager.right2)
				rightextension = 25;
			length = 150;
			height = 50;
		}
		else if(distance >= 3)
		{
			length = 150;
			height = 50;
			if(!mapManager.left)
				left_ext = true;
			if(!mapManager.right)
				right_ext = true;
			if(!mapManager.left1)
				left_ext1 = true;
			if(!mapManager.right1)
				right_ext1 = true;
			if(!mapManager.left2)
				left_ext2 = true;
			if(!mapManager.right2)
				right_ext2 = true;			
		}
		if (inputManager.input('w') && System.currentTimeMillis() > time + 300
				&& distance > 0) {
			time = System.currentTimeMillis();
			musicManager.soundeffect(new File ("resources/walk.wav"));
			--distance;
			if(mapManager.advance == 1)
			++mapManager.roomno;
			else if(mapManager.advance == -2)
				mapManager.roomno = 38;
			else
			--mapManager.roomno;
		} else if (inputManager.input('s')
				&& System.currentTimeMillis() > time + 300 && !mapManager.back) {
			time = System.currentTimeMillis();
			musicManager.soundeffect(new File ("resources/walk.wav"));
			if(mapManager.advance == -1 || mapManager.advance == -2)
			++mapManager.roomno;
			else
				--mapManager.roomno;
		} else if (inputManager.input('a')
				&& System.currentTimeMillis() > time + 500) {
			time = System.currentTimeMillis();
			musicManager.soundeffect(new File ("resources/swoosh.wav"));
			if (mapManager.facing == 'f')
				mapManager.facing = 'l';
			else if (mapManager.facing == 'l')
				mapManager.facing = 'b';
			else if(mapManager.facing == 'b')
				mapManager.facing = 'r';
			else if(mapManager.facing == 'r')
				mapManager.facing = 'f';
		}else if (inputManager.input('d')
				&& System.currentTimeMillis() > time + 500) {
			time = System.currentTimeMillis();
			musicManager.soundeffect(new File ("resources/swoosh.wav"));
			if (mapManager.facing == 'f')
				mapManager.facing = 'r';
			else if (mapManager.facing == 'l')
				mapManager.facing = 'f';
			else if(mapManager.facing == 'b')
				mapManager.facing = 'l';
			else if(mapManager.facing == 'r')
				mapManager.facing = 'b';
		}

	}

}
