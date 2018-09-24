package Day14.task_06;

/**
 * Created by Aleksandr_Svibovich on 9/20/2018.
 */
public class DevideByZero {
    public static void main(String[] args) {
        try{
            devideByZer();
        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }
    }

    public static void devideByZer(){
        int zero = 89/0;
    }
}
