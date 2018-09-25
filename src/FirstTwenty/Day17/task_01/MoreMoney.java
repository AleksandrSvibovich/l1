package Day17.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class MoreMoney {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] a = s.toCharArray();
        for (int i = 0; i <40 ; i++) {
            System.out.println(a);
            a[i] =' ';
        }

        String s1 = "Я не хочу изучать Java, я хочу большую зарплату";
        //напишите тут ваш код
        char[] c = s1.toCharArray();
        for (int i = 0; i < 40; i++)
        {
            for (int j = i; j < c.length; j++)
            {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
}
