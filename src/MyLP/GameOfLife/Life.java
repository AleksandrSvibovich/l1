package MyLP.GameOfLife;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Life implements Runnable {
    private FieldGameOfLife field;

    public Life(FieldGameOfLife field){
        this.field = field;
    }

    @Override
    public void run() {
//        field.repaint();
        System.out.println("Life");

    }
}
