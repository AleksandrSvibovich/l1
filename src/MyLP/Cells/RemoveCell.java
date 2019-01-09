package MyLP.Cells;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Aleksandr_Svibovich on 12/29/2018.
 */
public class RemoveCell implements Runnable {
    @Override
    public void run() {
        CellsActions ca = new CellsActions();
        ArrayList<Cell> cells = ca.positions();
        HashMap<String, Cell> map = ca.getMap();

        while (cells.size()>=0 && cells.size()<=222){
            try {
                removing(cells,map);
                Thread.currentThread().sleep(10);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }


    }

    private void removing(ArrayList<Cell> cells, HashMap<String, Cell> map){
        for (int i = 0; i <cells.size(); i++) {
            Cell cell = cells.get(i);
            String key = cell.getX1()+""+cell.getX1();
            map.remove(key);
            System.out.println(key);
        }
    }
}
