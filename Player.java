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
    
    //player name entry
    public String getName() {
        return name;
    }
    
    //player choice entry
    public String getChoice() {
        return choice;
    }
    
    //get RoundsWon
    public int getRoundsWon() {
        return roundsWon;
    }
    
    //set player name
    public void setName(String n) {
        name = n.toLowerCase();
    }
    
    //set player choice
    public void setChoice(String c) {
        choice = c.toLowerCase();
    }
    
    //set roundswon
    public void setRoundsWon(int rw) {
        roundsWon = rw;
    }
    
    //increment roundswon
    public void incrementRoundsWon() {
        roundsWon++;
    }
    
    //get UserInput from console
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
