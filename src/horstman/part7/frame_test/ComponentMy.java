package horstman.part7.frame_test;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Created by Aleksandr_Svibovich on 10/10/2018.
 */
public class ComponentMy extends JComponent {

    private static final int X = 75;
    private static final int Y = 100;

    private static final int XX = 320;
    private static final int YY = 200;

    private String text = "Hello GUI";
    private Font testFont = new Font("SansSerif",Font.BOLD,15);
    @Override
    protected void paintComponent(Graphics g) {
//
        g.setFont(testFont);
//        g.drawString(text,X,Y);

        Graphics2D g2 = (Graphics2D)g;
        FontRenderContext context = g2.getFontRenderContext();

        Rectangle2D bounds = testFont.getStringBounds(text,context);
        bounds.setRect(160,190,40,60);
        g2.drawString(text,204,300);

    }

//    public Dimension getPrefferedSize(){
//        return new Dimension(XX,YY);
//    }
}
