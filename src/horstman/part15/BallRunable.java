package horstman.part15;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class BallRunable implements Runnable {
    private static final int STEPS = 10000;
    private static final int DELAY = 50;
    private Ball ball;
    private Component component;

    public BallRunable(Ball aBall, Component aComponent){
        this.ball = aBall;
        this.component = aComponent;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i <STEPS; i++) {
                ball.move(component.getBounds());
//                component.setBackground(Color.BLUE);
//                component.invalidate();
//                component.repaint();

                Thread.sleep(DELAY);
                component.revalidate();
                component.repaint();


                Thread.sleep(DELAY);


            }
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
