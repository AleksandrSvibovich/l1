package SecondTwenty.Day31.task_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Exception10 {
    public static void main(String[] args) {
        List<Exception> list = new ArrayList<>();
        setExp(list);
    }

    public static void setExp(List<Exception> exp) {
        try {
            int f =7/0;
        }catch (ArithmeticException e){
            exp.add(e);
        }
        try {
            Integer a = null;
            a.doubleValue();
        }catch (NullPointerException e){
            exp.add(e);
        }

    }
}
