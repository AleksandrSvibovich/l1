package Day4.task_01;

import java.util.HashMap;
import java.util.Map;

public class ForEachMap {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Vasja", "Pupkin");
        mapa.put("Gena", "Pupkin");
        mapa.put("Vas", "Pupkin");
        mapa.put("Va", "Zalupkin");
        mapa.put("V", "Zalupkin");

        for (Map.Entry pair:mapa.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
