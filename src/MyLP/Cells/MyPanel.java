package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class MyPanel extends JPanel {
    private Insets ins;
    private Random random;
    private static HashSet<Integer[]> positions = new HashSet<>();
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
        for (int i = 10; i < x; i += 10) {
            g.drawLine(i, y, i, 0);
        }
        for (int j = 10; j < y; j += 10) {
            g.drawLine(x, j, 0, j);
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
        cell = generatePosition(cell);
        if (cell != null) {
            listCells.add(cell);
        } else {
            System.out.println("This position is busy");
        }
    }

    private Cell generatePosition(Cell cell) {
        Integer[] coordinates = new Integer[2];
        int width = getWidth();
        int height = getHeight();
        int x = Math.round(random.nextInt(width / 10) * 10);
        int y = Math.round(random.nextInt(height / 10) * 10);
        coordinates[0] = x;
        coordinates[1] = y;
        if (positions.size() == 0) {
            positions.add(coordinates);
            cell.setPosition(coordinates[0], coordinates[1]);
            return cell;
        } else {
            Iterator<Integer[]> iter = positions.iterator();
            while (iter.hasNext()) {
                Integer[] pos = iter.next();
                if (!(pos[0] == coordinates[0] && pos[1] == coordinates[1])) {
                    positions.add(coordinates);
                    cell.setPosition(coordinates[0], coordinates[1]);
                    return cell;
                }
            }
        }
        return null;
    }

}