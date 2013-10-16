/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesAndStaticImports;
import static Conversions.ConversionClass.*;
        
        /**
 * @author desmond
 */
public class TryConversions {
    
    public static double poundsToGrams(double pounds){
        return pounds * POUND_TO_GRAM; 
    }
    
    public static double inchesToMIllimeters(double inches){
        return inches * INCH_TO_MM; 
    }
    
    public static void main(String[] args) {
        
        int myWeightPounds = 180; 
        int myHeightInches = 75; 
        
        System.out.println("My weight in pounds: " + myWeightPounds + " \t-in grams: " +
                (int)poundsToGrams(myWeightPounds));
        
        System.out.println("My height in inches: " + myHeightInches +  " \t-in millimeters: " + 
                (int)inchesToMIllimeters(myHeightInches));
    }
    
}
