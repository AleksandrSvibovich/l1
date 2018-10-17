package Day12.task_02;

import java.util.HashMap;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class MapException {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
        map.remove(null);


    }
}
