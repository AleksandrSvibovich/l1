package SecondTwenty.Day23.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Robot extends AbstaractRobot implements Attackable,Defensable{

    public Robot(String name) {
        super(name);
    }

    @Override
    public BodyParts attack() {
        return BodyParts.ARM;
    }

    @Override
    public BodyParts define() {
        return BodyParts.CHEST;
    }
}
