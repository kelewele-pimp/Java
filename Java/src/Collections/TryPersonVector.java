
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.io.*;
import java.util.ListIterator;
import java.util.Vector;
import javax.swing.plaf.basic.BasicSplitPaneUI;

/**
 *
 * @author desmond
 */
public class TryPersonVector {
    
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        
        Person aPerson = null; 
        Vector<Person>  filmCast = new Vector<>(); 
        while(true){
            aPerson = readPerson(); 
            if(aPerson == null){
                break; 
            }
            filmCast.add(aPerson);
        }
        
        int count = filmCast.size(); 
        System.out.println("You added " + count +  (count == 1 ?  " person" : " people") 
                + " to the cast");
        
        //Show who is in the cast using an iterator
        ListIterator<Person> iterlist = filmCast.listIterator(); 
        while(iterlist.hasNext()){
            Person name = iterlist.next(); 
            System.out.println(name);
        }
        System.out.println("\nTHe vector currently has rrom for " + 
                (filmCast.capacity() - count) + " more people");
    }
    
    private static Person readPerson(){
        
        //Read first name and remove blanks front and back 
        String firstname = null; 
        String lastname = null; 
        System.out.println("\nEnter firstname or ! to end");
        
        try{
          
            firstname = keyboard.readLine().trim(); 
            if(firstname.charAt(0) == '!'){
                return null; 
            }
            
            //Read the second name also trimming blanks
            System.out.println("Enter lastname: ");
            lastname = keyboard.readLine().trim(); 
            
        } catch(IOException e){
            System.err.println("Error reading a name.");
            e.printStackTrace();
            System.exit(1);
        }
        
        return new Person(firstname, lastname); 
    }
}
