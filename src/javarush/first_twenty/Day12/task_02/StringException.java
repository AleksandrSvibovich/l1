package Day12.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class StringException {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toLowerCase();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }

    }
}
