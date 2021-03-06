/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;



/**
 *
 * @author desmond
 */
public class TrySimpleVector {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>(15, 1); //args : capacity, capacity increment
        String[] firstnames = {
            "Jack", "Jill", "John", "Joan", "Jeremiah", "Josephine"
        };

        //Add the names to the vector
        for (String s : firstnames) {
            names.add(s);
        }

        //View the content of the vector
        for (String name : names) {
            System.out.println(name);
        }

        //View content using the iterator

        System.out.println("");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
        }


        //View using the get method
        System.out.println("");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }


        //Get the capacity of the vector
        System.out.println("Vector capacity is: " + names.capacity());

        //Get free available space
        int available_space = names.capacity() - names.size();
        System.out.println("Available space in vector is: " + available_space);

        //change the capacity to match the current size
        names.trimToSize();  //set capacity to size
        System.out.println("Current capacity: " + names.capacity());

        //Add an object at a specific position
        names.add(2, "I'M NEW :)");
        System.out.println(names);//call the tostring method of vector


        //Replace an element in a given position
        names.set(3, "I JUST CAME :)");
        System.out.println(names);

        //Add all objects from another collection to the vector
        System.out.println("\n\n");
        LinkedList<String> copy_names = new LinkedList<>();
        for (String default_names : names) {
            copy_names.add(default_names);
        }

        names.addAll(copy_names);
        System.out.println(names);

        names.addAll(4, copy_names);
        System.out.println(names);


        //retrieve objects using get and first element 

        String first_element = names.firstElement();
        String get_element_at = names.get(3);

        System.out.println("Element at first position is: " + first_element);
        System.out.println("Element at a selected position is " + get_element_at);

        //Access elemensts of the vector using the ListIterator
        ListIterator<String> iterator = names.listIterator();
        //By passing an integer value as an argument, 
        //the iterator begins from the specified position which was passed 
        //as an argument

        //Retrieve elements as an array

        String[] data = names.toArray(new String[names.size()]);

        //nb: the array method asList() converts an array into a list 

        //Using asList
        String[] people = {
            "Jack", "Jill", "John", "Joan", "Jeremiah", "Josephine"
        };
        
        List<String> people_list = java.util.Arrays.asList(people); 
        
        Vector<String> name_set = new Vector<>(people_list);
        
        //Removing objects
        String removed_name = names.remove(1); 
        System.out.println("Removed element is : " + removed_name);
        
        boolean deleted = names.remove("Jack");
        
        if(deleted){
            System.out.println("Jack was deleted");
        } else {
            System.out.println("Jack was not found");
        }
        
        //To remove all elements in the vector in one go, 
        //use names.removeAllElements(); 
        
    }
}
