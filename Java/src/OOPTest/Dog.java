/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public class Dog extends Animal {
    
    private String breed;
    private String name; 
    
    public Dog(String name){
        super("Dog");
        this.name = name; 
        this.breed = "unknown"; 
    }
    
    //Copy constructor for Dog
    public Dog(Dog dog){
        super(dog); 
        this.name = dog.name; 
        this.breed = dog.breed; 
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public Dog(String name, String breed){
        super("Dog");
        this.name = name; 
        this.breed = breed; 
    }
    
    @Override
    public void sound(){
        System.out.println("A dog's sound.....");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nit's " + name + " the " + breed; 
    }
}
