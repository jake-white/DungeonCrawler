import java.io.*;

import javax.sound.sampled.*;

public class musicManager {
	public static void soundeffect(File location) {
		Clip effect = null;
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
		Clip background = null;
		try {
			background = AudioSystem.getClip();
			background.open(AudioSystem.getAudioInputStream(location));
		} catch (LineUnavailableException | IOException
				| UnsupportedAudioFileException e) {
		}
		background.loop(Clip.LOOP_CONTINUOUSLY);
	}
}
