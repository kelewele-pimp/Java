/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author desmond
 */
public class FindCharacters {

    public static void main(String[] args) {

        String text = "You extract a character from a String object by using the charAt() method. This accepts an integer\n"
                + "argument that is the offset of the character position from the beginning of the string — in other words, an\n"
                + "index";

        int andCount = 0;
        int theCount = 0;

        int index = -1;

        String andString = "and";
        String theString = "the";

        index = text.indexOf(andString); //Find first and
        //Search forward for an and
        while (index >= 0) {
            ++andCount;
           index += andString.length();
           index = text.indexOf(andString, index);  //step to position after last 'and'   
        }
        
        index = -1; 
        index = text.indexOf(theString); 
        //Search forward for a the
        while(index >= 0){
            ++theCount; 
            index += theString.length(); 
            index = text.indexOf(theString, index);
        }
        
        System.out.println(andCount + " \"" + andString + "\" counted");
        System.out.println(theCount + " \"" + theString + "\" counted");
    }
}
