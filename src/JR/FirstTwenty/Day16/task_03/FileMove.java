package Day16.task_03;

import java.io.*;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class FileMove {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter from");
        String from =br.readLine();

        System.out.println("enter to");
        String to =br.readLine();

        FileInputStream fileInputStream = new FileInputStream(from);
        FileOutputStream fileOutputStream = new FileOutputStream(to);
        File f = new File("D://L2//l1//src//Day16//task_03//1//text.txt");

        int count = 0;
        while (fileInputStream.available()>0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }
        System.out.println("Скопировано байт " + count);
        fileInputStream.close();
        fileOutputStream.close();
        f.delete();
    }
}
