package HM.part9.task_08;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class BallComponent extends JPanel {
    private ArrayList<Ball> balls = new ArrayList<Ball>();
    /*
    *Добавить мяч к компоненту.
    *@param b Добавляемый мяч
    */

    public void add(Ball b){
        balls.add(b);


    }

    public void paintComponent (Graphics g){
        super.paintComponents(g);// очистка фона

        Graphics2D g2 = (Graphics2D) g;
        for (Ball b : balls){
            g2.setColor(Color.BLACK);
            g2.fill(b.getShape());
        }
    }
}
