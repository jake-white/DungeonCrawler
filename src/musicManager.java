import java.io.*;

import javax.sound.sampled.*;

public class musicManager {
	static Clip background = null;
	static Clip effect = null;
	static Clip battle = null;
	public static void soundeffect(File location) {
		try {
			effect = AudioSystem.getClip();
			effect.open(AudioSystem.getAudioInputStream(location));
		} catch (LineUnavailableException | IOException
				| UnsupportedAudioFileException e) {
		}
		effect.start();
	}
	public static void background(File location)
	{
		try {
			background = AudioSystem.getClip();
			background.open(AudioSystem.getAudioInputStream(location));
		} catch (LineUnavailableException | IOException
				| UnsupportedAudioFileException e) {
		}
		background.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public static void battle(File location)
	{
		try {
			battle = AudioSystem.getClip();
			battle.open(AudioSystem.getAudioInputStream(location));
		} catch (LineUnavailableException | IOException
				| UnsupportedAudioFileException e) {
		}
		battle.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public static void stopBackground()
	{
		background.stop();
	}
	public static void stopBattle()
	{
		battle.stop();
	}
}
