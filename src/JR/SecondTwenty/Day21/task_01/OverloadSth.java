package JR.SecondTwenty.Day21.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class OverloadSth {
    static int a = 5;
    static Integer b = 5;
    public static void main(String[] args) {
        OverloadSth s = new OverloadSth();
        s.calc(b);
        s.calc(a);
    }

    public void calc(int num){
        System.out.println(num);
    }

    public void calc(Integer num){
        System.out.println(num*2);
    }
}
