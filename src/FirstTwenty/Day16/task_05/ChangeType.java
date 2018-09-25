package Day16.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 *Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
 int a = 0;
 int b = (byte) a + 46;
 byte c = (byte) (a*b);
 double f = (char) 1234.15;
 long d = (short) (a + f / c + b);
 */

 public class ChangeType {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a*b);
        double f = 1234.15d;
        long d = (long) (a + f / c + b);
        System.out.println(d>0);

    }
}
