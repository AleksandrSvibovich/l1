package Day16.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Расставьте правильно операторы приведения типа, чтобы получился ответ: d=3.765
 */
public class ChangeType2 {
    public static void main(String[] args) {

        int a = 15;
        int b = 4;
        float c = (float)a / (float)b;
        double d = a * 1e-3 + c;
        System.out.println(d);
    }
}
