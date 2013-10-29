/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author desmond
 */
public class Person {
    
    private String firstname; 
    private String lastname; 

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
    
}
