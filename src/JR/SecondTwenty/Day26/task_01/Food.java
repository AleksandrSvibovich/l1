package JR.SecondTwenty.Day26.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 */
public class Food implements Selectable {

    @Override
    public void onSelect() {
        System.out.println("food is selected");
    }

    public void foodMethods() {
        onSelect();
        eat();
    }

    private void eat() {
        System.out.println("eat");
    }


}
