/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

import java.util.Iterator;

/**
 *
 * @author desmond
 */
public class TryBinaryTree2 {
    
     public static void main(String[] args) {
        int[] numbers = new int[30];
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = (int) (1000.0 * Math.random()); //Random integers 0 to 99
        }

        //List starting integer values
        int count = 0;
        System.out.println("Original values are : ");
        for (int number : numbers) {
            System.out.printf("%6d", number);
            if (++count % 6 == 0) {
                System.out.println();
            }
        }

        //Create the tree and add the integers to it
        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int number : numbers) {
            tree.add(number);
        }

        //Get sorted values
        LinkedList<Integer> values = tree.sort();
        System.out.println("\nSortted values are: ");
         listAll(values);

        //Create an array of words  to be stored 
        String[] words = {
            "vacillate", "procastinate", "arboreal", "syzygy",
            "xenocracy", "zygote", "mephitic", "soporific",
            "grisly", "gristly"
        };

        System.out.println("\nOriginal sequence:");
        for (String s : words) {
            System.out.printf("%-15s", s);
            if (++count % 5 == 0) {
                System.out.println();
            }
        }

        //Create the tree and insert the words
        BinaryTree<String> cache = new BinaryTree<>();
        for (String word : words) {
            cache.add(word);
        }
        //sort the words 
        LinkedList<String> sortedWords = cache.sort();
        listAll(sortedWords);

        //List the sorted words
        System.out.println("\nSorted sequence:");
        
    }
     public static void listAll(LinkedList<?> list){
         for (Iterator<?> it = list.iterator(); it.hasNext();) {
             Object obj = it.next();
             System.out.println(obj);
         }
     }
}
