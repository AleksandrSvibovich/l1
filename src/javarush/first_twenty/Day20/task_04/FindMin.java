package Day20.task_04;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class FindMin {
    public static void main(String[] args) {
        long one = 213213213;
        long two = 2132099213;
        System.out.println(findMinNumP(one, two));
    }

    private static long findMinNumP(long one, long two) {
        if(one<two){
            return one;
        }else {
            return two;
        }
    }
}
