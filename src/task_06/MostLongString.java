package task_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class MostLongString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int size = Integer.MIN_VALUE;

        for (int i = 0; i <5 ; i++) {
            list.add(i,br.readLine());
        }

        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).length()>size){
                size = list.get(i).length();
            }
        }

        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).length() == size){
                System.out.println( " - " + list.get(i));
            }
        }
    }
}
