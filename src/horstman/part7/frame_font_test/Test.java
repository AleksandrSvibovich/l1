package horstman.part7.frame_font_test;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/11/2018.
 */
public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameFont frame = new FrameFont();
                frame.setTitle("FONTS");
            }
        });
    }
}
