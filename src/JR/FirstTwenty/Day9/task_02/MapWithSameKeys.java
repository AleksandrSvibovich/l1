package Day9.task_02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class MapWithSameKeys {
    public static void main(String[] args) {
        Map<String,String> mapa = new HashMap<>();
        mapa.put("Kozlov", "Ivan");
        mapa.put("Petuhov", "Pyotr");
        mapa.put("Baranov", "Sidor");
        mapa.put("Kuritsyn", "Ivan");
        mapa.put("Ovnov", "Alex");
        mapa.put("Gusev", "Foma");
        mapa.put("Baranov", "Luka");
        mapa.put("Muravyov", "Matvey");
        mapa.put("Zhukov", "Ignat");
        mapa.put("Konev", "Fedor");

        for (Map.Entry pair: mapa.entrySet() ) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }
}
