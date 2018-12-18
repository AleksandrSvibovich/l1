package H_SWING.Painting;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PaintPanel extends JPanel {
    Insets ins;
    Random rand;

    PaintPanel(int w, int h) {
        setOpaque(true);

        setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        setPreferredSize(new Dimension(w, h));
        rand = new Random();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int heigth = getHeight();
        int width = getWidth();

        ins = getInsets();

        for (int i = ins.left + 5; i <= width - ins.right - 5; i += 4) {
            int h = rand.nextInt(heigth-ins.bottom);
            if(h<= ins.top){
                h = ins.top+1;
            }
            g.drawLine(i,heigth-ins.bottom,i,h);
        }
    }

    public void changeBorderSize(int size){
        setBorder(
                BorderFactory.createLineBorder(Color.RED,size)
        );
    }
}
