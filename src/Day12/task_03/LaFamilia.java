package Day12.task_03;


import java.util.ArrayList;

public class LaFamilia {
    public static void main(String[] args) {
        ArrayList<Human> k = new ArrayList<>();
        Human child1 = new Human("Саша", true, 19);
        Human child2 = new Human("Света", false, 16);
        Human child3 = new Human("Таня", false, 13);
        k.add(child1);
        k.add(child2);
        k.add(child3);

        ArrayList<Human> k2 = new ArrayList<>();
        Human mother = new Human("Люда", false, 47, k);
        k2.add(mother);

        ArrayList<Day12.task_03.Human> k22 = new ArrayList<>();
        Human father = new Human("Илья", true, 48, k);
        k22.add(father);

        Human grandPaMline = new Human("Дед Яша", true, 75, k22);
        Human grandMaMline = new Human("Бабушка Таня", false, 72, k22);


        Human grandPaFline = new Human("Дед Коля", true, 70, k2);
        Human grandMaFline = new Human("Бабушка Рая", false, 69, k2);


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

        for (int i = 0; i < familia.size(); i++) {
            System.out.println(familia.get(i).toString());
        }


    }
}
