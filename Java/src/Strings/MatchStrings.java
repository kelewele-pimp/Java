/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author desmond
 */
public class MatchStrings {

    public static void main(String[] args) {

        String string1 = "Too many ";
        String string2 = "cooks";
        String string3 = "Too many cooks";

        string1 += string2;

        System.out.println("Test 1");
        System.out.println("String1 is now: " + string1);
        System.out.println("String3 is now: " + string3);

        if (string1 == string3) {
            System.out.println("string1 == string3 is true. "
                    + "string1 and string3 point to the same string");
        } else {
            System.out.println("string1 and string3 don't point to the same string."
                    + "string1 == string3 is false");
        }

        string3 = string1;

        System.out.println("\n\nTest 2");

        System.out.println("String1 is now: " + string1);
        System.out.println("String3 is now: " + string3);

        if (string1 == string3) {
            System.out.println("string1 == string3 is true. "
                    + "string1 and string3 point to the same string");
        } else {
            System.out.println("string1 and string3 don't point to the same string."
                    + "string1 == string3 is false");
        }
    }
}
