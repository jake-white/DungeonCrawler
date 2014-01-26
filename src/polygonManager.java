import java.awt.*;

public class polygonManager {
	public static int distance = 3;
	public static int length = 20;
	public static int height = 10;
	public static double time = 0;

	public static void init() {

		int[] left_xpoints = { 0, 100, 100, 0 };
		int[] left_ypoints = { 0, 100, 300, 400 };
		int[] right_xpoints = { 500, 400, 400, 500 };
		int[] right_ypoints = { 0, 100, 300, 400 };
		int[] f_xpoints = { 500, 400, 400, 500 };
		int[] f_ypoints = { 0, 100, 300, 400 };
		int[] c_xpoints = { 500, 400, 400, 500 };
		int[] c_ypoints = { 0, 100, 300, 400 };
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
		int[] forward_xpoints = { 250 - length / 2, 250 + length / 2,
				250 + length / 2, 250 - length / 2 };
		int[] forward_ypoints = { 200 - height / 2, 200 - height / 2,
				200 + height / 2, 200 + height / 2 };
		drawings.currentforward = new Polygon(forward_xpoints, forward_ypoints,
				4);
		if (distance == 0) {
			length = 500;
			height = 400;
		}
		if (distance == 1) {
			length = 300;
			height = 200;
		} else if (distance == 2) {
			length = 200;
			height = 100;
		} else if (distance == 3) {
			length = 150;
			height = 50;
		}
		if (inputManager.input('w') && System.currentTimeMillis() > time + 500
				&& distance > 0) {
			time = System.currentTimeMillis();
			--distance;
			if(mapManager.advance == 1)
			++mapManager.roomno;
			else if(mapManager.advance == -1)
			--mapManager.roomno;
		} else if (inputManager.input('s')
				&& System.currentTimeMillis() > time + 500 && !mapManager.back) {
			time = System.currentTimeMillis();
			if(mapManager.advance == -1)
			++mapManager.roomno;
			else if(mapManager.advance == 1)
				--mapManager.roomno;
		} else if (inputManager.input('a')
				&& System.currentTimeMillis() > time + 500) {
			time = System.currentTimeMillis();
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
