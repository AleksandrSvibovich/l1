package com.my.projectc.mover;

import java.awt.*;

public class MoverRuner implements Runnable {
    private int time;
    private static final int MIN = 5;
    private static final int MILlISECONDS = 1000;

    public MoverRuner(int lim) {
        if (lim < MIN) {
            time = MIN * MILlISECONDS;
        } else {
            time = lim * MILlISECONDS;
        }
    }

    @Override
    public void run() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Robot robot = new Robot();
                int x = (int) (Math.random() * size.width);
                int y = (int) (Math.random() * size.height);
                robot.mouseMove(x, y);
                Thread.sleep(time);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println(e.getCause() + " " + e.getMessage());
        }finally {
            System.out.println(Thread.currentThread().getStackTrace());
        }
    }
}
