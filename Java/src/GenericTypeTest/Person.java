/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name; 
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    @Override
     public int compareTo(Person person) {
         if(person == this){
             return 0;
         } else {
             return this.name.compareTo(person.name); 
         }
     }
     
    @Override
     public String toString(){
         return name; 
     }
}
