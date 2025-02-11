import java.util.*;

public class Minesweeper {



    public static void main(String[] args) {

        Scanner gameScanner = new Scanner(System.in);


        GameLoader gameLoader = new GameLoader();

        gameLoader.loadGame(gameScanner);

        MinesweeperGrid.placeMines();
        MinesweeperGrid.displayBoard();
        MinesweeperGrid.startGame(gameScanner);


gameScanner.close();

}
}