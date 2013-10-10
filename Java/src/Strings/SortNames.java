/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author desmond
 */
public class SortNames {
    
    public static void main(String[] args){
        
        String[] names = {
            "Godfrey Adams", "Albert Hayes", "Abena Grace", "Joe Stravinsky", 
            "Kweku Manu", "Lilwin Nkansah", "Godfred Adamah", "Alingo Kate", 
        };
        
        for(String s : names){
            System.out.println(s + " ");
        }
        
        sortArray(names);
        
        System.out.println("Affter sorting");
        System.out.println();
        
         for(String s : names){
            System.out.println(s + "");
        }
       
        
    }
    
    public static void sortArray(String[] names){
        String sorted_array; 
        for(int i = 0; i < names.length; i++){
            for(int j = i + 1; j < names.length; j++){
                if((names[i].compareTo(names[j]) > 0)){
                    String temp = names[i]; 
                    names[i] = names[j]; 
                    names[j] = temp; 
                }
            }
        }
    }
    
}
