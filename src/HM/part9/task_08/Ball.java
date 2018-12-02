package HM.part9.task_08;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class Ball {
    Color c = Color.BLUE;
    private static final int XSIZE = 10;
    private static final int YSIZE = 15;
    private double x = 12;
    private double y = 12;
    private double dx = 5;
    private double dy = 5;


    public void move(Rectangle bounds) {
        x += dx;
        y += dy;
        if (x < bounds.getMinX()){
            x = bounds.getMinX() ;
            dx = -dx;
        }
        if (x + XSIZE >= bounds.getMaxX()){
            x = bounds.getMaxX() - XSIZE;
            dx = -dx;
        }
        if (y < bounds.getMinY()){
            y = bounds.getMinY() ;
            dy = -dy;
        }
        if (y + YSIZE >= bounds.getMaxY()){
            y = bounds.getMaxY() - YSIZE;
            dy = -dy;
        }
    }

    /*
    *Получает форму мяча в текущей позиций.
    */

    public Ellipse2D getShape (){
        return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
    }



}
