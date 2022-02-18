/*
*Santiago Luna F2032367
*This is where the game takes place.
*It is responsible for checking if the user won or lost.
*/

import java.util.Scanner;
public class Mastermind{
public static void main(String[] args){
    int rounds = 0;
    Scanner reader = new Scanner(System.in);

    System.out.println("Welcome to MASTERMIND\u2122");
    try{
        
        Thread.sleep(1000);
        System.out.println("Would you like to start (s) or read the instructions (i)?");
        char answer = reader.next().charAt(0);
        if(answer == 'i'|| answer == 'I'){
            instructions();
            Thread.sleep(1000);
            System.out.println("Would you like to start (s) now?");
            answer = reader.next().charAt(0);
            if(answer == 's' || answer == 'S'){
                Thread.sleep(1000);
                System.out.println("Starting game...");
                Thread.sleep(1000);
            }
        }else if(answer == 's' || answer == 'S'){
            Thread.sleep(1000);
            System.out.println("Starting game...");
            Thread.sleep(1000);
        }
        
    } catch(InterruptedException ie){
      System.out.println("interrupted!");  
    }


    CodeGenerator code = new CodeGenerator();
    Board board = new Board();

    //the whole game runs in this loop
    try{
        while(rounds<12){
        System.out.println("ROUND " + (rounds));
        board.printColours();
        //System.out.println(code); un-comment this to show the combination
        board.printBoard();
        board.guess();
        board.setTileAt(rounds);
        if(board.compareColours(board.getGuess(), code.getCode())){
            win();
            System.out.println("The code was: "+code);
        }
        board.addRounds();
        rounds++;
    }
}catch(ArrayIndexOutOfBoundsException e){
    lose(code);
}
    

    
}


public static void instructions(){
        System.out.println("Objective of the game: you must break the secret code in the fewest number of guesses");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("When prompted you must type in a colour that is either Red, Yellow, White, Pink, Green, Blue, Grey or Orange.");
}

public static void win(){
        System.out.println("YOU WIN!");
        System.exit(0);
    
}

public static void lose(CodeGenerator code){
        System.out.println("You lost:(... it's okay tho I'm not that good either");
        System.out.println("The code you had to solve was: "+ code);
        System.out.println("Thanks for playing adaptation by Santiago Luna");
        System.exit(0);
}
}