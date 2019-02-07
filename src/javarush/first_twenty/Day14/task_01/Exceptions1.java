package Day14.task_01;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class Exceptions1 {
    public static void main(String[] args) throws URISyntaxException {
        try{
            methodOne();
        }catch (FileNotFoundException ex){
            System.out.println(ex);
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
    }

    private static void methodOne() throws FileNotFoundException, URISyntaxException {
        int num = (int)(Math.random()*4);
        switch (num){
            case 0: throw new FileNotFoundException();
            case 1: throw new NullPointerException();
            case 2: throw new ArithmeticException();
            case 3: throw new URISyntaxException("","");
        }
    }
}
