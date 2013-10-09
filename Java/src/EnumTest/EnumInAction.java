/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTest;

/**
 *
 * @author Desmond
 */
public class EnumInAction {

    public static void main(String args[]) {

        System.out.println("Tipi di OS: [ ");

        for (OS tmp : OS.values()) {
            System.out.print("[ " + tmp + " titolo " + tmp.getTitle() + " ]");
        }
        
        System.out.print("\nOS scelto: ");

        OS a_s = OS.MAC;
        switch (a_s) {
            case WINDOWS:
                System.out.println("Windows... ");
                break;
            case LINUX:
                System.out.println("Linux... ");
                break;
            case MAC:
                System.out.println("Mac... ");
                break;
            default:
                break;
        }
    }
}
