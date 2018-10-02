package SecondTwenty.Day28.task_02;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public abstract class Person {
    public static void doWork(Person user){
        if(user instanceof User){
            User x = (User)user;
            x.live();
        }else {
            Looser x = (Looser)user;
            x.doNothing();
        }
    }

}
