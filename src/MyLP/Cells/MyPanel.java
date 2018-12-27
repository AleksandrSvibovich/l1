package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class MyPanel extends JPanel {
    private Insets ins;
    private Random random;
    private static HashSet<Integer> positionsX = new HashSet<>();
    private static HashSet<Integer> positionsY = new HashSet<>();
    private int x;
    private int y;

    private ArrayList<Cell> listCells = new ArrayList<>();

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
        for (int i = 10; i < width; i += 10) {
            g.drawLine(i, heigth, i, 0);
        }
        for (int j = 10; j < heigth; j += 10) {
            g.drawLine(width, j, 0, j);
        }


        ins = getInsets();
        g.setColor(Color.BLACK);

        if (listCells != null) {
            for (int i = 0; i < listCells.size(); i++) {
                Graphics2D g2 = (Graphics2D) g;
                Cell c = listCells.get(i);
                c.setBounds(listCells.get(i).getX1(), listCells.get(i).getY1(), listCells.get(i).SIZE, listCells.get(i).SIZE);
                g2.fill(c);
            }
        }
    }

    public void createCells() {

        Cell cell = new Cell();
        int x = generateXPosition();
        int y = generateYPosition();
        cell.setPosition(x, y);
        listCells.add(cell);

    }

    private int generateXPosition() {
        int width = getWidth();
        int x = Math.round(random.nextInt(width / 10) * 10);
        if (positionsX.contains(x)) {
           
        }
        return x;
    }

    private int generateYPosition() {
        int heigth = getHeight();
        int y = Math.round(random.nextInt(heigth / 10) * 10);
        return y;
    }

}