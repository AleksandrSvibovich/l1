package JR.SecondTwenty.Day23.task_01.pack131104;

import java.io.*;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class ReadFromConsole {
    public static void main(String[] args) {
        String adress = "D:\\L2\\l1\\src\\JR.SecondTwenty\\Day23\\task_01\\pack131104\\mess.txt";
        try {
            readAndWrite(adress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndWrite(String adress) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String stopWord = "exit";
        FileOutputStream fos = new FileOutputStream(adress);
        while (true) {
            String string = br.readLine();
            if (!string.equalsIgnoreCase(stopWord)) {
                string +="\n";
                byte[] a = string.getBytes();
                fos.write(a);

            }else {
                string +="\n";
                byte[] a = string.getBytes();
                fos.write(a);
                fos.close();
                break;
            }
        }
    }
}
