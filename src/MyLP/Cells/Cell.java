package MyLP.Cells;

public class Cell {


    private boolean isAlive;

    public Cell(boolean b){
        isAlive =b;
    }

    public boolean isCellAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
