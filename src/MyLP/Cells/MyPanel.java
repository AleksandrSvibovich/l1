package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyPanel extends JPanel {
    Insets ins;
    Random random;
    int x;
    int y;

    public MyPanel(int x, int y) {
        this.x = x;
        this.y = y;
        setOpaque(true);
        setPreferredSize(new Dimension(x, y));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        random = new Random();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int heigth = getHeight();
        int width = getWidth();

        ins = getInsets();
        g.setColor(Color.BLACK);

        for (int i = 0; i < (x*y)/50; i++) {
            int x = random.nextInt(width - ins.bottom);
            int y = random.nextInt(heigth - ins.left);
            g.fillRect(x, y, 4, 4);
        }

    }
}
