package Day14.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/20/2018.
 */
public class ExcePtion {
    public static void main(String[] args) {
        processExceptions();
    }

    public static void processExceptions(){
        try {
            ioMethod();
            exceptMethod();
            throwableMethod();
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
        }catch (NullPointerException ex){
            System.out.println(ex);
        }catch (NumberFormatException ex){
            System.out.println(ex);
        }
    }

    private static void throwableMethod() {
        throw new IndexOutOfBoundsException();
    }

    private static void exceptMethod() {
        throw new NullPointerException();
    }

    private static void ioMethod(){
        throw new NumberFormatException();
    }
}
