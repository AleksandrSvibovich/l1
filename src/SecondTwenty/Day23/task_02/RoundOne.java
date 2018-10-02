package SecondTwenty.Day23.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class RoundOne {
    public static void main(String[] args) {
        Robot far = new Robot("Karl");
        Robot def = new Robot("Dissan");

        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);
        doActions(far, def);

    }

    public static void doActions(Robot a, Robot b){
        BodyParts partAttack = a.attack();
        BodyParts partDefine = b.define();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                a.getName(), b.getName(), partAttack, partDefine));
    }
}
