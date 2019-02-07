package MyLP.GameOfLife.view;

import MyLP.GameOfLife.model.Model;

public class View {
    private Model model;
    public View() {
        // initialize with some constants
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
