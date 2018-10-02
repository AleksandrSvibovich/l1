package SecondTwenty.Day28.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static SecondTwenty.Day28.task_02.Person.doWork;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Solution {
    public static void main(String[] args) {
        try {
            readLineFromconsole();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readLineFromconsole() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String text = br.readLine();
            if(text.equalsIgnoreCase("user")){
                doWork(new User());
            }else if(text.equalsIgnoreCase("looser")){
                doWork(new Looser());
            }else{
                break;
            }
        }
    }
}
