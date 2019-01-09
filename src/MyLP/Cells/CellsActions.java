package MyLP.Cells;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Aleksandr_Svibovich on 12/29/2018.
 */
public final class CellsActions {
    private Random random = new Random();
    private final static ArrayList<Cell> cells = new ArrayList<>();
    private final static HashMap<String, Cell> map = new HashMap<>();

    public ArrayList<Cell> positions() {
        return cells;
    }

    public void generate(int width, int height) {
        Cell cell = new Cell();
        int x = Math.round(random.nextInt(width / 10) * 10);
        int y = Math.round(random.nextInt(height / 10) * 10);
        cell.setPosition(x, y);
        if (map.isEmpty()){
            map.put(x + "" + y, cell);
            cells.add(cell);
        }else {
            if(map.get(x + "" + y)==null){
                map.put(x + "" + y, cell);
                cells.add(cell);
            }else {
                System.out.println("This filed is busy");
            }
        }
    }

    public static HashMap<String, Cell> getMap() {
        return map;
    }

}


