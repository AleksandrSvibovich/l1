package javarush.second_twenty.Day29.task_01;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();
        printMainInfo(drawable);        //метод передаёт объект
        printMainInfo(movable);
    }

    private static void printMainInfo(Object obj) {
        if(obj instanceof Movable){
            Movable m =(Movable)obj;
            m.movable();
        }else {
            Drawable m =(Drawable) obj;
            m.draw();
        }
    }
}
