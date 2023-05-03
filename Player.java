package rockpaperscissors;

import java.util.Scanner;

class Player {
    private String name;
    private String choice;
    private int roundsWon;
    
    Player(String n) {
        name = n;
        roundsWon = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getChoice() {
        return choice;
    }
    
    public int getRoundsWon() {
        return roundsWon;
    }
    
    public void setName(String n) {
        name = n.toLowerCase();
    }
    
    public void setChoice(String c) {
        choice = c.toLowerCase();
    }
    
    public void setRoundsWon(int rw) {
        roundsWon = rw;
    }
    
    public void incrementRoundsWon() {
        roundsWon++;
    }
    
    public String getUserInput(Scanner in, String msg) {
        System.out.print(msg);
        try {
            if(in.hasNextLine()) {
                choice = in.nextLine();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        return choice;
    }
}