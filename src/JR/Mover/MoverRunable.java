package JR.Mover;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class MoverRunable implements Runnable {
    private int time;

    public MoverRunable(int time) {
        if (time < 5) {
           this.time = 5000;
        } else {
            this.time = time * 1000;
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                Robot robot = new Robot();
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                double x = Math.random() * screenSize.getWidth();
                double y = Math.random() * screenSize.getHeight();

                robot.mouseMove((int) x, (int) y);
                Thread.sleep(time);
            }
        } catch (AWTException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e1) {
            e1.getMessage();

        }
    }
}
