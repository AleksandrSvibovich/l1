package Day14.task_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aleksandr_Svibovich on 9/20/2018.
 */
public class DateConverter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readedString = br.readLine();
        SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
        Date date = formater.parse(readedString);
        SimpleDateFormat form = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(form.format(date));

    }
}
