package HM.part7.frameTest2D;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/10/2018.
 */
public class Frame2D extends JFrame {
    private static final int DEFAULT_WIDTH = 350;
    private static final int DEFAULT_HEIGHT = 350;

    public Frame2D(){

        setSize(DEFAULT_HEIGHT,DEFAULT_WIDTH);
        Component2D comp = new Component2D();
        add(comp);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(Frame.NORMAL); // не работает
        setLocation(380,60);
        setVisible(true);


    }

}
