/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;

/**
 *
 * @author desmond
 */
public class TryPhoneBook {

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        FormattedInput in = new FormattedInput();

        Person someone;
        while (true) {
            System.out.println("Enter  1 to enter a new phone book entry\n"
                    + "Enter 2 to find the number for a name\n"
                    + "Enter 9 to quit.");

            int what = 0;
            try {
                what = in.readInt();
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\nTry again.");
                continue;
            }

            switch (what) {
                case 1:
                    book.addEntry(BookEntry.readEntry());
                    break;
                case 2:
                    someone = Person.readPerson();
                    BookEntry entry = book.getEntry(someone);
                    if (entry == null) {
                        System.out.println("The number for " + someone + " "
                                + "was not found");
                    } else {
                        System.out.println("The number for " + someone + " "
                                + " is " + entry.getPhoneNumber());
                    }
                    break;
                case 9:
                    System.out.println("Ending program.... ");
                    return;
                default:
                    System.out.println("Invalid selection, try again.");
                    break;

            }
        }
    }
}
