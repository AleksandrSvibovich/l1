package Day14.task_10;

/**
 * Created by Aleksandr_Svibovich on 9/20/2018.
 */
public class StaicPoint {
    private static int A = 5;
    private static int B = 2 * A;
    private int C = A * B;
    private static int D = A * B;

    public static void main(String[] args)
    {
        A = 5;
        D = 5;
    }
    public int getA()
    {
        return A;
    }
}
