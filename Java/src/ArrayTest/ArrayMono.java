/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayTest;

/**
 *
 * @author Desmond
 */
public class ArrayMono {
    
    public static void main(String[] args){
        char name[] = {'P', 'e', 'l', 'l', 'e', 'g', 'r', 'i', 'n', 'o'}; 
        
        for(int i = 0; i < name.length; i++){
            if(i  < 4){
                System.out.print(name[i] + "");
            } else {
                System.out.println(name[i]);
            }
        }
    }
}
