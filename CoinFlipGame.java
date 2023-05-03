import java.util.Scanner;
import java.util.Random;

public class CoinFlipGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Welcome to the Coin Flip Game!");
        
        System.out.println("Let's begin the game!\n");
        
        String player1Choice;
        do {
            System.out.print("Player 1, enter your choice (heads/tails): ");
            player1Choice = input.nextLine().toLowerCase();
            if (!player1Choice.equals("heads") && !player1Choice.equals("tails")) {
                System.out.println("Invalid response! Please choose between heads or tails.");
            }
        } while (!player1Choice.equals("heads") && !player1Choice.equals("tails"));
        
        int coin = rand.nextInt(2);
        if ((coin == 0 && player1Choice.equals("heads")) || (coin == 1 && player1Choice.equals("tails"))) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
