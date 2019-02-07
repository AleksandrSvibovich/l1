package horstman.part7.frame_font_test;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by Aleksandr_Svibovich on 10/11/2018.
 */
public class ComponentFont extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        String mess = "Test Font Message";

        Font f = new Font("Serif",Font.BOLD,25);
        g2.setFont(f);

        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(mess,context);

        double x = (getWidth() - bounds.getWidth())/2;
        double y = (getHeight() - bounds.getHeight())/2;

        double ascent = -bounds.getY();
        double baseY = y + ascent;

        g2.drawString(mess, (int) x, (int) baseY);

        g2.setPaint(Color.BLUE);

        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(),baseY));

        Rectangle2D rectangle2D = new Rectangle2D.Double(x, y, bounds.getWidth(),bounds.getHeight());
        g2.draw(rectangle2D);
    }
}
