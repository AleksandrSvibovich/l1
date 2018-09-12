package task_16;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class StaticCat {
    public static ArrayList<StaticCat> cats = new ArrayList<>();

    public StaticCat(){
        cats.add(this);
    }

    public static void printCats(){
        for (int i = 0; i <cats.size() ; i++) {
            System.out.println(i + " : "+ cats.get(i));
        }
    }
}
