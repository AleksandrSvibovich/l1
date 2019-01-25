package MyLP.GameOfLife;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class FieldGameOfLife extends JPanel{
    private final int xsize;
    private final int ysize;
    private static final ArrayList<CellGameOfLife> list = new ArrayList<>();
    private Random random = new Random();

    public FieldGameOfLife(int height, int width){
        xsize = width / 10;
        ysize = height / 10;
        setOpaque(true);
        setPreferredSize(new Dimension(height,width));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);


    }
}
