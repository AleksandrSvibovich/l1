package Day14.task_04;

import java.io.IOException;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class ExceptionsAgainFour {
    public static void main(String[] args) {
        processExceptions();
    }

    public static void processExceptions(){
        try {
            ioMethod();
            exceptMethod();
            throwableMethod();
        }catch (IOException ex){
            System.out.println(ex);
        }catch (Exception ex){
            System.out.println(ex);
        }catch (Throwable ex){
            System.out.println(ex);
        }
    }

    private static void throwableMethod() throws Throwable {
        throw new Throwable();
    }

    private static void exceptMethod() throws Exception {
        throw new Exception();
    }

    private static void ioMethod() throws IOException {
        throw new IOException();
    }
}
