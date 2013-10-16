/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public class Flea extends Animal {

    private String name;
    private String species;

    public Flea(String name, String breed) {
        super("Flea");
        this.name = name;
        this.species = breed;
    }
    
    //Copy constructor for 
    public Flea(Flea flea){
        super(flea);   //call the base copy cnstructor
        this.name = flea.name; 
        this.species  = flea.species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String breed) {
        this.species = breed;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void sound() {
        System.out.println("Flea sound"); 
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nIt's " + name + " the " + species; 
    }
}
