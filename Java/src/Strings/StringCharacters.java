/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author desmond
 */
public class StringCharacters {

    public static void main(String[] args) {
        
        
        int vowels = 0; 
        int letters = 0; 
        int spaces = 0; 

        String text = "You extract a character from a String object by using the charAt() method. This accepts an integer\n"
                + "argument that is the offset of the character position from the beginning of the string — in other words, an\n"
                + "index";
        
        for(int i = 0; i < text.length(); ++i){
            char ch = Character.toLowerCase(text.charAt(i)); 
            //check for vowels
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++; 
            }
            
            //check for letters
            if(Character.isLetter(ch)){
                letters++; 
            }
            //check for spaces
            if(Character.isWhitespace(ch)){
                spaces++; 
            }
        }
        
        System.out.println("The text contains: \n" 
                + vowels + " vowels\n"
                + (letters - vowels) + " consonants\n"
                + spaces + " white spaces.");
        
    }
}
