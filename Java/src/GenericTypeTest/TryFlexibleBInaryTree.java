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
public class TryFlexibleBInaryTree {
    
    public static void main(String[] args) {
        
        BinaryTreeWild<Manager> people = new BinaryTreeWild<>();
        
        Manager[] managers = {
            new Manager("Joe", 10), new Manager("Albert", 3),
            new Manager("Freda ", 2), new Manager("Chris", 5)
        };
        
        for(Manager manager : managers) {
            people.add(manager);
            System.out.println("Added: " + manager);
        }
        
        System.out.println();
        listAll(people.sort());
    }
    
    public static void listAll(LinkedList<?> list){
         for (Iterator<?> it = list.iterator(); it.hasNext();) {
             Object obj = it.next();
             System.out.println(obj);
         }
     }
}
