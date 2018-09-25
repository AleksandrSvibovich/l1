package Day14.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class CatchClass {
    public static void main(String[] args) {
        try {
            methodCatcher();
        } catch (Exception3 exception3) {
            exception3.printStackTrace();
        } catch (Exception2 exception2) {
            exception2.printStackTrace();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

    }

    public static void methodCatcher() throws Exception1,Exception2,Exception3{
        int q = (int)(Math.random()*3);
        switch (q){
            case 0: throw new Exception1();
            case 1: throw new Exception2();
            case 2: throw new Exception3();
        }
    }
}
