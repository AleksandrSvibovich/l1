package MyLP.Mover;

import java.awt.*;

public class MoverRuner implements Runnable {
    private int time;
    private static final int MIN = 5;
    private static final int MILlШSECONDS = 1000;

    public MoverRuner(int lim) {
        if (lim < MIN) {
            time = MIN * MILlШSECONDS;
        } else {
            time = lim * MILlШSECONDS;
        }
    }

    @Override
    public void run() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        while (true) {
            try {
                Robot robot = new Robot();
                int x = (int)(Math.random() * size.width);
                int y = (int)(Math.random() * size.height);
                robot.mouseMove(x,y);
                Thread.sleep(time);
            } catch (AWTException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                System.out.println(e.getCause() + " " + e.getMessage());
            }
        }
    }
}
