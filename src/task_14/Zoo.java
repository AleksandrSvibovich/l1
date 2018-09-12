package task_14;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class Zoo {


    public static void main(String[] args) throws Throwable {
        FinalizeTest finalizeTest = new FinalizeTest();
        FinalizeTest finalizeTest2 = new FinalizeTest();
        FinalizeTest finalizeTest21 = new FinalizeTest();
        FinalizeTest finalizeTest291 = new FinalizeTest();
        System.out.println(finalizeTest21.getCountCat());
        finalizeTest.finalize();
        System.out.println(finalizeTest21.getCountCat());


    }
}
