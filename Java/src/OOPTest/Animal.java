/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public abstract class Animal {

    private String type;

    public Animal(String type) {
        this.type = type;
    }
    
    //Copy Constructor for Animal
    public Animal(Animal animal){
        this.type = animal.type; 
    }

    @Override
    public String toString() {
        return "This is a " + type;
    }

    //Dummy method to be implemented in the derived classes
    public abstract void sound(); //abstract method (cannot have a body)
}
