import com.sun.tools.javac.util.List;

import java.util.ArrayList;

/**
 * @author Nasim Salmany
 */
public class Grid {
    private int length;
    private int width;
    private List<Cell> cells;

    public Grid(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Grid init() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                Cell cell = new Cell(i, j);
                this.cells.add(cell);
            }
        }
        return this;
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
