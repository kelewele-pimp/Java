/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author desmond
 */
public class LuckyStars {
    
    public static void main(String args[]){
        String[] names = {
            "Joe Kobby", "Mutabaruka Stravinsky", "T_Master_J", "Lil finger", 
            "Lee Shane"
        }; 
        
        System.out.println("Your lucky star for today is:" +
                names[(int) (names.length*Math.random())]);
    }
    
}
