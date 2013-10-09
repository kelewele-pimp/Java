/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTest;

/**
 *
 * @author Desmond
 */
public enum OS {
    WINDOWS("XP"),
    LINUX("RedHat"),
    MAC("Jaguar");
    
    private final String title; 
    
    OS(String t){
        title = t; 
    }
    
    public String getTitle(){
        return title; 
    }
}

