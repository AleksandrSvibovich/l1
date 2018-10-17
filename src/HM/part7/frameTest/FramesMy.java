package HM.part7.frameTest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/9/2018.
 */
public class FramesMy extends JFrame {
    private static final int DEFAULT_WIDTH = 320;
    private static final int DEFAULT_HEIGHT = 240;

    public FramesMy() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // не работает
        setLocation(380,60);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension diment = toolkit.getScreenSize();
        int width = diment.width;
        int height = diment.width;
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        add(new ComponentMy());
        pack();
    }


}
