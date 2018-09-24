package Day16.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class ActionsGo {
    public static void main(String[] args) {
        RedHeat girl = new RedHeat();
        GrandMa grandMother = new GrandMa();
        Wolf wolf = new Wolf();
        Pie pie = new Pie();
        Woodman jack = new Woodman();

        wolf.ate.add(grandMother);
        jack.killed.add(wolf);
    }
}
