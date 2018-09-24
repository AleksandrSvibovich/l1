package Day16.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class ChangeType4 {
    public static void main(String[] args) {
//        Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine=9
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char)nine);
    }
}
