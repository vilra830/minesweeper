import java.util.Random;
import java.util.Scanner;

public class MinesweeperGrid {

private static final int gridSize = 10;
private static final int numOfMines = 10;
private static char [][] grid = new char [gridSize][gridSize];
private static boolean [][] revealed = new boolean [gridSize][gridSize] ; 

public static void displayBoard() {
    System.out.println("Minesweeper board");

    for(int i = 0 ; i < gridSize ; i++){

        for(int j = 0 ; j < gridSize ; j ++){
            // grid[i][j] = "";

            System.out.print("[" +  grid[i][j] + "]");

        }
        System.out.println();

    }
}


public static void placeMines() {

    Random rand = new Random();
    int minesPlaced = 0; 

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

    public static void startGame() {
        boolean gameover = false;

        Scanner userInput = new Scanner(System.in);


        while(!gameover){

        System.out.println("Please put it 2 numbers separated by space between 0 and 9 ");

        int row = userInput.nextInt();
        int col = userInput.nextInt();

        //check input if out of bounds
        if(row < 0 || row >= gridSize || col < 0 || col >= gridSize){

            System.out.println("Invalid coordinates please try again");
            continue;
        }
        
        //check if it is a mine
        if( grid[row][col] == '*'){

            System.out.println("YOU HIT A MINE! GAMEOVER");
            gameover = true;


        }


    }



        userInput.close();

        


        
    }
 


}



    


