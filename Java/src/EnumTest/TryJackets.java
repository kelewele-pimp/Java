/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTest;

/**
 *
 * @author desmond
 */
public class TryJackets {

    public static void main(String args[]) {

        //Define some jackets
        Jacket[] jackets = {
            new Jacket(JacketSize.medium, JacketColor.red),
            new Jacket(JacketSize.small, JacketColor.green),
            new Jacket(JacketSize.extra_large, JacketColor.yellow),
            new Jacket(JacketSize.extra_extra_large, JacketColor.blue)
        };

        //output colors available
        System.out.println("Jackets colors available are:\n");
        for (JacketColor color : JacketColor.values()) {
            System.out.println(" " + color);
        }

        //output sizes available
        System.out.println("Jackets sizes available are:\n");
        for (JacketSize sizes : JacketSize.values()) {
            System.out.println(" " + sizes);
        }

        System.out.println("\n\nJackets in stock are:\n");
        for (Jacket jacket : jackets) {
            System.out.println(jacket);
        }

        System.out.println();
    }
}
