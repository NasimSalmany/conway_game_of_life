/**
 * @author Nasim Salmany
 */
public class GameOfLife {

    public static Grid startGame() {
        Grid grid = new Grid(10, 10);
        grid = grid.init();

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
