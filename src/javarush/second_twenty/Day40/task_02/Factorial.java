package javarush.second_twenty.Day40.task_02;

/**
 * Created by Aleksandr_Svibovich on 10/8/2018.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(1));
        System.out.println(getFactorial(8));
        System.out.println(getFactorial(5));

    }

    public static int getFactorial(int lim){
        int factorial = 1;
        if(lim == 0 || lim == 1){
            return lim;
        }else {
            for (int i = 1; i <=lim; i++) {
                factorial *=i;
            }
        }
        return factorial;
    }
}
