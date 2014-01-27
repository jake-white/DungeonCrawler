import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;

public class imageManager {
	public static BufferedImage gate1, gate2;

	public static void loadBufferedImage() {
		try {
			gate1 = ImageIO.read(new File("resources/gate.png"));
			gate2 = ImageIO.read(new File("resources/gate2.png"));
		} catch (IOException e) {
		}
	}
}
