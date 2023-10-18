package org.example;

import javax.swing.JComponent;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JComponent{
    private BufferedImage bufferedImage;
    JImageDisplay(int height, int width) {
        bufferedImage = new BufferedImage(width, height, 1);

    }
}
