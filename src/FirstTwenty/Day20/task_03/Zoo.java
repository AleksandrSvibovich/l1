package Day20.task_03;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Написать метод, который определяет,
 * объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
public class Zoo {
    public static void main(String[] args) {

        Cow a = new Cow("Zorka");
        whichObjact(a);

    }
    public static void whichObjact(Object obj){
        if(obj instanceof Cat){
            System.out.println("Cat");
        }else if (obj instanceof Cow){
            System.out.println("Cow");
        }else if(obj instanceof  SiniiKit){
            System.out.println("Sinii Kit");
        }else {
            System.out.println("We don't know this animal");
        }
    }
}
