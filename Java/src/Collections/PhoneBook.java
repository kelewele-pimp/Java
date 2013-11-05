/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author desmond
 */
public class PhoneBook implements Serializable {
    private HashMap<Person, BookEntry> phonebook = new HashMap<>(); 
    private static final long serialVersionUID = 1001L; 
    
    public void addEntry(BookEntry entry){
        phonebook.put(entry.getPerson(), entry);
    }
    
    public BookEntry getEntry(Person key){
        return phonebook.get(key); 
    }
    
    public PhoneNumber getNumber(Person key){
        BookEntry entry = getEntry(key); 
        if(entry != null){
            return entry.getPhoneNumber(); 
        } else {
            return null; 
        }
    }
}
