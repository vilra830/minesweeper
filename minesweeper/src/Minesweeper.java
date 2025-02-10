import java.util.*;

public class Minesweeper {



    public static void main(String[] args) {

        Scanner gameScanner = new Scanner(System.in);


        GameLoader gameLoader = new GameLoader();

        gameLoader.loadGame(gameScanner);

        MinesweeperGrid.placeMines();
        MinesweeperGrid.displayBoard();
        MinesweeperGrid.startGame(gameScanner);

// try (Scanner inputScanner = new Scanner(System.in)) {
//     System.out.println("Please enter another input");
//     int input = inputScanner.nextInt();
//     System.out.println(input);

    
// } catch (Exception e) {
//     // TODO: handle exception
//     System.out.println(e.getMessage());
// }

// }
// // inputScanner.close();

gameScanner.close();

}
}