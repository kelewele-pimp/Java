/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author desmond
 */
public class SequenceString {

    public static void main(String[] args) {

        String string1 = "A";
        String string2 = "To";
        String string3 = "Z";

        String stringout1 = "\"" + string1 + "\"";
        String stringout2 = "\"" + string2 + "\"";
        String stringout3 = "\"" + string3 + "\"";

        //compare string1 with string3
        int result = string1.compareTo(string3);
        if (result < 0) {
            System.out.println(stringout1 + " is less than " + stringout3);
        } else if (result > 0) {
            System.out.println(stringout1 + " is greater than " + stringout3);
        } else {
            System.out.println(stringout1 + " is equal to " + stringout3);
        }
        
        //compare string2 with string1
        result = string2.compareTo(string1);
        if(result < 0){
            System.out.println(stringout2 + " is less than " + stringout1);
        } else if(result > 0){
            System.out.println(stringout2 + " is greater than " + stringout1);
        } else {
            System.out.println(stringout2 + " is equal to " + stringout1);
        }
    }
}
