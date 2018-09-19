package Day12.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/18/2018.
 */
public class StackTraceten {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    private static StackTraceElement[] method1() {
        return method2();
    }

    private static StackTraceElement[] method2() {
        return method3();
    }

    private static StackTraceElement[] method3() {
        return method4();
    }

    private static StackTraceElement[] method4() {
        return Thread.currentThread().getStackTrace();
    }
}
