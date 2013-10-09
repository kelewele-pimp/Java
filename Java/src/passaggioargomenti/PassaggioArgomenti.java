/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passaggioargomenti;

/**
 *
 * @author Desmond
 */
public class PassaggioArgomenti {

    /**
     * @param args the command line arguments
     */
    public static void fooNonMod(int a_in_method){
        a_in_method = 100; 
    }
    
    public static void fooMod(My_Int a_in_method_rif){
        a_in_method_rif.val = 100; 
    }
    
    public static void main(String[] args) {
        My_Int an_int = new My_Int();
        an_int.val = 200; 
        
        fooMod(an_int);
        System.out.println("an_int_value: " + an_int.val);
        
        int c = 200;
        fooNonMod(c);
        System.out
                .println("c vale: " + c);
    }

    private static class My_Int {
        
        public int val; 
    }
}
