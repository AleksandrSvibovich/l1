package Day10.task_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class MonthName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String monthName = br.readLine();
        Map<String,Integer> month = new HashMap<>();
        month.put("january",1);
        month.put("february",2);
        month.put("march",3);
        month.put("april",4);
        month.put("may",5);
        month.put("june",6);
        month.put("july",7);
        month.put("august",8);
        month.put("september",9);
        month.put("octcober",10);
        month.put("november",11);
        month.put("december",12);

        monthName = monthName.toLowerCase();
        if(month.containsKey(monthName)){
            Integer s = month.get(monthName);
            System.out.println( monthName + " is " + s + " month");
        }
    }
}
