package Day5.task_01;

import java.util.HashMap;
import java.util.Map;

public class CatList {
    public static void main(String[] args) {
        HashMap<String,HashCat> list = new HashMap<>();
        list.put("Barsik", new HashCat("Barsik"));
        list.put("Kotik", new HashCat());
        list.put("Svinka", new HashCat("Mishka"));
        list.put("Cat", new HashCat("Murzik"));

        for (Map.Entry pair : list.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue().toString());
        }
    }
}
