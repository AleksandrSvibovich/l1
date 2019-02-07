package Day12.task_02;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class ListException {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
        }

    }
}
