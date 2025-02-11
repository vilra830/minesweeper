# MINESWEEPER

This application is a simple Minesweeper game played in the Java console. 


## Game Description

- The game starts with asking the player to type in "start" on the console.
- The program then generates a 10 x 10 grid of [ ] with nothing inside them. 
- In the hood, the program also spreads the mines randomly using Math.Random. 
- The use is then prompted to enter a coordinate separated by a space. 
- The input will then go through a series of validations. 
    1. If the either of the inputs is out of bounds - print an error statement and ask for new inputs. 
    2. If inputs have the wrong types - print an error statement and ask for new inputs. 
    3. If coordinate is already revealed - print an message saying "cell is already revealed".
- If input surpasses those validations, it is then further evaluated to determine whether the game is still on, is won or is over. 
    1. If the input coordinate is a mine, the game is over.
    2. If the input's count is the max number of safe cells - (grid squared - num of mines) the user wins. 
    3. If the input is none of them and is a safe cell, the method countSurroundingMines is called and the count is printed on the cell itself.


### Tech Stack

- Java 
- Github


## Future Development

- Add a functionality that will allow user to configure number of mines and grid size
- Add a functionality that will check the neighbouring cells of the selected coordinate if its surrounding cells do not contain mines
- Unit Testing on the methods 