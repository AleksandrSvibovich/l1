package Day12.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/18/2018.
 */
public class StackTask {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1(){
        method2();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] method5() {
        return Thread.currentThread().getStackTrace();
    }

}
