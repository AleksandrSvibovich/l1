package MyLP.GameOfLife;

import MyLP.MultiCells.MyCell;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Life implements Runnable {
    private FieldGameOfLife field;

    volatile boolean flagActive = true;


    public Life(FieldGameOfLife field){
        this.field = field;
    }

    public void setFlagActive(boolean flagActive) {
        this.flagActive = flagActive;
    }

    @Override
    public void run() {
        while (flagActive){
            nextGeneration();
            field.repaint();
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    private void nextGeneration() {
        for (int i = 0; i < field.xsize; i++) {
            for (int j = 0; j < field.xsize; j++) {
                CellGameOfLife cell = field.getCell(i, j);
                if (cell.isCellAlive()) {
                    int numOfNeighbors = countNeighbors(i, j);
                    if (numOfNeighbors == 3 ) {
                        int[] arr = findEmptyCellNeighbor(i, j);
                        CellGameOfLife cellToLife = field.getCell(arr[0],arr[1]);
                        cellToLife.setAlive(true);
                    }
                }
            }
        }
    }

    private int[] findEmptyCellNeighbor(int i, int j) {
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int ik = i + k;
                int jl = j +l;
                if(!(ik == i && jl ==j)){
                    if(isField(ik,jl)){
                        if (!(field.getCell(ik, jl).isCellAlive())) {
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

    private int countNeighbors(int i, int j) {
        int count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int ik = i + k;
                int jl = j +l;
                if(!(ik == i && jl ==j)){
                    if(isField(ik,jl)){
                        if (field.getCell(ik,jl).isCellAlive()){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private boolean isField(int i, int j) {
        return ((i >= 0 && i <= field.xsize) && (j >= 0 && j <= field.ysize));
    }
}
