package Day16.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Добавить одну операцию по преобразованию типа, чтобы получался ответ: b=0
 */
public class ChangeType3 {
    public static void main(String[] args) {

        float f = (float)128.50;
        int i = (int)f;
        int b = (byte)(int)(i + f);
        System.out.println(b);
    }
}
