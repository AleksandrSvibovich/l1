package Day17.task_04;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class StaticMin {
    private int A = 5;
    private int B = 5;
    private int C = 5;
    private int D = 5;

    public static void main(String[] args)
    {
        StaticMin solution = new StaticMin();
        solution.A = 5;
        solution.B = 5 * solution.getB();
        solution.C = 5 * solution.getC() * solution.getD();
        solution.D = 5 * solution.getD() * solution.getC();
        solution.D = 5;
    }
    public int getA()
    {
        return A;
    }


    public int getB()
    {
        return B;
    }

    public int getC()
    {
        return C;
    }

    public int getD()
    {
        return D;
    }
}
