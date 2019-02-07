package com.my.projectc.game.view;

import com.my.projectc.game.model.Model;

import javax.swing.*;
import java.awt.*;

public class View {
    private static final int HEIGHT = 800;
    private static final int WIDTH = 740;
    private Model model;

    public View() {
        // initialize with some constants
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        FrameGameOfLife frame = new FrameGameOfLife(HEIGHT, WIDTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(dimension.width / 2 - WIDTH / 2, dimension.height / 2 - HEIGHT / 2);
        frame.setTitle("Version 1.0.0");
        frame.setResizable(true);
        frame.setVisible(true);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
