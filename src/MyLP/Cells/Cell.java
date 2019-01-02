package MyLP.Cells;

import java.awt.*;

public class Cell extends Rectangle {
    protected static final int SIZE = 10;
    private int x;
    private int y;
    private boolean isAlive;

    public void setPosition(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getX1() {
        return x;
    }

    public int getY1() {
        return y;
    }

}