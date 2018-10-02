package SecondTwenty.Day24.task_01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Collections.sort;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class ReadCountableNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String adress = br.readLine();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        FileInputStream fis = new FileInputStream(adress);
        while (fis.available() > 0) {
            int data = fis.read();
            char data1 = (char) data;
            sb.append(data1);
        }

        StringTokenizer st = new StringTokenizer(sb.toString(), " ,:;\t\n\r.");
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        ArrayList<Integer> setList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if(((Integer.parseInt(list.get(i)))%2)==0){
                setList.add(Integer.parseInt(list.get(i)));
            }
        }
        sort(setList);
        Iterator<Integer> it = setList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        fis.close();
        String a = "D:\\L2\\l1\\src\\SecondTwenty\\Day24\\task_01\\text.txt";
    }
}
