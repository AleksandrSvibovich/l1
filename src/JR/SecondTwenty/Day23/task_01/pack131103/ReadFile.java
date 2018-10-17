package JR.SecondTwenty.Day23.task_01.pack131103;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class ReadFile {
    public static void main(String[] args) {
        String adress = "D:\\L2\\l1\\src\\JR.SecondTwenty\\Day23\\task_01\\pack131103\\file.txt";
        try {
              readFile(adress);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readFile(String adress) throws IOException {
        FileInputStream reader = new FileInputStream(adress);
        while(reader.available()>0){
            int b = reader.read();
            char data = (char)b;
            System.out.print(data);
        }
        reader.close();
    }
}
