package Day1.task_14;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class FinalizeTest {


    private static int countCat = 0;
    @Override
    protected void finalize() throws Throwable{
        System.gc();
        countCat--;
        System.out.println("object destroyed");
    }

    public FinalizeTest(){
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }
}
