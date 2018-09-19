package Day12.task_03;

import java.util.ArrayList;

public class Human {
    private String name;
    private boolean genderMale;
    private int age;
    ArrayList<Human> kids = new ArrayList<>();


    public Human(String name, boolean genderMale, int age, ArrayList<Human> kids) {
        this.name = name;
        this.genderMale = genderMale;
        this.age = age;
        this.kids = kids;
    }

    public Human(String name, boolean genderMale, int age) {
        this.name = name;
        this.genderMale = genderMale;
        this.age = age;
    }

    public Human() {
    }

    @Override
    public String toString(){
        String text = "";
        text = "Имя " + this.name + " Возраст " + this.age;
        if(this.genderMale){
            text += " мужчина ";
        }else {
            text += " женщина ";
        }

        if(kids.size() != 0){
            text +=" Дети: ";
            for (int i = 0; i <kids.size() ; i++) {
                text += " " + kids.get(i).getName();
            }
        }


        return text;
    }

    public String getName(){
        return name;
    }


}
