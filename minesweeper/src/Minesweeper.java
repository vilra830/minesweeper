import java.util.*;

public class Minesweeper {



    public static void main(String[] args) {


        GameLoader gameLoader = new GameLoader();

        gameLoader.loadGame();

        MinesweeperGrid.placeMines();
        MinesweeperGrid.displayBoard();
        MinesweeperGrid.startGame();


    
}
}