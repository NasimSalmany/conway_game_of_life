import java.util.ArrayList;
import java.util.List;

/**
 * @author Nasim Salmany
 */
public class Grid {
    private int length;
    private int width;
    private List<Cell> cells = new ArrayList<Cell>();

    Grid(int length, int width) {
        this.length = length;
        this.width = width;
        init();
    }

    private void init() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                Cell cell = new Cell(i, j);
                this.cells.add(cell);
            }
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }
}
