/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public class Duck extends Animal{
    
    private String name; 
    private String breed; 
    
    public Duck(String name){
        super("Duck"); 
        this.name = name; 
        this.breed = "unknown"; 
    }
    
    //Copy constructor for Duck
    public Duck(Duck duck){
        super(duck); 
        this.name = duck.name; 
        this.breed = duck.breed; 
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public Duck(String name, String breed){
        super("Duck"); 
        this.name = name; 
        this.breed = breed; 
    }
    
    @Override
    public void sound(){
        System.out.println("A ducks sound");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nIt's " + name + " the " + breed; 
    }
    
}
