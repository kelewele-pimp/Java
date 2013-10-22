/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

import java.util.Iterator;
import sun.misc.JavaxSecurityAuthKerberosAccess;

/**
 *
 * @author desmond
 */
public class LinkedList<T> implements Iterable<T>{

    private ListItem start  = null; 
    private ListItem current = null; 
    private ListItem  end = null; 

    //Default constructor creates an empty list
    public LinkedList() {
        //NO - ARG CONSTRUCTOR
    }

    //Constuctor to create a list containing one object
    public LinkedList(T item) {
        if (item != null) {
            current = end = start = new ListItem(item); 
        }
    }
    
    //Construct a linked list from an array of objects
    public LinkedList(T[] items){
        if(items != null){
            //Add the items to the list
            for(int i = 0; i < items.length; ++i){
                addItem(items[i]);
            }
            current = start; 
        }
    }
    
    //Add an item object to the list
    public void addItem(T item){
        ListItem newEnd = new ListItem(item); //create a new ListItem
        if(start == null){                    //Is the list empty ? 
            start = end = newEnd;             //Yes, so new element is start and end
        } else {                              //No, so append the new element
            end.next = newEnd;                //set the next variable for old end
            end = newEnd;                     //store new item as end
        }
    }
    
    //Get the first object in the list
    public T getFirst(){
        current = start; 
        return start == null ? null : start.item; 
    }
    
    //Get the next object in the list
    public T getNext(){
        if(current != null){
            current = current.next; 
        }
        return current == null ? null : current.item; 
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
    
    //Iner class defining iterator objects for this linked list
    private class ListIterator implements Iterator<T> {
        
        private T nextElement; 
        
        //Constructor 
        public ListIterator(){
            nextElement = getFirst(); 
        }

        @Override
        public boolean hasNext() {
            return nextElement != null; 
        }

        @Override
        public T next() {
            T element = nextElement; 
            if(element == null){
                throw new java.util.NoSuchElementException(); 
            }
            
            nextElement = getNext(); 
            return element; 
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove Not supported yet."); 
        }
        
    }
    
    private class ListItem {

        ListItem next;
        T item;

        public ListItem(T item) {
            this.item = item;
            this.next = null;
        }

        //Return class name and object
        @Override
        public String toString() {
            return "ListItem " + item;
        }
    }
}
