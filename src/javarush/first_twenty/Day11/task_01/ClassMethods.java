package Day11.task_01;


import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class ClassMethods {
    public static void main(String[] args) {
        ArrayList<Pets> cats = get4Cats();
        printPets(cats);
        ArrayList<Pets> dogs = get3Dogs();
        printPets(dogs);
        ArrayList<Pets> pets = join(cats,dogs);
        printPets(pets);
        ArrayList<Pets> removedCats = removeCats(pets,cats);
        printPets(removedCats);
    }

    public static class Dog extends Pets{
        private String name = null;
        public Dog(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    };

    public static class Cat extends Pets{
        private String name = null;
        public Cat(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }

    public static class Pets{
        private String name = null;
        public String getName(){
            return name;
        }
    }

    public static ArrayList<Pets> get4Cats(){
        ArrayList<Pets> pets = new ArrayList<>();
        Pets one = new Cat("Cat 1");
        Pets two = new Cat("Cat 2");
        Pets three = new Cat("Cat 3");
        Pets four = new Cat("Cat 4");
        pets.add(one);
        pets.add(two);
        pets.add(three);
        pets.add(four);
        return pets;
    }

    public static ArrayList<Pets> get3Dogs(){
        ArrayList<Pets> pets = new ArrayList<>();
        Pets one = new Dog("Dog 1");
        Pets two = new Dog("Dog 2");
        Pets three = new Dog("Dog 3");
        pets.add(one);
        pets.add(two);
        pets.add(three);
        return pets;
    }

    public static ArrayList<Pets> join(ArrayList<Pets> cats, ArrayList<Pets> dogs){
        ArrayList<Pets> pets = new ArrayList<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static ArrayList<Pets> removeCats(ArrayList<Pets> pets, ArrayList<Pets> cats){

        for (Pets x: cats) {
            pets.remove(x);
        }

        return pets;
    }

    public static void printPets(ArrayList<Pets> pets){
        for (Pets p: pets) {
            System.out.println(p.getName());
        }
    }
}
