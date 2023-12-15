import java.util.*;
import java.io.*;

public class maze {
    public static void main(String[] args) {
        // Reading the maze structure from file
        File file = new File("Maze1.txt");
        int lives = 200;
        int posX = 0;
        int posY = 0;
        String[] input = new String[20];
        
        try {
            // Reading maze configuration from the file
            Scanner scan = new Scanner(file);
            for (int i = 0; i < 20; i++) {
                input[i] = scan.nextLine(); // Read the maze structure
            }
            posX = Integer.parseInt(scan.nextLine()); // Initial player position X
            posY = Integer.parseInt(scan.nextLine()); // Initial player position Y
            scan.close();
        } catch (Exception e) {
            // Handle file reading exceptions
            System.err.println(e);
        }
        
        // Initializing maze structure based on input
        boolean[][] maze = new boolean[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (input[i].charAt(j) == 'X') {
                    maze[i][j] = false; // Wall exists at this position
                } else {
                    maze[i][j] = true; // Space is available at this position
                }
            }
        }
        
        // Initializing the brain to guide movement
        Brain myBrain = new Brain();
        while (lives > 0) {
            // Visualizing current position in the maze
            System.out.println("Current position: " + posX + " " + posY);
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (posX == i && posY == j) {
                        System.out.print("o"); // Current player position
                    } else if (maze[i][j]) {
                        System.out.print(" "); // Empty space
                    } else {
                        System.out.print("X"); // Wall
                    }
                }
                System.out.println();
            }
            
            // Displaying remaining lives
            System.out.println("Lives: " + lives);
            try {
                Thread.sleep(100); // Pausing for visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         
            // Getting the next move from the Brain class
            String move = myBrain.getMove(posX, posY,maze[posX - 1][posY], maze[posX + 1][posY], maze[posX][posY + 1], maze[posX][posY - 1]);
            
            // Making the move if valid and adjusting position
            if (move.equals("north") && maze[posX - 1][posY]) {
                posX--;
            } else if (move.equals("south") && maze[posX + 1][posY]) {
                posX++;
            } else if (move.equals("east") && maze[posX][posY + 1]) {
                posY++;
            } else if (move.equals("west") && maze[posX][posY - 1]) {
                posY--;
            }
            
            // Decreasing life count after each move
            lives--;
            
            // Check if the player reached the edge (exit) of the maze
            if (posY % 19 == 0 || posX % 19 == 0) {
                System.out.println("You found the exit at: " + posX + "," + posY);
                System.exit(0); // Exit the program
            }
        }
        System.out.println("You died in the maze!"); // Player ran out of lives
    }
}

