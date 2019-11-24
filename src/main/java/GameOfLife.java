/**
 * @author Nasim Salmany
 */
public class GameOfLife {

    public static final int GRID_LENGTH = 10;
    public static final int GRID_WIDTH = 10;

    public static Grid startGame() {
        Grid grid = new Grid(GRID_LENGTH, GRID_WIDTH);

        return grid;
    }

    private int aliveNeighbourCount(Cell cell, Grid grid) {
        return 2;
    }

    private Cell bringToLife(Cell cell) {
        return null;
    }

    private Cell killCell(Cell cell) {
        return null;
    }


}
