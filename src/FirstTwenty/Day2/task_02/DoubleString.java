package Day2.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class DoubleString {
    public static void main(String[] args) throws IOException {
        doubleString2(getStrings());

    }


    public static ArrayList<String> getStrings() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5; i++) {
            list.add(i,br.readLine());
        }
        return list;
    }

    public static void doubleString2(ArrayList<String> list){
        for (int i = 0; i <list.size();) {
            list.add(i+1,list.get(i));
            i+=2;

        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void doubleString(ArrayList<String> list){
        int lim = list.size();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i <lim; i++) {
            list2.add(list.get(i));
            list2.add(list.get(i));

        }

        for (int i = 0; i <list2.size() ; i++) {
            System.out.println(list2.get(i));
        }
    }
}
