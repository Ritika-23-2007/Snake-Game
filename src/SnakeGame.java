import java.util.Scanner;
import java.util.Random;
public class SnakeGame {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int boardSize = 10;
    char[][] board = new char[boardSize][boardSize];
    int snakeLength = 2;
    int foodX = random.nextInt(boardSize);
    int foodY = random.nextInt(boardSize);

    public void printBoard() {
        
        // Initialize the board with empty spaces
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '.';
            }
        }
        //Place the snake and the food on the board
        board[5][5] = 'S'; // Snake's head
        board[5][4] = 'S'; // Snake's body
        board[foodX][foodY] = 'F'; // Food

        // Print the board
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SnakeGame game1 = new SnakeGame();
        game1.printBoard();
    }
}
