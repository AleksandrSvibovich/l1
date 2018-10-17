package Day1.task_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class BackOrderStrings {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <5; i++) {
            list.add(br.readLine());
        }

        list.remove(2);

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(list.size()-i -1));
        }

    }
}
