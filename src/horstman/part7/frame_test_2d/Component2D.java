package horstman.part7.frame_test_2d;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Aleksandr_Svibovich on 10/10/2018.
 */
public class Component2D extends JComponent {


    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;  // кастим графикс к 2Д формату

//        Ellipse2D ellipse2D2 = new Ellipse2D.Double();
//        ellipse2D2.setFrame(rect);  // вписываем одну фигуру в другую
//        Ellipse2D ellipse2D = new Ellipse2D.Double(75.0, 75.0, 200.0, 200.0);
//        Line2D line = new Line2D.Double();
//        line.setLine(75.0, 75.0, 20.0, 49.0);
        Rectangle2D rect = new Rectangle2D.Double(20.0, 20.0, 200.0, 80.0);
        double x = rect.getCenterX();
        double y = rect.getCenterY();
        double radius = 150;
        Ellipse2D ellipse2D1 = new Ellipse2D.Double(x, y, x + radius, y + radius);
        ellipse2D1.setFrame(rect);


//        g2.setColor(Color.cyan); // указываем цвет
//        g2.draw(ellipse2D2); // рисуем фигуру
//        g2.draw(ellipse2D);
//        g2.draw(rect);
//        g2.fill(rect);  // заливка фигуры цветом
//        g.setColor(Color.BLUE);
//        g2.draw(line);
        g2.draw(rect);
        g2.draw(ellipse2D1);


    }
}
