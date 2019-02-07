package horstman.part7.frame_image_test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Aleksandr_Svibovich on 10/12/2018.
 */
public class ImageComponent extends JComponent {
    private static final int D_HEIGHT = 420;
    private static final int D_WEIGHT = 640;
    private Image img;

    public ImageComponent() {
        URL url = null;
        BufferedImage bi = null;
        try {
            url = new URL("http://www.skiff-pharm.ru/images/publications/img-public1-21-05-2018.jpg");
            bi = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        img = new ImageIcon(bi).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Order", 190, 120);
        g.drawImage(img, 80, 80, null);
        g.drawString("Is Important", 120, 120);


    }

    public Dimension getPreferredSize() {
        return new Dimension(D_WEIGHT, D_HEIGHT);
    }
}
