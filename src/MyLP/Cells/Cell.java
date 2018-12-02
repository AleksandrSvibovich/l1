package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Cell extends JComponent {
    private int size;
    private int x;
    private int y;
    private Color color;

    public Cell(int size, int x, int y, Color color) {
        this.size = size;
        this.x = x;
        this.y = y;
        this.color = color;
    }


    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, size, size);
        g2.setColor(color);
        g2.fill(ellipse2D);
        g2.draw(ellipse2D);

    }
}
