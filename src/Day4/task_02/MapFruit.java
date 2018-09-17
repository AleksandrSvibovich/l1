package Day4.task_02;

import java.util.HashMap;
import java.util.Map;

public class MapFruit {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Hvost","Chast");
        map.put("Bober","Zver");
        map.put("Koza","Zver");
        map.put("Nos","Chast");
        map.put("Roga","Chast");

        for (Map.Entry pair:map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
