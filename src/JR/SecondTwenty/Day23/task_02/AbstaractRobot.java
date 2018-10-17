package JR.SecondTwenty.Day23.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public abstract class AbstaractRobot implements Attackable, Defensable {
    public String getName() {
        return name;
    }

    public AbstaractRobot(String name) {
        this.name = name;
    }

    private static int hitCount;
    private String name;
    public BodyParts attack()
    {
        BodyParts attackedBodyPart = null;
        hitCount = hitCount + 1;
        if (hitCount == 1)
        {
            attackedBodyPart =  BodyParts.ARM;
        } else if (hitCount == 2)
        {
            attackedBodyPart =  BodyParts.HEAD;
        } else if (hitCount == 3)
        {
            attackedBodyPart =  BodyParts.LEG;
        } else if (hitCount == 4)
        {
            hitCount = 0;
            attackedBodyPart = BodyParts.CHEST;
        }
        return attackedBodyPart;
    }
    public BodyParts defense()
    {
        BodyParts defencedBodyPart = null;
        hitCount = hitCount + 1;
        if (hitCount == 1)
        {
            defencedBodyPart =  BodyParts.HEAD;
        } else if (hitCount == 2)
        {
            defencedBodyPart =  BodyParts.LEG;
        } else if (hitCount == 3)
        {
            defencedBodyPart =  BodyParts.ARM;
        } else if (hitCount == 4)
        {
            hitCount = 0;
            defencedBodyPart = BodyParts.CHEST;
        }
        return defencedBodyPart;
    }

}
