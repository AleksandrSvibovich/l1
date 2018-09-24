package Day16.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class ChangeType5 {
    public static void main(String[] args) {
//        Расставьте правильно операторы приведения типа, чтобы получился ответ: c=256
        int a = (int) 44;
        int b = (int) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}
