/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author Desmond
 */
public class Polimorfismo_Client {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(new Point2D(10, 10), 5, 3);
        Square s = new Square(new Point2D(50, 50), 3);

        Rectangle r2;
        Square s2;

        String output = "Un tipo rectangle: " + r + " " + "\nUn tipo Square: " + s + "\n";
        r2 = s; 
        output += "Un tipo Square tramite un riferimento di un itpo Rectangle " + r2; 
        System.out.println(output);
        
        output = "Verifichiamo il binding dinamico: "; 
        if(r2 instanceof Square){
            
            output += " *** r2 a runtime è un tipo square .... "
                    + "riassegniamolo a un tipo square **** "; 
            
            s2 = (Square) r2; 
        } else {
            output += "r2 non è un tipo square!";
        }
        System.out.println(output);
    }
}
