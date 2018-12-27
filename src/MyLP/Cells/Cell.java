package MyLP.Cells;

import java.awt.*;

public class Cell extends Rectangle {
    protected static final int SIZE = 10;
    private int x;
    private int y;

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    private boolean isAlive;

    public Cell(){
        isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setPosition(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int getX1() {
        return x;
    }

    public int getY1() {
        return y;
    }

}