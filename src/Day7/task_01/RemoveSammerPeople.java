package Day7.task_01;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Aleksandr_Svibovich on 9/14/2018.
 */
public class RemoveSammerPeople {
    public static void main(String[] args) {

        Map<String, Date> people = new HashMap<>();
        people.put("JANUARY", getDate(2010, 0, 5));
        people.put("FEBRUARY", getDate(2010, 1, 5));
        people.put("MARCH", getDate(2010, 2, 5));
        people.put("APRIL", getDate(2010, 3, 5));
        people.put("MAY", getDate(2010, 4, 5));
        people.put("JUNE", getDate(2010, 5, 5));
        people.put("JULY", getDate(2010, 6, 5));
        people.put("AUGUST", getDate(2010, 7, 5));
        people.put("SEPTEMBER", getDate(2010, 8, 5));

        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");

        people = removeSum(people);

        for (Map.Entry pair : people.entrySet()) {
            System.out.println(pair.getKey() + " " + f.format(pair.getValue()));
        }

    }

    private static Date getDate(int year, int mounth, int day) {
        Calendar c = Calendar.getInstance();
        c.set(year, mounth, day);
        return c.getTime();
    }

    public static Map<String, Date> removeSum(Map<String, Date> people) {
        Map<String, Date> people2 = new HashMap<>();
        people2.putAll(people);
        for (Map.Entry<String,Date> search: people.entrySet()) {
            String data = search.getValue().toString();
            if(data.contains("Jul")||data.contains("Jun")||data.contains("Aug")){
                String s = search.getKey();
                people2.remove(s);
            }
        }
        return people2;
    }
}
