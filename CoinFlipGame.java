import java.util.Scanner;
import java.util.Random;

public class CoinFlipGame {

    // Define a Scanner object and a Random object as instance variables
    private Scanner input;
    private Random rand;
    private String player1Choice;
    private int coin;

    // Define a constructor to initialize the instance variables
    public CoinFlipGame() {
        input = new Scanner(System.in);
        rand = new Random();
    }

    // Define a method to run game
    public void runGame() {
        printWelcomeMessage();
        getPlayer1Choice();
        flipCoin();
        printWinner();
    }
    // Print a message to prompt the user to begin the game
    private void printWelcomeMessage() {
        System.out.println("Welcome to the Coin Flip Game!");
        System.out.println("Let's begin the game!\n");
    }

    private void getPlayer1Choice() {
        do {
            // Prompt player 1 to enter their choice of "heads" or "tails"
            System.out.print("Player 1, enter your choice (heads/tails): ");
            // Read the user's input and convert it to lowercase for case-insensitive comparison
            player1Choice = input.nextLine().toLowerCase();
            if (!player1Choice.equals("heads") && !player1Choice.equals("tails")) {
                System.out.println("Invalid response! Please choose between heads or tails.");
            }
        } while (!player1Choice.equals("heads") && !player1Choice.equals("tails"));
    }

    private void flipCoin() {
        coin = rand.nextInt(2);
    }

    //Determine winner based on results of coin flip
    private void printWinner() {
        if ((coin == 0 && player1Choice.equals("heads")) || (coin == 1 && player1Choice.equals("tails"))) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
    
    public static void main(String[] args) {
        CoinFlipGame game = new CoinFlipGame();
        game.runGame();
    }
}
