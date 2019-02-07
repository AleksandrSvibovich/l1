package com.my.projectc.cells;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class MyPanel extends JPanel {
    private static final int SIZE = 10;
    protected volatile ArrayList<Cell> list;
    protected volatile ArrayList<Cell> list2;
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
                Cell cell = new Cell(false);
                cell.setAlive(rand.nextBoolean());
                list.add(cell);
            }
        }
    }


    public Cell getCell(int x, int y) {
        return list.get(x * GAME_FIELD_SIZE_X + y);
    }

    public Cell getCell2(int x, int y) {
        return list2.get(x * GAME_FIELD_SIZE_X + y);
    }

    public ArrayList<Cell> getNextGeneration() {
        list2 = listWithDeadCells();
        for (int i = 0; i < GAME_FIELD_SIZE_X; i++) {
            for (int j = 0; j < GAME_FIELD_SIZE_Y; j++) {
                Cell cell = getCell(i, j);
                if (cell.isCellAlive()) {
                    int numOfNeighbors = countNeighbors(i, j);
                    if (numOfNeighbors <2 || numOfNeighbors >= 4) {
                        getCell2(i,j).setAlive(false);
                    } else {
                        getCell2(i,j).setAlive(true);
                        int[] arr = findEmptyCellNeighbor(i, j);
                        Cell cellToLife = getCell2(arr[0],arr[1]);
                        cellToLife.setAlive(true);


                    }
                }
            }
        }
        return list2;
    }

    private ArrayList<Cell> listWithDeadCells() {
        ArrayList<Cell> emty = new ArrayList<>();
        for (int i = 0; i < GAME_FIELD_SIZE_X; i++) {
            for (int j = 0; j < GAME_FIELD_SIZE_Y; j++) {
                emty.add(new Cell(false));
            }
        }
        return emty;
    }

    private int[] findEmptyCellNeighbor(int i, int j) {
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int ik = i + k;
                int jl = j +l;
                if(!(ik == i && jl ==j)){
                    if(isField(ik,jl)){
                        if (!(getCell2(ik, jl).isCellAlive())) {
                            int[] ar = new int[2];
                            ar[0] = ik;
                            ar[1] = jl;
                            return ar;
                        }
                    }
                }
            }
        }
        return null;
    }

    private boolean isField(int i, int j) {
        return ((i >= 0 && i <= GAME_FIELD_SIZE_X) && (j >= 0 && j <= GAME_FIELD_SIZE_Y));
    }

    private int countNeighbors(int i, int j) {
        int count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int ik = i + k;
                int jl = j +l;
                if(!(ik == i && jl ==j)){
                    if(isField(ik,jl)){
                        if (getCell(ik,jl).isCellAlive()){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public void mouseAction(int x, int y) {
        Cell cell = getCell(x/SIZE,y/SIZE);
        if (cell.isCellAlive()){
            cell.setAlive(false);
        }else {
            cell.setAlive(true);
        }
        repaint();
    }
}

