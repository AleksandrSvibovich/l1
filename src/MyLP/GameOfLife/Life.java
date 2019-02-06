package MyLP.GameOfLife;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Life implements Runnable {
    private FieldGameOfLife field;
    private volatile boolean flag = true;
    private Engine engine;


    public Life(FieldGameOfLife field, Engine engine){
        this.field = field;
        this.engine = engine;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag){
            nextGeneration();
            field.repaint();
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void nextGeneration() {
        for (int i = 0; i < field.getXsize(); i++) {
            for (int j = 0; j < field.getYsize(); j++) {
                CellGameOfLife cell = field.getCell(i, j);
                if (cell.isCellAlive()) {
                    int numOfNeighbors = engine.countNeighbors(i, j);
                    if ( numOfNeighbors == 3 ) {
                        engine.makeAliveNeighborCell(i, j);
                    }
                }
            }
        }
    }
}
