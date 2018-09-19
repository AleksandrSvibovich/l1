package Day12.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/18/2018.
 */
public class StakcTraceNameMethod {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        return trace[1].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        return trace[1].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        return trace[1].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        return trace[1].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        return trace[1].getMethodName();    }
}
