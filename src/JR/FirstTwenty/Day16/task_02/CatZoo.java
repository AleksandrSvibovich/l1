package Day16.task_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class CatZoo {
    public static void main(String[] args) {
        Map<String,CatSix> zoo = new HashMap<>();
        zoo.put("Barsik", new CatSix("Basrsik"));
        zoo.put("Barsik1", new CatSix("Basrsik1"));
        zoo.put("Barsik2", new CatSix("Basrsik2"));
        zoo.put("Barsik3", new CatSix("Basrsik3"));
        zoo.put("Barsik4", new CatSix("Basrsik4"));
        zoo.put("Barsik5", new CatSix("Basrsik5"));
        zoo.put("Barsik6", new CatSix("Basrsik6"));

        Set<String> names = zoo.keySet();
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

