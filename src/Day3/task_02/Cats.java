package Day3.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cats {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String catName = br.readLine();
        String age = br.readLine();
        String weight = br.readLine();
        String tail = br.readLine();
        System.out.println("Cat name " + catName + ", age is " + age + ". The weight is " + weight + " and tail = " + tail);
    }
}
