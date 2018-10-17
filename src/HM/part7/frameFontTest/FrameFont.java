package HM.part7.frameFontTest;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/11/2018.
 */
public class FrameFont extends JFrame {
    private static final int DEFAULT_WIDTH = 350;
    private static final int DEFAULT_HEIGHT = 350;

    public FrameFont(){
        setSize(DEFAULT_HEIGHT,DEFAULT_WIDTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        add(new ComponentFont());
        setVisible(true);
        pack();
    }
}
