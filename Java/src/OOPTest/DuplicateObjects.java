/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author desmond
 */
public class DuplicateObjects {

    public static void main(String[] args) {
        PetDog myPet = new PetDog("Fang", "Chihuahua", "Max", "Circus Flea");
        System.out.println("\nMy pet details:\n" + myPet);
        PetDog yourPet = new PetDog(myPet);
        System.out.println("\nYour pet details:\n" + yourPet);
        yourPet.setName("Gnasher");             //change pet's name
        yourPet.getPetFlea().setName("Atlas");  //change pet's flea's name
        System.out.println("\nYour pet details:\n" + yourPet);
        System.out.println("\nMy pet details:\n" + myPet);

    }
}
