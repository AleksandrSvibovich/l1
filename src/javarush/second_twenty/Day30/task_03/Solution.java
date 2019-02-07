package javarush.second_twenty.Day30.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(nod(a, b));

    }

    public static int nod(int a, int b) {
        List<Integer> list = new ArrayList<>();
        int lim = 0;
        if (a < b) {
            lim = b;
        }else {
            lim = a;
        }
        for (int i = 1; i <lim; i++) {
            if(a%i==0 && b%i==0){
               list.add(i);
            }
        }
        return list.get(list.size()-1);
    }
}
