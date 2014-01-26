public class mapManager {
	static int roomno = 1;
	static boolean left, right, back, forward, left1, right1, forward1, left2,
			right2, forward2, left3, right3, forward3;
	static char facing = 'f';
	static int advance = 0;

	public static void wallManager() {
		if (roomno == 1) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = true;
				polygonManager.distance = 3;
				break;
			case 'l':
				advance = 0;
				left = true;
				right = false;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 0;
				break;
			case 'r':
				advance = 0;
				left = true;
				right = false;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 0;
				break;
			case 'b':
				advance = -1;
				left = true;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			}

		}
		if (roomno == 2) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = false;
				right1 = true;
				polygonManager.distance = 2;
				break;
			case 'l':
				advance = 0;
				left = false;
				right = false;
				back = true;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			case 'r':
				advance = 0;
				left = false;
				right = false;
				back = true;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			case 'b':
				advance = -1;
				left = true;
				right = true;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			}
		}

	}
}
