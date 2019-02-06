package MyLP.GameOfLife;

public class Engine {
    private FieldGameOfLife field;

    public void setFiled(FieldGameOfLife field) {
        this.field = field;
    }

    public boolean isField(int i, int j) {
        return ((i >= 0 && i <= field.getXsize()) && (j >= 0 && j <= field.getYsize()));
    }

    public int countNeighbors(int i, int j) {
        int ik;
        int jl;
        int count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                ik = i + k;
                jl = j + l;
                if ((!(ik == i && jl == j)) && isField(ik, jl)) {
                    if (field.getCell(ik, jl).isCellAlive()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void makeAliveNeighborCell(int i, int j) {
        int ik;
        int jl;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                ik = i + k;
                jl = j + l;
                if ((!(ik == i && jl == j)) && isField(ik, jl)) {
                    if (!(field.getCell(ik, jl).isCellAlive())) {
                        CellGameOfLife cellToLife = field.getCell(ik, jl);
                        cellToLife.setAlive(true);
                        break;
                    }
                }
            }
        }
    }
}
