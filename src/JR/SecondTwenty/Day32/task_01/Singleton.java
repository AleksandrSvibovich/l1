package JR.SecondTwenty.Day32.task_01;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
