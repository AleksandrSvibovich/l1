package MyLP.GameOfLife;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Dead implements Runnable {
    private FieldGameOfLife field;
    private Engine engine;
    private volatile boolean flag = true;

    public Dead(FieldGameOfLife field, Engine engine){
        this.field = field;
        this.engine = engine;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            killCell();
            field.repaint();
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void killCell() {
        for (int i = 0; i < field.getXsize(); i++) {
            for (int j = 0; j < field.getYsize(); j++) {
                CellGameOfLife cell = field.getCell(i, j);
                if (cell.isCellAlive()) {
                    int numOfNeighbors = engine.countNeighbors(i, j);
                    if (numOfNeighbors != 3 ) {
                        cell.setAlive(false);
                    }
                }
            }
        }
    }
}
