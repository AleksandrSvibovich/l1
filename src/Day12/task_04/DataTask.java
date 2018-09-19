package Day12.task_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class DataTask {
    public static void main(String[] args) {
        String date = "JAN 3 2018";
        Boolean flag = null;
        try {
            flag = isDateOdd(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(flag);
    }

    private static Boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy");
        Date seacrhData = sdf.parse(date);
        SimpleDateFormat onlyDay = new SimpleDateFormat("D");
        int numDay = Integer.parseInt(onlyDay.format(seacrhData));
        if(numDay%2==0){
            return false;
        }

        return true;
    }
}
