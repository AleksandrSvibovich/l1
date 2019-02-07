package Day2.task_01;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class RLString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("r");
        list.add("rl");
        list.add("l");
        list.add("sos");
        fix(list);
    }

    public static void fix(ArrayList<String> list){
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).contains("r") && list.get(i).contains("l")){
               list2.add(list.get(i));
            }else if (list.get(i).contains("l")){
                list2.add(list.get(i));
                list2.add(list.get(i));
            }
            if (list.get(i).contains("r")){
                continue;
            }
        }


        for (int i = 0; i <list2.size() ; i++) {
            System.out.println(list2.get(i));
        }
    }
}
