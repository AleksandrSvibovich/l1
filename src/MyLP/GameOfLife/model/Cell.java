package MyLP.GameOfLife.model;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Cell {
    private boolean isAlive;
    private boolean updated;

    public Cell(boolean status) {
        isAlive = status;
    }

    public boolean getUpdated() {
        return updated;
    }

    public boolean isCellAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }
}
