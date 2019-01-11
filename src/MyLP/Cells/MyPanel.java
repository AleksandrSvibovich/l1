package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class MyPanel extends JPanel {
    private static final int SIZE = 10;
    protected ArrayList<Cell> list;
    private static int GAME_FIELD_SIZE_X; // количество столбцов
    private static int GAME_FIELD_SIZE_Y; // кол-во строк
    private Random rand = new Random();


    public MyPanel(int x, int y) {
        GAME_FIELD_SIZE_X = x / SIZE;
        GAME_FIELD_SIZE_Y = y / SIZE;
        setOpaque(true);
        setPreferredSize(new Dimension(x, y));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        if (list != null) {
            for (int i = 0; i < GAME_FIELD_SIZE_X; i++) {
                for (int j = 0; j < GAME_FIELD_SIZE_Y; j++) {
                    Cell cell = getCell(i, j);
                    if (cell.isCellAlive()) {
                        g.fillOval(i * SIZE, j * SIZE, SIZE, SIZE);
                    }
                }
            }
        }
    }


    public void initiateStartScreen() {
        list = new ArrayList<>();
        for (int i = 0; i < GAME_FIELD_SIZE_X; i++) {
            for (int j = 0; j < GAME_FIELD_SIZE_Y; j++) {
                Cell cell = new Cell();
                cell.setAlive(rand.nextBoolean());
                list.add(cell);
            }
        }
    }


    public Cell getCell(int x, int y) {
        return list.get(x * GAME_FIELD_SIZE_X + y);
    }

    public ArrayList<Cell> getNextGeneration() {
        ArrayList<Cell> list = new ArrayList<>();
        for (int i = 0; i < GAME_FIELD_SIZE_X; i++) {
            for (int j = 0; j < GAME_FIELD_SIZE_Y; j++) {
                Cell cell = getCell(i, j);
                if (cell.isCellAlive()) {
                    int numOfNeighbors = countNeighbors(i, j);
                    if (numOfNeighbors <= 2 || numOfNeighbors >= 4) {
                        cell.setAlive(false);
                        list.add(cell);
                    } else {
                        list.add(cell);
                    }
                }else {
                    list.add(cell);
                }
            }
        }
        return list;
    }

    private boolean isField(int i, int j) {
        return (!((i < 0 || i > GAME_FIELD_SIZE_X) || (j < 0 || j > GAME_FIELD_SIZE_Y)));
    }

    private int countNeighbors(int i, int j) {
        int count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                if (!(k == i && l == j)) {
                    if (isField((k + i), (j + l))) {
                        if (getCell(k + i, j + l).isCellAlive()) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}

