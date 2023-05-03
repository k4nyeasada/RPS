import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {

        // create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message and instructions
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Player 1, please choose your move (rock, paper, or scissors):");

        // Read player 1's move
        String player1Move = getPlayerMove(scanner);

        // Prompt player 2 to choose their move
        System.out.println("Player 2, please choose your move (rock, paper, or scissors):");

        // Read player 2's move
        String player2Move = getPlayerMove(scanner);

        // Determine the winner
        String result = determineWinner(player1Move, player2Move);

        // Display the result
        System.out.println(result);

        // Close the scanner object
        scanner.close();
    }

    // Determine the winner based on the moves
    public static String determineWinner(String player1Move, String player2Move) {

        if (!isValidMove(player1Move) || !isValidMove(player2Move)) {
            return "Invalid move!";
        } else if (player1Move.equals(player2Move)) {
            return "It's a tie!";
        } else if (player1Move.equals("ROCK") && player2Move.equals("SCISSORS") ||
                player1Move.equals("PAPER") && player2Move.equals("ROCK") ||
                player1Move.equals("SCISSORS") && player2Move.equals("PAPER")) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }
    }

    // A method to validate a player's move
    public static boolean isValidMove(String move) {
        return move != null && !move.isEmpty() && (move.equalsIgnoreCase("rock") || move.equalsIgnoreCase("paper") || move.equalsIgnoreCase("scissors"));
    }

    // A method to read a player's move from the console and validate it
    public static String getPlayerMove(Scanner scanner) {
        String move = null;
        do {
            move = scanner.nextLine().toUpperCase();
            if (!isValidMove(move)) {
                System.out.println("Invalid move! Please choose again (rock, paper, or scissors):");
            }
        } while (!isValidMove(move));
        return move;
    }
}
