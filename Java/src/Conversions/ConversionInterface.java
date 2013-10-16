/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversions;

/**
 *
 * @author desmond
 * 
 * To use this class, you simple have to implement it in 
 * order to have all the members directly in the "derived" class
 * Another way is to by just qualifying the name with the name of the interface
 * example ConverionINterface.POUND_TO_GRAM
 */
public interface ConversionInterface {
    double INCH_TO_MM = 25.4; 
    double OUNCE_TO_GRAM = 28.349523124; 
    double POUND_TO_GRAM = 453.5924; 
    double HP_TO_WATT = 745.7; 
    double WATT_TO_HP = 1.0/HP_TO_WATT; 
}
