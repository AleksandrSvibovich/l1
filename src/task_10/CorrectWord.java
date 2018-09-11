package task_10;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class CorrectWord {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mama");
        list.add("wash");
        list.add("window");
        for (int i = 0; i <list.size(); i++) {
            if(!(list.get(i).equalsIgnoreCase("correct"))){
                list.add(i+1,"correct");
            }
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
