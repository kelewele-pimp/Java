/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayTest;

/**
 *
 * @author Desmond
 */
public class ArrayBidi {

    public static void main(String args[]) {

        //matrice di stringhe
        String[][] computer_table = {
            {"Monitor", "Casse", "Stampante", "Plotter"},
            {"Mouse", "Tastiera", "Joypad", "Scanner"}
        };

        System.out.println("Periferiche di Input/Output");
        System.out.println("------------------------------------------------");

        //Ciclo esterno 
        for (int i = 0; i < computer_table.length; i++) {
            for (int j = 0; j < computer_table[i].length; j++) {
                System.out.print(computer_table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
