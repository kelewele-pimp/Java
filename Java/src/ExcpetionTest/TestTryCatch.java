/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcpetionTest;

/**
 *
 * @author desmond
 */
public class TestTryCatch {
    
    public static void main(String[] args) {
        int i = 1; 
        int j = 0; 
        
        try{
            System.out.println("Try block entered: i = " + i + " j = " + j);
            System.out.println(i/j);
            System.out.println("Ending try block");
        } catch(ArithmeticException e){
            System.out.println("Arithmetic exception caught");
        }
        
        System.out.println("After try block");
    }
}
