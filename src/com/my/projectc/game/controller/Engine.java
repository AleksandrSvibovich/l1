package com.my.projectc.game.controller;

import com.my.projectc.game.FieldGameOfLife;
import com.my.projectc.game.model.Cell;

public abstract class Engine implements Runnable {
    private FieldGameOfLife field;

    @Override
    public void run() {
        checkAndChangeCellStateWhereNeeded();
    }

    private void checkAndChangeCellStateWhereNeeded() {
        for (int i = 0; i < field.getXsize(); i++) {
            for (int j = 0; j < field.getYsize(); j++) {
                Cell cell = field.getCell(i, j);
                if (isAppropriateCell(cell)) {
                    int numOfNeighbors = countNeighbors(i, j);
                    if (shouldChangeCellState(numOfNeighbors)) {
                        cell.setUpdated(true);
                    }
                }
            }
        }
    }

    private int countNeighbors(int i, int j) {
        int ik;
        int jl;
        int count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                ik = i + k;
                jl = j + l;
                if ((!(ik == i && jl == j)) && isField(ik, jl)) {
                    if (field.getCell(ik, jl).isCellAlive()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public abstract boolean isAppropriateCell(Cell cell);

    public abstract boolean shouldChangeCellState(int numOfNeighbors);

    public void setFiled(FieldGameOfLife field) {
        this.field = field;
    }

    public FieldGameOfLife getField() {
        return field;
    }

    public boolean isField(int i, int j) {
        return ((i >= 0 && i <= field.getXsize()) && (j >= 0 && j <= field.getYsize()));
    }

}
