package Day12.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/18/2018.
 */
public class StackTraceGetLine {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static Integer method1() {
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        return trace[2].getLineNumber();
    }
}
