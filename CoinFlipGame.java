import java.util.Scanner;
import java.util.Random;

public class CoinFlipGame {
    public static void main(String[] args) {
        // Create a new Scanner object to read user input from the console
        Scanner input = new Scanner(System.in);
        // Create a new Random object to generate a random number for the coin flip
        Random rand = new Random();

        // Print a welcome message to the console
        System.out.println("Welcome to the Coin Flip Game!");

        // Print a message to prompt the user to begin the game
        System.out.println("Let's begin the game!\n");

        // Declare a variable to store player 1's choice
        String player1Choice;
        // Loop until player 1 enters a valid choice of "heads" or "tails"
        do {
            // Prompt player 1 to enter their choice of "heads" or "tails"
            System.out.print("Player 1, enter your choice (heads/tails): ");
            // Read the user's input and convert it to lowercase for case-insensitive comparison
            player1Choice = input.nextLine().toLowerCase();
            // Check if the user's input is invalid (not "heads" or "tails")
            if (!player1Choice.equals("heads") && !player1Choice.equals("tails")) {
                // Print an error message to the console
                System.out.println("Invalid response! Please choose between heads or tails.");
            }
        // Continue looping until player 1 enters a valid choice
        } while (!player1Choice.equals("heads") && !player1Choice.equals("tails"));

        // Generate a random number (0 or 1) to simulate the coin flip
        int coin = rand.nextInt(2);
        // Check if the coin landed on "heads" and player 1 chose "heads", or if the coin landed on "tails" and player 1 chose "tails"
        if ((coin == 0 && player1Choice.equals("heads")) || (coin == 1 && player1Choice.equals("tails"))) {
            // Print a message to indicate that player 1 won the game
            System.out.println("Player 1 wins!");
        } else {
            // Otherwise, print a message to indicate that player 2 won the game
            System.out.println("Player 2 wins!");
        }
    }
}
