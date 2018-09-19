package Day12.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/18/2018.
 */
public class StackTraceTen2 {
    public static void main(String[] args) {
        StackTraceElement[] arr = Thread.currentThread().getStackTrace();
        int i = 0;
        for ( StackTraceElement element : arr) {
                i++;
        }
        System.out.println(i);


    }

}
