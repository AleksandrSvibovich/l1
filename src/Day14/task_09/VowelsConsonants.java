package Day14.task_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aleksandr_Svibovich on 9/20/2018.
 */
public class VowelsConsonants {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        text = text.toLowerCase();
        String vowels = "";
        String consonants = "";
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                vowels += arr[i] + " ";
            } else {
                consonants += arr[i] + " ";
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
