import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;

public class battleManager {
	static Random generator = new Random();
	public static boolean encounter = false, indicator = false;
	public static int hp = 100, ehp, mana = 20, damage, monsterType,
			maxhp = 100, maxmana = 20;
	public static String output;
	public static String monster[] = new String[5];
	public static int e_basedamage[] = new int[5], e_speed[] = new int[5];
	public static double e_def[] = new double[5];
	public static int basedamage = 12, fire_basedamage = 20, def = 5, e_damage, speed;
	public static int selected = 1;
	private static long timer, end_timer;

	public static void randomEncounter() {
		int decision = generator.nextInt(10);
		if (decision < 3) {
			encounter = true;
			polygonManager.update();
			battleInit();
		}
	}

	public static void battleInit() {
		monster[1] = "slime";
		monster[2] = "imp";
		monster[3] = "cactuar";
		monster[4] = "bomb";
		e_basedamage[1] = 3;
		e_basedamage[2] = 6;
		e_basedamage[3] = 10;
		e_basedamage[4] = 16;
		e_def[1] = 1.1;
		e_def[2] = 1.3;
		e_def[3] = 1.7;
		e_def[4] = 2;
		e_speed[1] = 12;
		e_speed[2] = 7;
		e_speed[3] = 35;
		e_speed[4] = 15;

		musicManager.stopBackground();
		musicManager.battle(new File("resources/battle.wav"));
		monsterType = generator.nextInt(4) + 1;
		switch (monsterType) {
		case 1:
			ehp = 20;
			break;
		case 2:
			ehp = 30;
			break;
		case 3:
			ehp = 40;
			break;
		case 4:
			ehp = 50;
			break;
		}
		output = "A wild " + monster[monsterType] + " appears!";
		battleMechanics();
	}

	public static void battleMechanics() {
		if (!inputManager.spaceHandler(KeyEvent.VK_ENTER) && hp > 0 && ehp > 0) {
			if (inputManager.input('w')) {
				if (selected == 3)
					selected = 1;
				else if (selected == 4)
					selected = 2;
			}
			if (inputManager.input('s')) {
				if (selected == 1)
					selected = 3;
				else if (selected == 2)
					selected = 4;
			}
			if (inputManager.input('a')) {
				if (selected == 2)
					selected = 1;
				else if (selected == 4)
					selected = 3;
			}
			if (inputManager.input('d')) {
				if (selected == 1)
					selected = 2;
				else if (selected == 3)
					selected = 4;
			}
		} else if (inputManager.spaceHandler(KeyEvent.VK_ENTER)
				&& System.currentTimeMillis() > timer + 500 && hp > 0
				&& ehp > 0) {
			if (selected == 1) {
				timer = System.currentTimeMillis();
				if (mapManager.key_get)
					damage = (int) Math.round((basedamage / e_def[monsterType])
							+ generator.nextInt(10));
				else
					damage = (int) Math.round((basedamage / e_def[monsterType])
							+ generator.nextInt(3));
				e_damage = Math.round((e_basedamage[monsterType] / def)
						+ generator.nextInt(5));
				ehp -= damage;
				hp -= e_damage;
				output = "You dealt " + damage + " damage and got hit with "
						+ e_damage + " damage.";
			}
			if (selected == 2 && mana > 0) {
				timer = System.currentTimeMillis();
				if (mapManager.key_get)
					damage = (int) Math
							.round((fire_basedamage / e_def[monsterType])
									+ generator.nextInt(10));
				else
					damage = (int) Math
							.round((fire_basedamage / e_def[monsterType])
									+ generator.nextInt(3));
				e_damage = Math.round((e_basedamage[monsterType] / def)
						+ generator.nextInt(5));
				ehp -= damage;
				hp -= e_damage;
				mana -= 4;
				output = "You dealt " + damage + " damage and got hit with "
						+ e_damage + " damage.";
			}
			if (selected == 3) {
				timer = System.currentTimeMillis();
				e_damage = Math.round((e_basedamage[monsterType] / def)
						+ generator.nextInt(5));
				hp = hp + 40 - e_damage;
				output = "You recovered " + 40 + " health and got hit with "
						+ e_damage + " damage.";
			}
			if (selected == 4) {
				timer = System.currentTimeMillis();
				e_damage = Math.round((e_basedamage[monsterType] / def)
						+ generator.nextInt(5));
				hp -= e_damage;
				mana += 20;
				output = "You recovered " + 10 + " mana and got hit with "
						+ e_damage + " damage.";
			}
		}
		if (hp > maxhp)
			hp = maxhp;
		if (mana < 0)
			mana = 0;
		else if (mana > maxmana)
			mana = maxmana;
		if (hp < 0) {
			hp = 0;
			output = "The " + monster[monsterType] + " killed you...";
			timer = System.currentTimeMillis();
		} else if (ehp <= 0 && hp > 0 && !indicator
				&& System.currentTimeMillis() > timer + 1000) {
			indicator = true;
			ehp = 0;
			output = "You killed the " + monster[monsterType] + ".";
			end_timer = System.currentTimeMillis();
		}
		if (ehp <= 0 && System.currentTimeMillis() > end_timer + 1000
				&& indicator) {
			encounter = false;
			musicManager.stopBattle();
			musicManager.background(new File("resources/reactor.wav"));

		} else if (hp <= 0 && System.currentTimeMillis() > end_timer + 1000) {
			encounter = false;
			mapManager.roomno = 1;
			mapManager.facing = 'f';
			musicManager.stopBattle();
			musicManager.background(new File("resources/reactor.wav"));
		}
	}
}