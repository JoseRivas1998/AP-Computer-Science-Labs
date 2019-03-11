import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2/17/19
 */
public class GameOfLife extends Application {

    private static final int WINDOW_SIZE = 500;
    public boolean animate = false;
    private GridPane root;
    private long lastUpdate = 0;

    private Board board;

    private static final int NANO_SECONDS_TO_SECOND = 1000000000;
    private static final float SECONDS_PER_STEP = 0.05f;
    private static final long NANO_SECONDS_PER_STEP = (long) (SECONDS_PER_STEP * NANO_SECONDS_TO_SECOND);

    @Override
    public void start(Stage primaryStage) throws Exception {
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        board = new Board(file);

        root = new GridPane();

        Scene scene = new Scene(root, WINDOW_SIZE, WINDOW_SIZE);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.ENTER) {
                animate = !animate;
            } else if (event.getCode() == KeyCode.SPACE) {
                step();
            }
        });

        Cell[][] grid = board.getGrid();
        int size = board.getSize();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                Cell cell = grid[row][col];
                root.add(cell, col, row);
                cell.widthProperty().bind(root.widthProperty().divide(size));
                cell.heightProperty().bind(root.heightProperty().divide(size));
                cell.setOnMouseClicked(event -> {
                    if (cell.isAlive()) {
                        cell.die();
                    } else {
                        cell.born();
                    }
                });
            }
        }
        primaryStage.setScene(scene);
        primaryStage.setTitle("AP Computer Science Lab 5");
        primaryStage.show();
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (now - lastUpdate > NANO_SECONDS_PER_STEP) {
                    if (animate) {
                        step();
                    }
                    lastUpdate = now;
                }
            }
        };
        animationTimer.start();
    }

    private void step() {
        board.step();
        System.out.println("Generation: " + board.getGeneration());
    }

    public static void main(String[] args) {
        launch(args);
    }

}
