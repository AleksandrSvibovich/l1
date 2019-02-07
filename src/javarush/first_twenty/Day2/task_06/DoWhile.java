package Day2.task_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class DoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        do {
            list.add(i,br.readLine());
            i++;
        }
        while (!list.get(i-1).equalsIgnoreCase("end"));
        list.remove(list.size()-1);



        for (int j = 0; j <list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}
