/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author desmond
 */
public class Person implements Comparable<Person>, Serializable {

    private static BufferedReader keyboard = new BufferedReader(
            new InputStreamReader(System.in));
    private String firstname;
    private String lastname;
    private static final long serialVersionUID = 1001L;

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

    @Override
    public int compareTo(Person person) {
        int result = this.lastname.compareTo(person.lastname);
        if (result == 0) {
            return this.firstname.compareTo(person.firstname);
        } else {
            return result;
        }
    }

    @Override
    public boolean equals(Object Person) {
        return compareTo((Person) Person) == 0;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.firstname);
        hash = 67 * hash + Objects.hashCode(this.lastname);
        return hash;
    } 
    
    public static Person readPerson() {
    
        String firstname = null; 
        String lastname = null; 
        try {
            System.out.println("Enter firstname: ");
            firstname = keyboard.readLine().trim(); 
            System.out.println("Enter lastname: ");
            lastname = keyboard.readLine().trim(); 
        } catch (Exception e) {
            System.err.println("Error reading name.");
            e.printStackTrace();
            System.exit(1);
        }
        return new Person(firstname, lastname); 
    }

    /**
     * Get the value of serialVersionUID
     *
     * @return the value of serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
