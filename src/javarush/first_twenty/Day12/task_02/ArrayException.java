package Day12.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class ArrayException {
    public static void main(String[] args) {
        int[] m = new int[2];

        try{
            m[8] = 5;
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
