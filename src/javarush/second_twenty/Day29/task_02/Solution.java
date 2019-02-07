package javarush.second_twenty.Day29.task_02;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Solution {
    public static void main(String[] args)
    {
        Compucter computer = new Compucter();
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse()))
        {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item){
        if(item.getName()!=null){
            return true;
        }else {
            return false;
        }
    }
}
