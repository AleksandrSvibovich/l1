package com.my.projectc.game.controller;

import com.my.projectc.game.model.Cell;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Life extends Engine {

    @Override
    public boolean isAppropriateCell(Cell cell) {
        return !cell.isCellAlive();
    }

    @Override
    public boolean shouldChangeCellState(int numOfNeighbors) {
        return numOfNeighbors == 3;
    }
}
