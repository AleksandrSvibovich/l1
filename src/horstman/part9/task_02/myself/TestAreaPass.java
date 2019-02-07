package horstman.part9.task_02.myself;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/17/2018.
 */
public class TestAreaPass {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AreaPass p = new AreaPass();
                p.setSize(350,250);
                p.setVisible(true);
            }
        });
    }
}
