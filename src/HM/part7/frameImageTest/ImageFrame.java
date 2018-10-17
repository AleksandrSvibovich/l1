package HM.part7.frameImageTest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/12/2018.
 */
public class ImageFrame extends JFrame {

    public ImageFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension diment = toolkit.getScreenSize();
        int width = diment.width;
        int height = diment.width;
        setSize(width/2,height/2);

        add(new ImageComponent());
        setVisible(true);
        pack();
    }
}
