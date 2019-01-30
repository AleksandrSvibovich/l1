package MyLP.GameOfLife;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Dead implements Runnable {
    private FieldGameOfLife field;

    public Dead(FieldGameOfLife field){
        this.field = field;
    }

    @Override
    public void run() {
        while (true) {
            killCell();
            field.repaint();
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void killCell() {
        for (int i = 0; i < field.xsize; i++) {
            for (int j = 0; j < field.xsize; j++) {
                CellGameOfLife cell = field.getCell(i, j);
                if (cell.isCellAlive()) {
                    int numOfNeighbors = countNeighbors(i, j);
                    if (numOfNeighbors != 3 ) {
                        cell.setAlive(false);
                    }
                }
            }
        }
    }

    private int countNeighbors(int i, int j) {
        int count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int ik = i + k;
                int jl = j +l;
                if(!(ik == i && jl ==j)){
                    if(isField(ik,jl)){
                        if (field.getCell(ik,jl).isCellAlive()){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private boolean isField(int i, int j) {
        return ((i >= 0 && i <= field.xsize) && (j >= 0 && j <= field.ysize));
    }
}
