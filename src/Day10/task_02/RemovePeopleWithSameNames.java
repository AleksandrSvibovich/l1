package Day10.task_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class RemovePeopleWithSameNames {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("lastName1","firstName");
        map.put("lastName2","firstName1");
        map.put("lastName3","firstName2");
        map.put("lastName4","firstName3");
        map.put("lastName5","firstName");
        map.put("lastName6","firstName4");
        map.put("lastName7","firstName5");
        map.put("lastName8","firstName");
        map.put("lastName9","firstName6");
        map.put("lastName10","firstName");

        removePeopleWithSameName(map);
    }

    private static void removePeopleWithSameName(Map<String, String> map) {
        Map<String,String> tmp = new HashMap<>();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            String val = map.get(key);
            if(!tmp.containsValue(val)){
                tmp.put(key,val);
            }
        }

        for (Map.Entry<String,String> pair: tmp.entrySet()) {
            System.out.println(pair.getKey() + " : "+ pair.getValue());
        }
    }
}
