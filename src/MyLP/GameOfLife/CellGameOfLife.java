package MyLP.GameOfLife;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class CellGameOfLife {
    private boolean isAlive;

    public CellGameOfLife(boolean status) {
        isAlive = status;
    }

    public boolean isCellAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
