package JR.SecondTwenty.ThirdTwenty.Day2.task_02;

import java.util.StringTokenizer;

/**
 * Created by Aleksandr_Svibovich on 10/8/2018.
 */
public class URLParser {

    public static void main(String[] args) {
        parseURL(URL);
    }

    public static String URL = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";

    public static void parseURL(String url){
        String param;
        int start = url.indexOf("?");
        int end = url.lastIndexOf("=");
        param = url.substring(start+1,end);
        StringTokenizer token = new StringTokenizer(param,"=&");
        while (token.hasMoreElements()){
            String a = (String) token.nextElement();
            System.out.println(a);
        }


    }
}
