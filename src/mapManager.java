public class mapManager {
	static int roomno = 1;
	static boolean left, right, back, forward, left1, right1, forward1, left2,
			right2, forward2, left3, right3, forward3, only_leftext,
			only_rightext;
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
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				endOfHallway();
				break;
			}

		} else if (roomno == 2) {
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
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
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
		} else if (roomno == 3) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = false;
				right = true;
				back = false;
				left1 = false;
				right1 = true;
				polygonManager.distance = 1;
				break;
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				advance = -1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			}

		} else if (roomno == 4) {
			switch (facing) {
			case 'f':
				advance = 0;
				left = false;
				right = true;
				back = false;
				left1 = false;
				right1 = false;
				polygonManager.distance = 0;
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 5;
				break;
			case 'r':
				advance = -1;
				left = false;
				right = false;
				back = false;
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
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 3;
				break;
			}

		} else if (roomno == 5) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 4;
				break;
			case 'r':
				advance = -1;
				left = true;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		} else if (roomno == 6) {
			switch (facing) {
			case 'f':
				advance = 0;
				sideOfHallway();
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 3;
				break;
			case 'r':
				advance = -1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		} else if (roomno == 7) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'r':
				advance = -1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = false;
				polygonManager.distance = 3;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		} else if (roomno == 8) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
				advance = 1;
				left = false;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			case 'r':
				advance = -1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 4;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		} else if (roomno == 9) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = true;
				polygonManager.distance = 3;
				break;
			case 'l':
				advance = 0;
				left = false;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			case 'r':
				advance = -1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 5;
				break;
			case 'b':
				advance = -2;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 5;
				break;
			}

		} else if (roomno == 10) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = false;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				advance = -1;
				left = false;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 6;
				break;
			}

		} else if (roomno == 11) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = false;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				advance = -1;
				left = true;
				right = true;
				back = false;
				left1 = false;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 7;
				break;
			}

		} else if (roomno == 12) {
			switch (facing) {
			case 'f':
				advance = 0;
				left = false;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 4;
				break;
			case 'r':
				advance = -1;
				left = false;
				right = false;
				back = false;
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
				back = true;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = true;
				polygonManager.distance = 8;
				break;
			}

		} else if (roomno == 13) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = true;
				polygonManager.distance = 3;
				break;
			case 'r':
				advance = -1;
				left = true;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		}else if (roomno == 14) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = false;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'r':
				advance = -1;
				left = true;
				right =true;
				back = false;
				left1 = true;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		}else if (roomno == 15) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
				advance = 1;
				left = false;
				right = true;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			case 'r':
				advance = -1;
				left = true;
				right =true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = false;
				polygonManager.distance = 3;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		}else if (roomno == 16) {
			switch (facing) {
			case 'f':
				advance = -1;
				left = false;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			case 'l':
				advance = 0;
				left = false;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			case 'r':
				advance = -1;
				left = true;
				right =true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 4;
				break;
			case 'b':
				advance = 1;
				left = true;
				right =true;
				back = true;
				left1 = true;
				right1 = false;
				left2 = true;
				right2 = true;
				polygonManager.distance = 4;
				break;
			}

		}

	}

	public static void sideOfHallway() {
		advance = 0;
		left = false;
		right = false;
		back = true;
		left1 = false;
		right1 = false;
		left2 = false;
		right2 = false;
		polygonManager.distance = 0;
	}

	public static void endOfHallway() {
		advance = -1;
		left = true;
		right = false;
		back = false;
		left1 = false;
		right1 = false;
		left2 = false;
		right2 = false;
		polygonManager.distance = 0;
	}
}
