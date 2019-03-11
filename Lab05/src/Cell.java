import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * [DESCRIBE CLASS HERE]
 *
 * @author [YOUR NAME HERE]
 * @version [DATE HERE]
 */
public class Cell extends Rectangle {

    /*
     * Research how to use an enum in Java
     */
    public enum CellStates {
        ALIVE, DEAD
    }

    private int row;
    private int col;
    private int liveNeighbors;

    private CellStates state = CellStates.DEAD;

    public Cell(int row, int col) {
        setFill(Color.WHITE);
        setStroke(Color.GRAY);
        // TODO 1.1 - set row and col to correct values

    }

    public void born() {
        setFill(Color.BLACK);
        // TODO 1.2 Set state to ALIVE

    }

    public void die() {
        setFill(Color.WHITE);
        // TODO 1.3 Set state to DEAD
    }

    public boolean isAlive() {
        // TODO 1.4 Return true if state is ALIVE
        // THIS IS A STUB
        return false;
    }

    private List<Cell> getNeighbors(Cell[][] grid) {
        List<Cell> neighbors = new ArrayList<>();
        // TODO 1.5 - Add all the neighbors, make sure to check if each neighbor is in the range of the grid
        return neighbors;
    }

    public void updateAliveNeighbors(Cell[][] grid) {
        liveNeighbors = 0;
        List<Cell> neighbors = getNeighbors(grid);
        // TODO 1.6 - Use a foreach loop to count the neighbors that are alive, use the liveNeighbors to count
    }

    public int getLiveNeighbors() {
        return liveNeighbors;
    }

}
