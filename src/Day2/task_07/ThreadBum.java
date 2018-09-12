package Day2.task_07;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class ThreadBum {
    public static void main(String[] args) {
        for (int i = 30; i>0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("BOOOOM!");
    }
}
