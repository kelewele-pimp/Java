/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public class PetDog extends Dog {
    
    private Flea petFlea; 
    
    public PetDog(String name, String breed, String fleaName, String fleaSpecies){
        super(name, breed);
        petFlea = new Flea(fleaName, fleaSpecies); 
    }
    
    //Copy Constructor
    public PetDog(PetDog pet){
        super(pet);
        this.petFlea = pet.petFlea; 
    }

    public Flea getPetFlea() {
        return petFlea;
    }

    public void setPetFlea(Flea petFlea) {
        this.petFlea = petFlea;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIt's " + " - a pet dog.\nIt has a flea:\n" + petFlea; 
    }
    
    
}
