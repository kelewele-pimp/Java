/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTest;

/**
 *
 * @author Desmond
 */
public class Man {
    
    private String lastname; 
    private String firstname; 
    private Time time_to_work;
    
    //Blocco di codice per iniziallizzare più istanze
    {
        lastname = "";
        firstname = ""; 
    }
    
    public Man(String lastname, String firstname, Time time_to_work){
        this.lastname = lastname; 
        this.firstname = firstname; 
        this.time_to_work = time_to_work;
    }
    
    public String toString(){
        return lastname + " " + firstname + " works at: " + time_to_work.getTime();
    }
}
