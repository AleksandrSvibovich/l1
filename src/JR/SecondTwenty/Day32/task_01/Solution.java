package JR.SecondTwenty.Day32.task_01;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Solution {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        System.out.println(a.getClass().getSimpleName());
    }
}
