package Day12.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class ExceptionCatch {
    public static void main(String[] args) {

        try {
            int a = 40 / 0;
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}
