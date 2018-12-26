package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MyPanel extends JPanel {
    Insets ins;
    Random random;
    int x;
    int y;
    private ArrayList<Rectangle> list = new ArrayList<>();

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

        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                Rectangle rectangle = list.get(i);
                rectangle.setBounds(random.nextInt(300), random.nextInt(400), 5, 5);
                Graphics2D g2 = (Graphics2D) g;
                g2.fill(rectangle);
            }
        }
    }

    public void add(Rectangle rect) {
        list.add(rect);
    }
}
