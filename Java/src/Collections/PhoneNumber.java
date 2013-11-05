/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

/**
 *
 * @author desmond
 */
public class PhoneNumber implements Serializable {
    
    private String areaCode; 
    private String number; 
    private static final long serialVersionUID = 1001L; 
    private static BufferedReader keyboard = new BufferedReader(
            new InputStreamReader(System.in));

    public PhoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }
    
    public static PhoneNumber readNumber(){
        String area = null; 
        String localcode = null; 
        try {
            System.out.println("Enter area code: ");
            area = keyboard.readLine().trim(); 
            System.out.println("Enter local code. ");
            localcode = keyboard.readLine().trim(); 
            System.out.println("Enter the number: ");
            localcode += " " + keyboard.readLine().trim(); 
            
        } catch (IOException e) {
            System.err.println("Error reading a phone number");
            e.printStackTrace();
            System.exit(1);
        }
        return new PhoneNumber(area, localcode); 
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "areaCode=" + areaCode + ", number=" + number + '}';
    }
    
    
}
