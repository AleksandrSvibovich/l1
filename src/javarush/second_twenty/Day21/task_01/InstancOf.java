package javarush.second_twenty.Day21.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class InstancOf {
    public static void main(String[] args) {
        Pet one = new Cat();
        Pet oneP = new Pet();
        whatIsIt(one);
        whatIsIt(oneP);
    }

    public static void whatIsIt(Object obj){
        if(obj instanceof Cat){
            System.out.println("Cat");
        }else {
            System.out.println("Pet");
        }
    }
}
