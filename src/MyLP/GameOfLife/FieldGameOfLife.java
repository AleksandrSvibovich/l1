package MyLP.GameOfLife;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import MyLP.GameOfLife.model.Cell;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class FieldGameOfLife extends JPanel {
    private final int xsize;
    private final int ysize;

    private volatile ArrayList<Cell> listCell = new ArrayList<>();
    protected Random random = new Random();

    public FieldGameOfLife(int height, int width){
        xsize = width / 10;
        ysize = height / 10;
        setOpaque(true);
        setPreferredSize(new Dimension(width,height));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        initializeScreen();
        if (listCell != null && !(listCell.isEmpty())) {
            for (int i = 0; i < xsize; i++) {
                for (int j = 0; j < ysize; j++) {
                    Cell cell = getCell(i, j);
                    if (cell.isCellAlive()) {
                        g.fillOval(i * 10, j * 10, 10, 10);
                    }
                }
            }
        }
    }

    private void initializeScreen() {
        for (int i = 0; i < xsize; i++) {
            for (int j = 0; j < ysize; j++) {
                boolean status = random.nextBoolean();
                Cell cell = new Cell(status);
                listCell.add(cell);
            }
        }
    }

    public synchronized Cell getCell(int x, int y){
        return listCell.get(x * xsize + y);
    }

    public int getXsize() {
        return xsize;
    }

    public int getYsize() {
        return ysize;
    }

    public void setListCell(ArrayList<Cell> listCell) {
        this.listCell = listCell;
    }

}
