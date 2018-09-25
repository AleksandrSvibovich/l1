package Day4.task_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPrint {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("Vasja", "Pupkin");
        mapa.put("Gena", "Pupkin");
        mapa.put("Vas", "Pupkin");
        mapa.put("Va", "Zalupkin");
        mapa.put("V", "Zalupkin");

        for (Map.Entry entry: mapa.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key " + key + " and value " + value);
        }

        System.out.println();

        Iterator<Map.Entry<String,String>> iterator = mapa.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            System.out.println(pair.getKey() + " - key! Value - " + pair.getValue());
        }
    }
}
