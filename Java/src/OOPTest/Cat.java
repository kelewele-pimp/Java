/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public class Cat extends Animal {
    
    private String name; 
    private String breed; 
    
    public Cat(String name){
        super("Cat"); 
        this.name = name; 
        this.breed = "unknown"; 
    }
    
    public Cat(String name, String breed){
        super("Cat");
        this.name = name; 
        this.breed = breed; 
    }
    
    @Override
    public void sound(){
        System.out.println("A cats sound...."); 
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nIt's " + name + " the " + breed; 
    }
}
