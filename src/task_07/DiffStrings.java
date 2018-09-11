package task_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class DiffStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            list.add(i,br.readLine());
        }

        System.out.println("Size of list is " + list.size());

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
