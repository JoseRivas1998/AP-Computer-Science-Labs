import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * [DESCRIBE CLASS HERE]
 *
 * @author [YOUR NAME HERE]
 * @version [DATE HERE]
 */
public class Board {

    private Cell[][] grid;
    private int size;
    private int generation;

    public Board(File file) {
        try (Scanner fileScanner = new Scanner(file);
             Scanner line1Scanner = new Scanner(fileScanner.nextLine())) {
            generation = 0;
            // TODO 2.1 - Read first int from file to get size of the board

            grid = new Cell[size][size];
            // TODO 2.2 - Use a nested for-loop to initialize each cell in the grid

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                try (Scanner lineScanner = new Scanner(line)) {
                    // TODO 2.3 Read a row and a col from the scanner and call born() on the cell at that position
                    int row;
                    int col;
                }
            }

        } catch (FileNotFoundException | NumberFormatException | NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void step() {
        // TODO 2.4 - Update live neighbors for every cell, you may use a nested counting for loop, or a nested for-each loop

        // TODO 2.5 - Apply the Conway rule on each cell, you may use a nested counting for loop, or a nested for-each loop

        // TODO 2.6 - Increment generation number
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public int getSize() {
        return size;
    }

    public int getGeneration() {
        return generation;
    }
}
