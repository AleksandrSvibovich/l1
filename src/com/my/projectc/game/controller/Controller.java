package com.my.projectc.game.controller;

import com.my.projectc.game.model.Model;
import com.my.projectc.game.view.View;

public class Controller implements Runnable {
    View view;
    Model model;

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;
        view.setModel(model);
    }

    @Override
    public void run() {
        // in cycle run life, death, then update field (set updated to false) and call repaint on view
    }
}
