/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.io.Serializable;

/**
 *
 * @author desmond
 */
public class BookEntry implements Serializable {
    private Person person;
    private PhoneNumber phoneNumber; 
    private static final long serialVersionUID = 1001L; 

    public BookEntry(Person person, PhoneNumber phoneNumber) {
        this.person = person;
        this.phoneNumber = phoneNumber;
    }
    
    

    public Person getPerson() {
        return person;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PhonebookEntry{" + "person=" + person + ", phoneNumber=" + phoneNumber + '}';
    }
    
    //Read an entry from the keyboard
    public static BookEntry readEntry(){
        return new BookEntry(Person.readPerson(), PhoneNumber.readNumber()); 
    }
}
