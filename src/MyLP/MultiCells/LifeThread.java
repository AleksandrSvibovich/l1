package MyLP.MultiCells;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr_Svibovich on 1/22/2019.
 */
public class LifeThread extends Thread {
    private MyCellPanel panel;
    protected List<MyCell> listWithCells;

    public LifeThread(MyCellPanel panel){
        this.panel = panel;
    }

    private volatile boolean isAlive = true;

    public void setThreadStop(){
        isAlive = false;
    }

    public void setAlive(){
        isAlive = true;
    }

    public void run(){
        setAlive();
        while (isAlive){
            panel.list = getNextGeneration();
            panel.repaint();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private synchronized List<MyCell> getNextGeneration() {
        listWithCells = listWithDeadCells();
        for (int i = 0; i < panel.getXsize(); i++) {
            for (int j = 0; j < panel.getYsize(); j++) {
                MyCell cell = panel.getCell(i, j);
                if (cell.isCellAlive()) {
                    int numOfNeighbors = countNeighbors(i, j);
                    if (numOfNeighbors <2 || numOfNeighbors >= 4) {
                        getCellFromNextGeneration(i,j).setAlive(false);
                    } else {
                        getCellFromNextGeneration(i,j).setAlive(true);
                        int[] arr = findEmptyCellNeighbor(i, j);
                        MyCell cellToLife = getCellFromNextGeneration(arr[0],arr[1]);
                        cellToLife.setAlive(true);


                    }
                }
            }
        }
        return listWithCells;
    }

    private List<MyCell> listWithDeadCells() {
        List<MyCell> emty = new ArrayList<>();
        for (int i = 0; i < panel.getXsize(); i++) {
            for (int j = 0; j < panel.getYsize(); j++) {
                emty.add(new MyCell(false));
            }
        }
        return emty;
    }

    private int countNeighbors(int i, int j) {
        int count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int ik = i + k;
                int jl = j +l;
                if(!(ik == i && jl ==j)){
                    if(isField(ik,jl)){
                        if (panel.getCell(ik,jl).isCellAlive()){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private boolean isField(int i, int j) {
        return ((i >= 0 && i <= panel.getXsize()) && (j >= 0 && j <= panel.getYsize()));
    }

    private int[] findEmptyCellNeighbor(int i, int j) {
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                int ik = i + k;
                int jl = j +l;
                if(!(ik == i && jl ==j)){
                    if(isField(ik,jl)){
                        if (!(getCellFromNextGeneration(ik, jl).isCellAlive())) {
                            int[] ar = new int[2];
                            ar[0] = ik;
                            ar[1] = jl;
                            return ar;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void mouseAction(int x, int y) {
        MyCell cell = panel.getCell(x/panel.SIZE,y/panel.SIZE);
        if (cell.isCellAlive()){
            cell.setAlive(false);
        }else {
            cell.setAlive(true);
        }
        panel.repaint();
    }

    public MyCell getCellFromNextGeneration(int x, int y) {
        return listWithCells.get(x * panel.getXsize() + y);
    }
}
