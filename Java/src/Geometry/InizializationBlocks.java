/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometry;

/**
 *
 * @author desmond
 */
public class InizializationBlocks {
    
    static int[] values = new int[10];  //static array member
    
    //Inizialization block
    static {
        System.out.println("Running inizialization block");
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(100.0 * Math.random()); 
        }
    }
    //List values in the array for an object
    void listValues(){
        System.out.println(); 
        for(int value : values){
            System.out.print(" " + value);
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        InizializationBlocks example = new InizializationBlocks(); 
        System.out.println("\nFirst object");
        example.listValues();
        
        InizializationBlocks newexample = new InizializationBlocks(); 
        System.out.println("\nSecond object");
        example.listValues();
    }
}
