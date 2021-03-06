public class mapManager {
	static int roomno = 1;
	static boolean left, right, back, forward, left1, right1, forward1, left2,
			right2, forward2, left3, right3, forward3, only_leftext,
			only_rightext;
	static char facing = 'f';
	static int advance = 0;
	public static boolean gate = true, chest_open = false, key_get = false;

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
				right2 = false;
				polygonManager.distance = 3;
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

		} else if (roomno == 14) {
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

		} else if (roomno == 15) {
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

		} else if (roomno == 16) {
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
				right = true;
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
				right = true;
				back = true;
				left1 = true;
				right1 = false;
				left2 = true;
				right2 = true;
				polygonManager.distance = 4;
				break;
			}

		} else if (roomno == 17) {
			switch (facing) {
			case 'f':
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
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				advance = 1;
				left = true;
				right = false;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = false;
				polygonManager.distance = 3;
				break;
			}

		} else if (roomno == 18) {
			switch (facing) {
			case 'f':
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
			case 'l':
				advance = -4;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 3;
				break;
			case 'r':
				advance = -5;
				left = false;
				right = false;
				if (gate)
					back = true;
				else
					back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
				break;
			case 'b':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = false;
				left2 = true;
				right2 = true;
				polygonManager.distance = 2;
				break;
			}

		} else if (roomno == 19) {
			switch (facing) {
			case 'f':
				advance = -1;
				left = false;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = false;
				polygonManager.distance = 3;
				break;
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				advance = 1;
				left = true;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			}

		} else if (roomno == 20) {
			switch (facing) {
			case 'f':
				advance = -1;
				left = true;
				right = true;
				back = true;
				left1 = false;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 4;
				break;
			case 'l':
				advance = 1;
				left = true;
				right = true;
				back = true;
				left1 = false;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
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
			}

		} else if (roomno == 21) {
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
				left = false;
				right = true;
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

		} else if (roomno == 22) {
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
				right = true;
				back = true;
				left1 = false;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'b':
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
			}

		} else if (roomno == 23) {
			switch (facing) {
			case 'f':
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
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
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
			}

		} else if (roomno == 24) {
			switch (facing) {
			case 'f':
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
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
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
			}

		} else if (roomno == 25) {
			switch (facing) {
			case 'f':
				advance = -1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = false;
				polygonManager.distance = 3;
				break;
			case 'l':
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
			case 'r':
				advance = 1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 7;
				break;
			case 'b':
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
			}

		} else if (roomno == 26) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
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
			case 'r':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = false;
				polygonManager.distance = 6;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		} else if (roomno == 27) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
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
			case 'r':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = false;
				left2 = true;
				right2 = true;
				polygonManager.distance = 5;
				break;
			case 'b':
				sideOfHallway();
				break;
			}

		} else if (roomno == 28) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
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
			case 'r':
				advance = 1;
				left = true;
				right = false;
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

		} else if (roomno == 29) {
			switch (facing) {
			case 'f':
				advance = -6;
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
				advance = -1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 5;
				break;
			case 'r':
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
			case 'b':
				advance = -6;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			}

		} else if (roomno == 30) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
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
			case 'r':
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
			case 'b':
				sideOfHallway();
			}

		} else if (roomno == 31) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
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
			case 'r':
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
			case 'b':
				sideOfHallway();
			}

		} else if (roomno == 32) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = false;
				polygonManager.distance = 7;
				break;
			case 'l':
				advance = -1;
				left = true;
				right = true;
				back = true;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = true;
				polygonManager.distance = 7;
				break;
			case 'r':
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
			case 'b':
				advance = -1;
				left = false;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
			}

		} else if (roomno == 33) {
			switch (facing) {
			case 'f':
				advance = 1;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = false;
				left2 = true;
				right2 = true;
				polygonManager.distance = 6;
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
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
			}

		} else if (roomno == 34) {
			switch (facing) {
			case 'f':
				advance = -3;
				left = true;
				right = false;
				back = false;
				left1 = true;
				right1 = true;
				left2 = true;
				right2 = true;
				polygonManager.distance = 5;
				break;
			case 'l':
				sideOfHallway();
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				advance = 3;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
			}

		} else if (roomno == 35) {
			switch (facing) {
			case 'f':
				advance = -7;
				left = false;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
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
				advance = -8;
				left = true;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
			}

		} else if (roomno == 36) {
			switch (facing) {
			case 'f':
				advance = -1;
				left = true;
				right = true;
				back = true;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'l':
				advance = -10;
				left = true;
				right = true;
				back = true;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 1;
				break;
			case 'r':
				sideOfHallway();
				break;
			case 'b':
				advance = 0;
				left = true;
				right = false;
				back = false;
				left1 = false;
				right1 = false;
				left2 = false;
				right2 = false;
				polygonManager.distance = 0;
			}

		} else if (roomno == 37) {
			switch (facing) {
			case 'f':
				sideOfHallway();
				break;
			case 'l':
				advance = -11;
				left = true;
				right = true;
				back = false;
				left1 = true;
				right1 = true;
				left2 = false;
				right2 = false;
				polygonManager.distance = 2;
				break;
			case 'r':
				advance = -9;
				left = false;
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
