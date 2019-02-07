package com.my.projectc.game;

import com.my.projectc.game.controller.Controller;
import com.my.projectc.game.model.Model;
import com.my.projectc.game.view.View;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Application implements Runnable {


    public static void main(String[] args) {
        new Application().run();
    }

    @Override
    public void run() {
        Controller controller = new Controller(new View(), new Model());
        controller.run();
    }
}
