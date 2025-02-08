public class MinesweeperGrid {

    private static final int gridSize = 10;
private static final int numOfMines = 10;
private static int [][] grid = new int [gridSize][gridSize];

public static void displayBoard() {
    System.out.println("Minesweeper board");

    for(int i = 0 ; i < gridSize ; i++){

        for(int j = 0 ; j < gridSize ; j ++){

            System.out.print("[ " + grid[i][j] + "]");

        }
        System.out.println();

    }

}

    
}
