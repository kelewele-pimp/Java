/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public class TryVariableArgumentList {
    public static void main(String[] args){
        printAll(2, "two", 4, "four", 4.5, "four point five");
        printAll();
        printAll(25, "Anything goes", true, 4E4, false);
        
        double average = average(2.4, 3.3, 1.7, 7.7, 1.1, 9.0);
        
        printAll("The average value is " + average);
    }
    
    public static void printAll(Object ... args){
        for(Object arg: args){
            System.out.print(" " + arg);
        }
        System.out.println();
    }
    
    public static Double average(Double ... values){
        if(values.length == 0){
            return 0.0; 
        } else {
            double ave = 0.0; 
            for(double value : values){
                ave += value; 
            }
            return ave/values.length; 
        }
    }
}
