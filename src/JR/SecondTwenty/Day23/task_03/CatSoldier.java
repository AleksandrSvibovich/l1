package JR.SecondTwenty.Day23.task_03;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class CatSoldier implements Cat{
    String name;

    public CatSoldier(String nik) {
        this.name = nik;
    }

    public String getName() {
        return name;
    }

    public Part attack() {
        int hint = (int) (Math.random() * 4);
        switch (hint) {
            case 1:
                return new Part("Paw");
            case 2:
                return new Part("Body");
            case 3:
                return new Part("Tail");
            default:
                return new Part("Head");
        }
    }

    public Part define() {
        int hint = (int) (Math.random() * 4);
        switch (hint) {
            case 1:
                return new Part("Paw");
            case 2:
                return new Part("Body");
            case 3:
                return new Part("Tail");
            default:
                return new Part("Head");
        }
    }
}
