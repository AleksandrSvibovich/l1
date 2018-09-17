package Day3.task_01;

import java.util.ArrayList;

public class LaFamilia {
    public static void main(String[] args) {
        Human grandPaMline = new Human("Дед Яша",true,75);
        Human grandMaMline = new Human("Бабушка Таня",false,72);
        Human grandPaFline = new Human("Дед Коля",true,70);
        Human grandMaFline = new Human("Бабушка Рая",false,69);
        Human mother = new Human("Люда",false,47);
        Human father = new Human("Илья",true,48);
        Human child1 = new Human("Саша",true,19);
        Human child2 = new Human("Света",false,16);
        Human child3 = new Human("Таня",false,13);

        ArrayList<Human> familia = new ArrayList<>();
        familia.add(grandPaMline);
        familia.add(grandMaMline);
        familia.add(grandPaFline);
        familia.add(grandMaFline);
        familia.add(mother);
        familia.add(father);
        familia.add(child1);
        familia.add(child2);
        familia.add(child3);

        for (int i = 0; i <familia.size(); i++) {
            System.out.println(familia.get(i).toString());
        }


    }
}
