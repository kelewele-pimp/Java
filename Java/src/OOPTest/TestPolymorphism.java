/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

import java.util.Random;

/**
 *
 * @author desmond
 */
public class TestPolymorphism {

    public static void main(String args[]) {

        //Create an array of three different animals
        Animal[] theAnimals = {
            new Dog("Rover", "Poodle"),
            new Cat("Max", "Abbyssinian"),
            new Duck("Daffy", "Aylesbury")
        };

        Animal petChoice;
        Random select = new Random();    //Random number generator
        //Make 5 random choices of pet
        for(int i = 0; i < 5; i++){
            //choose the random animal
            petChoice = theAnimals[select.nextInt(theAnimals.length)];
            System.out.println("\nYour choice:\n" + petChoice); //get the pets reaction
            petChoice.sound();
        }
    }
}
