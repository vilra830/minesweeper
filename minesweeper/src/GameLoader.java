import java.util.Scanner;

public class GameLoader {

 
    public void loadGame(Scanner scanner){


        //Display name of game
        System.out.println("MINESWEEPER GAME");
        System.out.println("Please type 'start' to begin game.");


        String input = scanner.next();

        if(input.equalsIgnoreCase("start")) {

            System.out.println("Starting the game...");

            // startGame();

        } else {

            System.out.println("Invalid input. Please type 'start' to begin game");
        }


    }

    // public void startGame(){

    //     System.out.println("This will call another class that creates the grid");
    //     System.out.println("Game under construction");
    // }
    
}
