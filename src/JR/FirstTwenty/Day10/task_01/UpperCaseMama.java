package Day10.task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class UpperCaseMama {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        upperLetter(br);
        upperLetter2(br);

    }

    private static void upperLetter2(BufferedReader br) throws IOException {
        StringBuilder builder = new StringBuilder();
        String text = br.readLine();
        StringTokenizer token = new StringTokenizer(text," \t\n\r,.");
        while (token.hasMoreTokens()){
            char[] c = token.nextToken().toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            builder.append(c);
            builder.append(" ");
        }
        System.out.println(builder.toString());

    }

    private static void upperLetter(BufferedReader br) throws IOException {
        String text = br.readLine();
        String returnableString = "";
        String[] textSplited = text.split(" ");
        for (int i = 0; i <textSplited.length; i++) {
            String firstLetter = String.valueOf(textSplited[i].charAt(0));
            firstLetter = firstLetter.toUpperCase();
            returnableString += firstLetter + textSplited[i].substring(1,textSplited[i].length()) + " ";
        }
        System.out.println(returnableString);
    }
}

