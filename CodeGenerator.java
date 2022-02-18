/* 
*Santiago Luna F2032367
*this class generates the combination that the user will have to solve
*/

import java.util.Random;

public class CodeGenerator {
    private final String[] COLOURS = new String[]{"RED", "YELLOW", "WHITE", "PINK", "GREEN", "BLUE", "GREY", "ORANGE"};
    private String[] code = new String[4];

public CodeGenerator(){
    String[] combo = makeCode();
}
 
 public String[] makeCode(){ 
     Random rand = new Random();
    for(int i=0; i<code.length; i++){
        int randomNum = rand.nextInt(8);
        code[i] = COLOURS[randomNum];
    }
    return code;
 }

 public String toString(){
     String empty = "";
     for(int i=0; i<code.length; i++){
         empty = empty + code[i]+ ", ";
     }
     return empty;
 }

 public String[] getCode(){
     return this.code;
 }
}
