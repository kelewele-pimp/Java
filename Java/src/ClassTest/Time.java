/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassTest;

/**
 *
 * @author Desmond
 */
public class Time {
    
    private int hour; 
    private int minutes; 
    private int seconds; 
    
    public Time(){
        setTime(0, 0, 0);
    }
    
    public Time(int hour){
        setTime(hour, 0, 0);
    }
    
    public Time(int hour, int second){
        setTime(hour, 0, seconds);
    }
    
    public Time(int hour, int second, int minute){
        setTime(hour, minute, second);
    }
    
    public void setTime(int hour, int minutes, int seconds){
        //Set hour
        if(hour < 24 && hour >= 0){
            this.hour = hour; 
        } else {
            this.hour = 0; 
        }
        //Set minUtes
        if(minutes < 60 && minutes >= 0){
            this.minutes = minutes; 
        } else {
            this.minutes = 0; 
        }
        //Set seconds 
        if(seconds < 60 && seconds >= 0){
            this.seconds = seconds; 
        } else {
            this.seconds = 0; 
        }
    }
    
    public String getTime(){
        return hour + ":" + minutes + ":" + seconds; 
    }
    
    @Override
    public String toString(){
        return "Current hour: " + getTime(); 
    }
}
