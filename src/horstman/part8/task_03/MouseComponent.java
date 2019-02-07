package horstman.part8.task_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class MouseComponent extends JComponent {

    private static final int SIDELENGTH = 10;
    private ArrayList<Rectangle2D> squares;
    private Rectangle2D current;

    public MouseComponent() {
        squares = new ArrayList<>();
        current = null;

        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseMotionHandler());

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for (Rectangle2D rectangle2D : squares) {
            g2.draw(rectangle2D);
        }
    }

    public Rectangle2D find(Point2D point) {
        for (Rectangle2D r : squares) {
            if (r.contains(point))
                return r;
        }
        return null;
    }

    public void add(Point2D point) {
        double x = point.getX();
        double y = point.getY();

        current = new Rectangle2D.Double(x - SIDELENGTH / 2, y - SIDELENGTH / 2, SIDELENGTH, SIDELENGTH);
        squares.add(current);
        repaint();
    }


    public void remove(Rectangle2D rect) {
        if (rect == null) return;
        if (rect == current) current = null;
        squares.remove(rect);
        repaint();

    }

    private class MouseHandler extends MouseAdapter {

        public void mousePressed(MouseEvent event) {
            current = find(event.getPoint());
            if (current == null) add(event.getPoint());
        }

        public void mouseClicked(MouseEvent event){
            current = find(event.getPoint());
            if(current!= null && event.getClickCount() >=2) remove(current);
        }
    }

    private class MouseMotionHandler implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {
            if(current!=null){
                int x = e.getX();
                int y = e.getY();

                current.setFrame(x-SIDELENGTH/2,y-SIDELENGTH/2,SIDELENGTH,SIDELENGTH);
                repaint();
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            if(find(e.getPoint()) == null){
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        }
    }
}


