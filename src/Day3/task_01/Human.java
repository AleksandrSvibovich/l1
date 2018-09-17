package Day3.task_01;

public class Human {
    private String name;
    private boolean genderMale;
    private int age;
    Human father;
    Human mother;


    public Human(String name, boolean genderMale, int age, Human father, Human mother) {
        this.name = name;
        this.genderMale = genderMale;
        this.age = age;
        this.father = father;
        this.mother = mother;
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

        if(father != null){
            text += " отец " + this.father.name;
        }

        if(mother != null){
            text += " отец " + this.father.name;
        }


        return text;
    }


}
