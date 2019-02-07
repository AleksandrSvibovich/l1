package horstman.part7.frame_test;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/9/2018.
 */
public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FramesMy frame = new FramesMy();
                frame.setVisible(true);
            }
        });
    }

}
