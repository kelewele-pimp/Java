/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author desmond
 */
public class StringTokenizing {
    
    public static void main(String[] args){
        
        String text = "To be or not to be, that is the question."; 
        String delimiters = "[, .]"; //declare delimiters to be a comma, a space or a dot
        int[] limits = {0, -1}; 
        
        for(int limit: limits){
            System.out.println("Analysis with limit " + limit);
            String[] tokens = text.split(delimiters, limit); 
            System.out.println("Number of tokens: " + tokens.length);
            for(String token: tokens){
                System.out.println(token); 
            }
        }
    }
    
}
