package HM.part7.frameTest2D;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/10/2018.
 */
public class Test2D {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame2D frame2 = new Frame2D();
                frame2.setTitle("Figure");
            }
        });
    }
}
