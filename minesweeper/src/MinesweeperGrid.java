import java.util.Random;
import java.util.Scanner;

public class MinesweeperGrid {

private static final int gridSize = 10;
private static final int numOfMines = 10;
private static char [][] grid = new char [gridSize][gridSize];
private static boolean [][] revealed = new boolean [gridSize][gridSize] ; 
private static final int cellWidth = 2;

public static void displayBoard() {

    System.out.println("Minesweeper board");

    for(int i = 0 ; i < gridSize ; i++){
        for(int j = 0 ; j < gridSize ; j ++){
            if(grid[i][j] == '*'){ // this represents the mine
                System.out.print(String.format("[%" + cellWidth + "s]", ' '));
            } else {
            System.out.print(String.format("[%" + cellWidth + "s]", grid[i][j]));
            }
        }
        System.out.println();
    }
}


public static void placeMines() {
    Random rand = new Random();
    int minesPlaced = 0; 
    // Initialize the grid with empty spaces first
    for (int i = 0; i < gridSize; i++) {
        for (int j = 0; j < gridSize; j++) {
            grid[i][j] = ' ';  // ' ' denotes an empty space
            revealed[i][j] = false; //set all to empty
        }
    }

    while (minesPlaced < numOfMines){
        int row = rand.nextInt(gridSize);
        int col = rand.nextInt(gridSize);

        //if there is no mine yet - place one
        if(grid[row][col] != '*') {

            grid[row][col] = '*';
            minesPlaced++;
        }

    }
}

    public static void startGame(Scanner userInput) {
        int safeCells  = (gridSize * gridSize) - numOfMines;
        int countOfsafeCells = 0;
        boolean gameover = false;
        while(!gameover){
        System.out.println("Please enter coordinates between 0 and 9 separated by space");

        if(userInput.hasNextInt()){
        int row = userInput.nextInt();

        if(userInput.hasNextInt()){
        int col = userInput.nextInt();

        //check input if out of bounds
        if(row < 0 || row >= gridSize || col < 0 || col >= gridSize){
            System.out.println("Invalid coordinates please try again");
            continue;
        }
        
        //check if it is a mine - if it is - GAMEOVER! 
        if( grid[row][col] == '*'){
            System.out.println("YOU HIT A MINE! GAMEOVER");
            gameover = true;
            break;
        } 

        //check if it is already revealed - ask for new coordinates
        if(revealed[row][col] == true){
        System.out.println("Cell already revealed, please enter another coordinates");
        continue;
        }

        //if coordinate is a safeCell - add it to countOfsafeCells 
        //evaluate if its equal to the number of safeCells - the player wins
        countOfsafeCells++;
        if(countOfsafeCells == safeCells){
            System.out.println("HURRAY! You won the game. Please claim your prize from Alex");
            break;
        }

        // count the surrounding cells - if it is 1  - that means that among the 8 cells 1 is a mine 
        // thgis is to give the user some hints of mines around
        int numOfsurroundingMines = countSurroundingMines(row, col); 
        revealed[row][col] =true;
        if(numOfsurroundingMines == 0){
            grid[row][col] = '0';
        } else {
            grid[row][col] = Character.forDigit(numOfsurroundingMines,10); // changing the count to char as I used * to represent my mines
        }
           

            System.out.println("Safe keep playing!");
        
    } 

    displayBoard(); // call displayBoard to update the board again
}   
    else {
        // if first input is invalid
        System.out.println("Invalid input! Please enter two integers separated by a space.");
    } 
} {
        // if second input is invalid
        System.out.println("Invalid input! Please enter two integers separated by a space.");
}
}


  
  //this checks the adjancent 8 cells around the selected cell for example
public static int countSurroundingMines(int row, int col){
    int mines = 0;

// first loop checks the top left , then top, then top right, then left , right  
    for(int rowOffSet = -1 ; rowOffSet <= 1 ; rowOffSet++) {
        for (int colOffSet = -1 ; colOffSet <=1 ; colOffSet++){
            int newRow = row + rowOffSet;
            int newCol = col + colOffSet;

            //ensure it newRow and newCol wont get out of bounds
            if (newRow >= 0 && newRow < gridSize && newCol >= 0 && newCol < gridSize){
                if(grid[newRow][newCol] == '*'){
                mines++;
                }
            }

        }
    }
    return mines;

}


}
 






    


