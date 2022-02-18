/* 
*Santiago Luna F2032367
*This class is responsible for holding information about a tile.
*It determines the colour of the tile and how it should be printed.
*/

public class Tile {
    private String colour;
    
    public Tile(){
        colour = null;
    }
    
    public void setColour(String c){
        this.colour = c;
    }

    public String getColour(){
        return this.colour;
    }
    
    private boolean isEmpty(String colour){
        if(colour == null){
            return true;
        } return false;
    }
    
    private boolean isRed(){
        if(this.colour.toUpperCase().equals("RED")){
            return true;
        } return false;
    }

    private boolean isYellow(){
        if(this.colour.toUpperCase().equals("YELLOW")){
            return true;
        } return false;
    }

    private boolean isWhite(){
        if(this.colour.toUpperCase().equals("WHITE")){
            return true;
        } return false;
    }

    private boolean isPink(){
        if(this.colour.toUpperCase().equals("PINK")){
            return true;
        } return false;
    }
    
    private boolean isGreen(){
        if(this.colour.toUpperCase().equals("GREEN")){
            return true;
        } return false;
    }

    private boolean isBlue(){
        if(this.colour.toUpperCase().equals("BLUE")){
            return true;
        } return false;
    }

    private boolean isGrey(){
        if(this.colour.toUpperCase().equals("GREY")){
            return true;
        } return false;
    }

    private boolean isOrange(){
        if(this.colour.toUpperCase().equals("ORANGE")){
            return true;
        } return false;
    }

    public void printTile(){
        if(isEmpty(colour)){
            System.out.print(" X ");
        }else if(isRed()){
            System.out.print(ANSI_RED+" R "+ANSI_RESET);
        }else if(isYellow()){
            System.out.print(ANSI_YELLOW+" Y "+ANSI_RESET);
        } else if(isWhite()){
            System.out.print(ANSI_WHITE+" W "+ANSI_RESET);
        }else if(isPink()){
            System.out.print(" P ");
        }else if(isGreen()){
            System.out.print(ANSI_GREEN+" GN "+ANSI_RESET);
        }else if(isBlue()){
            System.out.print(ANSI_BLUE+" B "+ANSI_RESET);
        }else if(isGrey()){
            System.out.print(" GY ");
        }else if(isOrange()){
            System.out.print(" O ");
        }
    }

    //colours!!!
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_WHITE = "\u001B[37m";
}
