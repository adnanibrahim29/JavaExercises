import java.util.*;


// Class that decides the movement strategy
public class brain {
    private Stack<String> movements;

    public void Brain() {
        movements = new Stack<>();
    }

    boolean [][] visited = new boolean[20][20];
    public String getMove(int posX, int posY,boolean north, boolean south, boolean east, boolean west) {
        // Deciding the next move based on the available directions

        // Works by pushing the opposite direction into the stack
        if (north && !visited[posX - 1][posY]) {
            movements.push("south");
            visited[posX - 1][posY] = true; // Updates to check the previous position when visited
            return "north";
        } else if (south && !visited[posX + 1][posY]) {
            movements.push("north");
            visited[posX + 1][posY] = true;
            return "south";
        } else if (east && !visited[posX][posY + 1]) {
            movements.push("west");
            visited[posX][posY + 1] = true;
            return "east";
        } else if (west && !visited[posX][posY - 1]) {
            movements.push("east");
            visited[posX][posY - 1] = true;
            return "west";
        } else if (!movements.isEmpty()) {
            return movements.pop(); // If no valid move, backtrack
        } else {
            return null; // No moves available
        }
    }
}
