public class PrintBoardTest {
    public static void main(String[] args){
        String[] guess = new String[]{"GREEN", "BLUE", "RED", "PINK"};
        Tile[][] tiles = new Tile[12][4];
        for(int i=0; i<tiles.length; i++){
            for(int j=0; j<tiles[i].length; j++){
                tiles[i][j] = new Tile();
            }
        }
        for(int x=0; x<=3; x++){
            tiles[0][x].setColour(guess[x]);
        }
        for(int i=0; i<tiles.length; i++){
            for(int j=0; j<tiles[i].length; j++){
                tiles[i][j].printTile();
            }
            System.out.println("");
        }
        

        
        System.out.println(" ___________");
        System.out.println("/  R G B W  \\");
        for(int i=0; i<=12; i++){
            System.out.println("|  R G B W  |");    
        }
        System.out.println("\\___________/");
        
        System.out.println("The board^");
    }
}
