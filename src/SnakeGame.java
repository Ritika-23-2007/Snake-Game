import java.util.Scanner;
import java.util.Random;
public class SnakeGame {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int boardSize = 10;
    char[][] board = new char[boardSize][boardSize];
    int snakeLength = 2;
    int maxSnakeLength = boardSize * boardSize;
    int foodX = random.nextInt(boardSize);
    int foodY = random.nextInt(boardSize);
    int[] snakeX = new int[maxSnakeLength];
    int[] snakeY = new int[maxSnakeLength];

    public void printBoard() {

        // Initialize the board with empty spaces
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '.';
            }
        }
        // Set initial snake coordinates (Length 2)
        snakeX[0] = 5;
        snakeY[0] = 5; // Head at column 5, row 5
        snakeX[1] = 4;
        snakeY[1] = 5; // Body at column 4, row 5
        board[foodY][foodX] = 'F'; // Food

        // 3. Place the snake dynamically using the loop
        for (int i = 0; i < snakeLength; i++) {
            if (i == 0) {
                board[snakeY[i]][snakeX[i]] = 'O';
            } else {
                board[snakeY[i]][snakeX[i]] = 'o';
            }
     }

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
