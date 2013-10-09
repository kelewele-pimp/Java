/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTest;

/**
 *
 * @author Desmond
 */
public class Man_1_Client {
    
    public static void main(String[] args){
        Man_1 m1 = new Man_1("Principe", "Pellegrino", new Time(8));
        Man_1 m2 = new Man_1("Rizzo", "Stefano", new Time(9)); 
        Man_1 m3 = new Man_1("Rossi ", "Alberto", new Time(10));
        
        //stampa quante istanze sono state create
        System.out.println("Sono stati creati " + Man_1.how_many + " uomini");
    }
}
