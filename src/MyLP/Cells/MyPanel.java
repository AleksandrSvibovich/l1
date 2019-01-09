package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MyPanel extends JPanel {

    private int x;
    private int y;
    private ArrayList<Cell> listCells = new CellsActions().positions();

    public MyPanel(int x, int y) {
        this.x = x;
        this.y = y;
        setOpaque(true);
        setPreferredSize(new Dimension(x, y));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 10; i < x; i += 10) {
            g.drawLine(i, y, i, 0);
        }
        for (int j = 10; j < y; j += 10) {
            g.drawLine(x, j, 0, j);
        }


        g.setColor(Color.BLACK);

        if (listCells != null) {
            Iterator<Cell> iter = listCells.iterator();
            while (iter.hasNext()){
                Graphics2D g2 = (Graphics2D) g;
                Cell cell = iter.next();
                cell.setBounds(cell.getX1(), cell.getY1(), cell.SIZE, cell.SIZE);
                g2.fill(cell);
            }
        }
    }
}