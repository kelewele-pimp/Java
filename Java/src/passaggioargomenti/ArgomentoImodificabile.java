/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package passaggioargomenti;

/**
 *
 * @author Desmond
 */
class AClass {

    public void printMe() {
        //Empty Method
    }
}

class AClass_Child_1 extends AClass {

    @Override
    public void printMe() {
        System.out.println("Sono il figlio 1");
    }
}

class AClass_Child_2 extends AClass {

    @Override
    public void printMe() {
        System.out.println("Sono il figlio 2");
    }
}
/*
 * Una variabile di rifierimemto passato come argomento non sarà mai 
 * , essa stessa, modificabile dal paramentro, poichè, viene passata una coppia 
 * del riferimento alla memoria dell'oggetto e non l'indirizzo di memoria 
 * dell'argomento stesso.
 */
public class ArgomentoImodificabile {
    
    public static void aMethod(AClass a_class){
        a_class = new AClass_Child_2(); //* Non modifica il referimento 
    }
    
    public static void main(String args[]){
        AClass an_Object = new AClass_Child_1();
        aMethod(an_Object); //*
        an_Object.printMe(); 
    }
}
