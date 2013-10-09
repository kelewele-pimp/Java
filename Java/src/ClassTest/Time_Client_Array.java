/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTest;

/**
 *
 * @author Desmond
 */
public class Time_Client_Array {
    
    public static void main(String[] args){
        
        Time time_array[] = {
        new Time(17, 43, 22), new Time(13, 21, 44), new Time(15)
        };
        
        for(int i = 0; i < time_array.length; i++){
            System.out.println("t[" + i + "] " + time_array[i].getTime());
        }
    }
}
