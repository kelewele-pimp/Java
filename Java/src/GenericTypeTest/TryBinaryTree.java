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
        count = 0;
        System.out.println("\nSortted values are: ");
        for (Integer value : values) {
            System.out.printf("%6d", value);
            if (++count % 6 == 0) {
                System.out.println();
            }
        }

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

        //List the sorted words
        System.out.println("\nSorted sequence:");
        count = 0;     //update count
        for (String w : sortedWords) {
            System.out.printf("%-15s", w);
            if (++count % 5 == 0) {
                System.out.println();
            }
        }
    }
}
