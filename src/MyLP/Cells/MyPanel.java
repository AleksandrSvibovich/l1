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
    //    protected boolean[][] array;
    private Random rand = new Random();


    public MyPanel(int x, int y) {
        GAME_FIELD_SIZE_X = x / SIZE;
        GAME_FIELD_SIZE_Y = y / SIZE;
//        array = new boolean[GAME_FIELD_SIZE_X][GAME_FIELD_SIZE_Y];
        setOpaque(true);
        setPreferredSize(new Dimension(x, y));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        if(list!=null){
            for (int i = 0; i <GAME_FIELD_SIZE_X; i++) {
                for (int j = 0; j <GAME_FIELD_SIZE_Y; j++) {
                    if (getCell(i,j).isCellAlive()){
                        g.fillOval(i*SIZE,j*SIZE,SIZE,SIZE);
                    }
                }
            }
        }else {
            list = new ArrayList<>();
            initiateStartScreen();
        }

//        if (array != null) {
//            for (int i = 0; i < GAME_FIELD_SIZE_X; i++) {
//                for (int j = 0; j < GAME_FIELD_SIZE_Y; j++) {
//                    if (array[i][j]) {
//                        g.fillOval(i * SIZE, j * SIZE, SIZE, SIZE);
//                    }
//                }
//            }
//        } else {
//            array = new boolean[GAME_FIELD_SIZE_X][GAME_FIELD_SIZE_Y];
//        }
    }


    public void initiateStartScreen() {
        for (int i = 0; i < GAME_FIELD_SIZE_X; i++) {
            for (int j = 0; j < GAME_FIELD_SIZE_Y; j++) {
                Cell cell = new Cell();
                cell.setAlive(rand.nextBoolean());
                list.add(cell);
            }
        }
    }

    public void step() {
//        array = new CellPositions().neighbors();
    }

    public Cell getCell(int x, int y) {
        Cell cell = list.get(x * GAME_FIELD_SIZE_X + y);
        return cell;
    }

}

