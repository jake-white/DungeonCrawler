import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

public class imageManager {
	public static BufferedImage gate1, gate2, chest1, chest2, keyblade;

	public static void loadBufferedImage() {
		try {
			gate1 = ImageIO.read(new File("resources/gate.png"));
			gate2 = ImageIO.read(new File("resources/gate2.png"));
			gate2 = ImageIO.read(new File("resources/gate2.png"));
			chest1 = ImageIO.read(new File("resources/chest_closed.png"));
			chest2 = ImageIO.read(new File("resources/chest_open.png"));
			keyblade = ImageIO.read(new File("resources/keyblade.png"));
		} catch (IOException e) {
		}
	}
}
