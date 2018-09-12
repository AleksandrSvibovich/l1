package Day1.task_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class MostShortString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        printShortestLine(readFifeLines());
    }

    public static ArrayList<String> readFifeLines() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <5; i++) {
            list.add(br.readLine());
        }
        return list;
    }

    public static void printShortestLine(ArrayList<String> list){
        int size = Integer.MAX_VALUE;
        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).length()<size){
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
