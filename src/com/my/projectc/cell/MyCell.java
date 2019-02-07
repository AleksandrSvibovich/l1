package com.my.projectc.cell;

/**
 * Created by Aleksandr_Svibovich on 1/22/2019.
 */
public class MyCell {
    private static int SIZE = 10;
    private boolean isAlive;

    public MyCell(boolean b){
        isAlive =b;
    }

    public boolean isCellAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
