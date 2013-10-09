/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passaggioargomenti;

/**
 *Un metodo può essere definito con la possibiltà di ricevere una lista di 
 * argomenti il cui numero non è noto a priori
 * @author Desmond
 */
public class ArgLunghezzaVariabile {
    
    public static void doSum(int ... c){
        
        int sum = 0; 
        for(int i : c){
            sum += i; 
        }
        System.out.println("La somma è : " + sum);
    }
    
    public static void main(String[] args){
        int sum_array[] = {22, 33, 44, 55, 66, 77, 88, 99}; 
        int val1 = 20, val2 = 30, val3 = 60, val4 = 70;
        
        doSum(sum_array);
        System.out.println();
        doSum(val1,val2,val3,val4);
    }
}
