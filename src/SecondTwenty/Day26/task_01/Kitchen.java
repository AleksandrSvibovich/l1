package SecondTwenty.Day26.task_01;

import java.text.NumberFormat;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 * * Food
 * 1. Реализовать интерфейс Selectable в классе Food.
 * 2. Метод onSelect() должен писать в консоль "food is selected".
 * 3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
 * 4. В методе foodMethods вызови методы onSelect, eat, если это возможно.
 * 5. В методе selectableMethods вызови методы onSelect, eat, если это возможно.
 * 6. Явное приведение типов не использовать.
 */
public class Kitchen {
    public static void main(String[] args) {
        Food f = new Food();
        f.onSelect();
        Selectable s = new Selectable() {
            @Override
            public void onSelect() {
                System.out.println("Selectable OnSelect");
            }
        };
        s.onSelect();
        f.foodMethods();

    }
    private static int par = 10;

    public static void test(){
        NumberFormat form = NumberFormat.getInstance();
        System.out.println(form.format(1273.2));
    }

}
