package Day20.task_04;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class OverloadClass {
    public static void main(String[] args) {

        int s = 3;
        String b = "sad";
        print(b);
        print(s);
    }
    public static void print(String s){
        System.out.println(s +  " string");
    }

    public static void print(Integer s){
        System.out.println(s +  " integer");
    }
}

