/*
*Santiago Luna F2032367
*This class creates the playing field and prints it.
*It gets the guess from the user and checks if its a valid input.
*It compares the guess to the code generated.
*/

import java.util.Scanner;

public class Board {
final String[] COLOURS = new String[]{"RED", "YELLOW", "WHITE", "PINK", "GREEN", "BLUE", "GREY", "ORANGE"}; 
private String[] guess = new String[4];
private Tile[][] tiles = new Tile[12][4];
private int[][] rightSpot = new int[12][1];
private int[][] wrongSpot = new int[12][1];
private int rounds = 0;

    public Board(){
        //initializing the tile objects
        for(int i=0; i<tiles.length; i++){
            for(int j=0; j<tiles[i].length; j++){
                tiles[i][j] = new Tile();
            }
        }
    }

    //adds number of rounds game has been going for also just using it as a counter
    public void addRounds(){
        rounds++;
    }
    
    //prints the playing field
    public void printBoard(){
        System.out.println("...............RIGHT SPOT....WRONG SPOT");
        for(int i=0; i<tiles.length; i++){
            for(int j=0; j<tiles[i].length; j++){
                tiles[i][j].printTile();        
            }
            System.out.print("     "+rightSpot[i][0]);
            System.out.print("               " + wrongSpot[i][0]);
            System.out.println("");
        }
        
    }

    public void setTileAt(int rounds){
        for(int i=0; i<guess.length; i++){
                tiles[rounds][i].setColour(guess[i]);
        }
    }

    public String[] getGuess(){
        return this.guess;
    }

    //gets the color guesses of the user
    public String[] guess(){
    Scanner reader = new Scanner(System.in);
    
    System.out.println("enter colour 1");
    guess[0] = reader.nextLine();
    while(isColour(guess[0]) == false){
        System.out.println("You did not enter a colour. Please try again!");
        guess[0] = reader.nextLine();
    }
    
    System.out.println("enter colour 2");
    guess[1] = reader.nextLine();
    while(isColour(guess[1]) == false){
        System.out.println("You did not enter a colour. Please try again!");
        guess[1] = reader.nextLine();
    }

    System.out.println("enter colour 3");
    guess[2] = reader.nextLine();
    while(isColour(guess[2]) == false){
        System.out.println("You did not enter a colour. Please try again!");
        guess[2] = reader.nextLine();
    }
    System.out.println("enter colour 4");
    guess[3] = reader.nextLine();
    while(isColour(guess[3]) == false){
        System.out.println("You did not enter a colour. Please try again!");
        guess[3] = reader.nextLine();
    }
    return guess;
    }

    //prints your guess, dont rlly need this now
    public String toString(){
        String empty = "";
     for(int i=0; i<guess.length; i++){
         empty = empty + guess[i]+ ", ";
     }
     return "your guess: "+empty;
    }


    //checks if the user's guess matches the generated combination
    public boolean compareColours(String[] guess, String[] code){
        boolean[] compared = new boolean[4];
        int rightColourSpot = 0;
        int rightColourWrongSpot = 0;

    //this loop checks for if the colours match and then adds a marker on them so it doesn't get compared after
    for(int i=0; i<code.length; i++){
        if(guess[i].toUpperCase().equals(code[i])){
            rightColourSpot+=1;
            compared[i] = true;
        }
    }
    
    //this loop checks for if the colour is right but in the wrong spot
    for(int i=0; i<guess.length; i++){
        for(int n=0; n<code.length; n++){
            if(!compared[i] && i!=n && guess[i].toUpperCase().equals(code[n])){
                rightColourWrongSpot++;
                break;
                 }
            }
        }
        
    wrongSpot[rounds][0] = rightColourWrongSpot;
    rightSpot[rounds][0] = rightColourSpot;
            
    return rightColourSpot == 4;
    }

    //checks if the input the user put in is a valid colour
    private boolean isColour(String colour){
        boolean check=false;
        for(int i=0; i<this.COLOURS.length; i++){
            if(colour.toUpperCase().equals(COLOURS[i])){
                check = true;
                return check;
            } else{
                check = false;
            }
        }
        return check;
    }

    //UI
    public void printColours(){
        System.out.print("The available colours are: ");
        for(int i=0; i<COLOURS.length; i++){
            System.out.print(COLOURS[i]+", ");
        }
        System.out.println("");
    }

}
