package Day7.task_02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 9/16/2018.
 */
public class NameLastNameSame {
    public static void main(String[] args) {
        int sameNames = 0;
        int sameLastNames = 0;
        Map<String,String>names = new HashMap<>();
        names.put("Василий","Иванов");
        names.put("Алексей","Иванов");
        names.put("Дмитрий","Иванов");
        names.put("Uber","Петров");
        names.put("Олег","Петров");
        names.put("Степан","Петров");
        names.put("Иннокентий","Сидоров");
        names.put("Константин","Сидоров");

        NameLastNameSame nameSame = new NameLastNameSame();
        sameNames = nameSame.findSameNames(names,"Василий");
        sameLastNames = nameSame.findSameLastNames(names,"Иванов");
        System.out.println("Same names " + sameNames + " and same Last Names " + sameLastNames);
    }

    private int findSameLastNames(Map<String, String> names, String nameSearch) {
        int counter = 0;
        for (Map.Entry<String,String> pair: names.entrySet()) {
            if(pair.getValue().equalsIgnoreCase(nameSearch)){
                counter++;
            }
        }
        return counter;
    }

    private int findSameNames(Map<String, String> names, String lastNameSeacrh) {
        int counter = 0;
        for (Map.Entry<String,String> pair: names.entrySet()) {
            if(pair.getKey().equalsIgnoreCase(lastNameSeacrh)){
                counter++;
            }
        }
        return counter;

    }
}
