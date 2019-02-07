package javarush.second_twenty.Day23.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class BodyParts {
    final static BodyParts CHEST = new BodyParts("Chest");
    final static BodyParts HEAD = new BodyParts("Head");
    final static BodyParts ARM = new BodyParts("Arm");
    final static BodyParts LEG = new BodyParts("Leg");

    private String bodyPart;

    public String toString(){
        return this.bodyPart;
    }

    public BodyParts(String part){
        this.bodyPart = part;
    }



}
