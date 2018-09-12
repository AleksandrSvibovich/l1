package Day1.task_14;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class Dog {    protected void finalize() throws Throwable{
    System.gc();
    System.out.println("object destroyed");
}
}
