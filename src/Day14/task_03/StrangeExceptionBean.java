package Day14.task_03;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class StrangeExceptionBean {
    public static BeanState bean = new BeanState();
    public static void main(String[] args) {
        try {
            processExceptions();
        } catch (FileSystemException e) {
            bean.log(e);
        }
    }

    public static void processExceptions() throws FileSystemException {
        try {
            bean.methoThrowException();
        } catch (FileSystemException ex) {
            bean.log(ex);
            throw new FileSystemException("UPS");
        } catch (CharConversionException ex) {
            bean.log(ex);
        } catch (IOException ex) {
            bean.log(ex);
        }
    }


    public static class BeanState {
        public void methoThrowException() throws IOException {
            int num = (int) (Math.random() * 3);
            switch (num) {
                case 0:
                    throw new FileSystemException("");
                case 1:
                    throw new CharConversionException();
                case 2:
                    throw new IOException();
            }
        }

        public static void log(Exception ex) {
            System.out.println(ex.getCause() + " 0 " + ex.getClass().getSimpleName());
        }
    }
}
