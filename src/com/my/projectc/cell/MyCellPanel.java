package com.my.projectc.cell;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Aleksandr_Svibovich on 1/22/2019.
 */
public class MyCellPanel extends JPanel {
    protected static int SIZE = 10;
    private int xsize; // количество столбцов
    private int ysize; // кол-во строк
    protected java.util.List<MyCell> list;
    private Random rand = new Random();

    public MyCellPanel(int height , int width) {
        xsize = height / SIZE;
        ysize = width / SIZE;
        setOpaque(true);
        setPreferredSize(new Dimension(height,width));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        if (list != null) {
            for (int i = 0; i < xsize; i++) {
                for (int j = 0; j < ysize; j++) {
                    MyCell cell = getCell(i, j);
                    if (cell.isCellAlive()) {
                        g.fillOval(i * SIZE, j * SIZE, SIZE, SIZE);
                    }
                }
            }
        }else {
            initiateStartScreen();
        }
    }

    protected MyCell getCell(int x, int y) {
        return list.get(x * xsize + y);
    }

    protected int getXsize() {
        return xsize;
    }

    protected int getYsize() {
        return ysize;
    }

    public void initiateStartScreen() {
        list = new ArrayList<>();
        for (int i = 0; i < xsize; i++) {
            for (int j = 0; j < ysize; j++) {
                MyCell cell = new MyCell(false);
                cell.setAlive(rand.nextBoolean());
                list.add(cell);
            }
        }
    }


}
