package javarush.second_twenty.Day23.task_03;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Arena {
    public static void main(String[] args) {
        CatSoldier ragnar = new CatSoldier("Ragnar");
        CatSoldier loki = new CatSoldier("Loki");
        doAction(ragnar,loki);
        doAction(loki,ragnar);
        doAction(ragnar,loki);
        doAction(ragnar,loki);
        doAction(loki,ragnar);
        doAction(ragnar,loki);
    }

    public static void doAction(CatSoldier a, CatSoldier b){
        Part attackedPart = a.attack();
        String atacP = attackedPart.toString();
        Part defPart = b.define();
        String defPar = defPart.toString();
        System.out.println(String.format("%s attacked %s. Attacked %s ! define %s !",
                a.getName(),b.getName(),atacP,defPar));


    }
}
