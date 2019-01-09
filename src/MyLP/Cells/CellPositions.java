package MyLP.Cells;


import java.util.ArrayList;
import java.util.Random;

public class CellPositions {
//    private ArrayList<Cell> list = new ArrayList<>();
//    private ArrayList<Cell> list2 = new ArrayList<>();
//    private int x;
//    private int y;
//    private int emptyX;
//    private int emptyY;
//    private Random rand = new Random();
//    private boolean[][] bool;
//    private boolean[][] boolTwo;
//
//    protected  boolean[][] fillArray(int x, int y) {
//        this.x = x;
//        this.y = y;
//        bool = new boolean[x][y];
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                bool[i][j] = rand.nextBoolean();
//            }
//        }
//        return bool;
//    }
//
//    public ArrayList<Cell> neighbors(int gameFieldSizeX, int gameFieldSizeY) {
//        ArrayList<Cell> list= new ArrayList<>();
//        for (int i = 0; i < gameFieldSizeX; i++) {
//            for (int j = 0; j <gameFieldSizeY; j++) {
//
//            }
//
////            if (cell.isAlive()) {
////                int x = cell.getX1();
////                int y = cell.getY1();
////                if ((x - Cell.SIZE) >= 0 && (y - Cell.SIZE) >= 0) {
////                    int neighborsQTY = checkRules(cell, x, y);
////                    if (neighborsQTY <= 2 || neighborsQTY >= 4) {
////                        boolTwo[x][y] = false;
////                    } else if (neighborsQTY == 3) {
////                        boolTwo[emptyX][emptyY] = true;
////                    }
////                }
////            }
//        }
//
//        return list;
                //fillListByBoolean(boolTwo);
//    }
//
//    private int checkRules(Cell cell, int x, int y) {
//        int qty = 0;
//
//        if (bool[x - cell.SIZE][y - cell.SIZE]) qty++;
//        else {
//            emptyX = x - cell.SIZE;
//            emptyY = y - cell.SIZE;
//        }
//        if (bool[x][y - cell.SIZE]) qty++;
//        else {
//            emptyX = x;
//            emptyY = y - cell.SIZE;
//        }
//        if (bool[x + cell.SIZE][y - cell.SIZE]) qty++;
//        else {
//            emptyX = x + cell.SIZE;
//            emptyY = y - cell.SIZE;
//        }
//        if (bool[x - cell.SIZE][y]) qty++;
//        else {
//            emptyX = x - cell.SIZE;
//            emptyY = y;
//        }
//        if (bool[x + cell.SIZE][y]) qty++;
//        else {
//            emptyX = x + cell.SIZE;
//            emptyY = y;
//        }
//        if (bool[x - cell.SIZE][y + cell.SIZE]) qty++;
//        else {
//            emptyX = x - cell.SIZE;
//            emptyY = y + cell.SIZE;
//        }
//        if (bool[x][y + cell.SIZE]) qty++;
//        else {
//            emptyX = x;
//            emptyY = y + cell.SIZE;
//        }
//        if (bool[x + cell.SIZE][y + cell.SIZE]) qty++;
//        else {
//            emptyX = x + cell.SIZE;
//            emptyY = y + cell.SIZE;
//        }
//
//
//        return qty;
//    }
//
//    private ArrayList<Cell> fillListByBoolean(boolean[][] boolTwo) {
//        for (int i = 0; i < x; i += 10) {
//            for (int j = 0; j < y; j += 10) {
//                Cell cell = new Cell();
//                cell.setAlive(bool[i][j]);
//                cell.setPosition(i, j);
//                list2.add(cell);
//            }
//        }
//        list = (ArrayList<Cell>) list2.clone();
//        return list2;
//    }
//


}









