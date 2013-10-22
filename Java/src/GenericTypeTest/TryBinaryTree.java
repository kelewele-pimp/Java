/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class TryBinaryTree {
    
    public static void main(String[] args) {
        int[] numbers = new int[30]; 
        for(int i = 0; i < numbers.length; ++i){
            numbers[i] = (int)(1000.0 * Math.random()); //Random integers 0 to 99
        }
        
        //List starting integer values
        int count = 0; 
        System.out.println("Original values are : ");
        for(int number : numbers){
            if(++count % 6 == 0){
                System.out.println();
            }
        }
        
        //Create the tree and add the integers to it
        BinaryTree<Integer> tree = new BinaryTree<>(); 
        for(int number : numbers){
            tree.add(number);
        }
        
        //Get sorted values
        LinkedList<Integer> values = tree.sort(); 
        count = 0; 
        System.out.println("\nSortted values are: ");
        for(Integer value: values){
            System.out.printf("&6d", value);
            if(++count % 6 == 0){
                System.out.println();
            }
        }
    }
}
