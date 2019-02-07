package javarush.second_twenty.Day21.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Cat extends Pet implements Climb,Run{

    public String getName(){
        System.out.println("I'm - cat");
        return "I'm - cat";
    }

    public void setName(String name){
        System.out.println("I'm - cat");
    }

    public void nothingMethod(){
        int res = 99/9;
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void climb() {
        System.out.println("climb");
    }
}
