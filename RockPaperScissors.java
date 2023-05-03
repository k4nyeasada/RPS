package rockpaperscissors;
import java.util.Scanner;

class RockPapersScissors {
    
    static Player p1;
    static Player p2;
    static Player[] players = new Player[2];
    
    static Scanner in;
    static String msg1 = "Enter choice: ";
    
    static int limit = 3; 
    static boolean stop = false; 
    
    private static boolean isWin(Player p1, Player p2) {
        if(p1.getChoice().equals("rock")) {
            if(p2.getChoice().equals("scissors")) {
                return true;
            } else if(p2.getChoice().equals("paper")) {
                return false;
            }
        } else if(p1.getChoice().equals("paper")) {
            if(p2.getChoice().equals("rock")) {
                return true;
            } else if(p2.getChoice().equals("scissors")) {
                return false;
            }
        } else if(p1.getChoice().equals("scissors")) {
            if(p2.getChoice().equals("paper")) {
                return true;
            } else if(p2.getChoice().equals("rock")) {
                return false;
            }
        }
        return false;
    }
    
    private static void run() {
        do { 
            for(Player p: players) {
                System.out.println(p.getName() + "'s turn");
                p.setChoice(p.getUserInput(in, msg1));
            }
            
            if(p1.getChoice().equals(p2.getChoice())) {
                System.out.println("Tie!");
                continue;
            }
            
            if(isWin(p1, p2)) {
                System.out.println(p1.getChoice() + 
                        " beats " + p2.getChoice());
                p1.incrementRoundsWon();
            } else if(isWin(p2, p1)) {
                System.out.println(p2.getChoice() + 
                        " beats " + p1.getChoice());
                p2.incrementRoundsWon();
            }
            
            System.out.println();
            
            if(p1.getRoundsWon() == limit) {
                System.out.println(p1.getName() + " wins!");
                stop = true;
            } else if(p2.getRoundsWon() == limit){
                System.out.println(p2.getName() + " wins!");
                stop = true;
            }
        } while(!stop);
    }
    
    public static void main(String args[]) {
        p1 = new Player("Player 1");
        p2 = new Player("Player 2");
        
        players[0] = p1;
        players[1] = p2;
        
        in = new Scanner(System.in);
        
        try {
            run();
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            in.close();
        }
    }
}