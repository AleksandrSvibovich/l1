package HM.part7.frameImageTest;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/12/2018.
 */
public class ImageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImageFrame imageFrame = new ImageFrame();
                imageFrame.setTitle("Changed Title");
            }
        });
    }
}
