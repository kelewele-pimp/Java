/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTest;

/**
 *
 * @author Desmond
 */
public class Time_Client {
    
    public static void main(String args[]){
        Time t = new Time(); 
        
        System.out.println("Default time values: " + t.getTime());
        t.setTime(23, 30, 12);
        System.out.println("Current time value: " + t.getTime());
    }
}
