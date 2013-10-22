/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcpetionTest;

import java.io.IOException;

/**
 *
 * @author desmond
 */
public class TryBlockTest {
 
    private static int divide(int[] array, int index){
        try{
            System.out.println("\bFirst try block in divide() entered");
            array[index + 2] = array[index]/array[index] + 1; 
            System.out.println("Code at end of first try block in divide()");
            return array[index + 2];
        } catch(ArithmeticException e){
            System.err.println("Arithmetic exception caught in divide()\n"
                    + "\nMessage in exception object: \n\t"
                    + e.getMessage());
            e.printStackTrace();
            System.err.println("End of stack trace output\n");
            System.out.println("index = " + index + 
                    " Expression: array[" + index + "]/array[" + (index+1) + "] is " + 
                    array[index] + "//" + array[index + 1]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("index of of bounds exception caught in divide()\n"
                    + "\nMessage in exception object:\n\t"
                    + e.getMessage());
            System.err.println("\nStack trace output\n");
            e.printStackTrace();
            System.out.println("\nEnd of stack trace output\n");
            System.out.println("array lenght = " + array.length + 
                    " index = " + index);
        } finally {
            System.out.println("Finally block in divide()");
        }
        
        System.out.println("Executing code after try block in divide()");
        return array[index + 2]; 
    }
    
    public static void main(String[] args) {
        int[] x = {10, 5, 0}; 
        
        //This block only throws an exception only if the divide method does
        try{
            System.out.println("First try block in main() entered");
            System.out.println("result = " + divide(x, 0));
            x[1] = 0; 
            System.out.println("result = " + divide(x, 0));
            x[1] = 1; 
            System.out.println("result " + divide(x, 1));
        } catch(ArithmeticException e){
            System.out.println("Arithmentic exception caught in main()");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index-out-of-bounds exception caught in main()");
        }
       
        System.out.println("Outside first try block in main()");
        System.out.println("\nPress Enter to exit");
    
        //This try block is just to pause the program befor returning
        try{
            System.out.println("In second try bloc k in main");
            System.in.read();  //pause and wait for input
            return;
        } catch(IOException e){
            System.out.println("IO exception caught in main()");
        } finally {
            System.out.println("Code after second try block in main()");
        }
    
    }
    
}
