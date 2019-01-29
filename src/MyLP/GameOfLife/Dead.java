package MyLP.GameOfLife;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Dead implements Runnable {
    private FieldGameOfLife field;

    public Dead(FieldGameOfLife field){
        this.field = field;
    }

    @Override
    public void run() {
//        field.repaint();
    }
}
