/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTypeTest;

/**
 *
 * @author desmond
 */
public class TryAutoboxing {
    
    public static void main(String[] args) {
        LinkedList<Double> temperatures = new LinkedList<>(); 
        
        //Insert 6 temperature values from 0 to 25 degrees centigrade
        for(int i = 0; i < 6; ++i){
            temperatures.addItem(25.0 * Math.random());
        }    
        
        
        Double value  = temperatures.getFirst(); 
        while(value != null){
            System.out.printf("%.2f degrees Fahrenheit%n", toFahrenheit(value));
            value = temperatures.getNext(); 
        }
    }
    
    //convert Centigrade to Fahrenheit
    public static double toFahrenheit(double temperature){
        return 1.8 * temperature + 32.0; 
    }
}
