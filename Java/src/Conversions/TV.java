/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversions;
import static java.lang.Math.*;

/**
 *
 * @author desmond
 */
public class TV implements RemoteControl {
    
    private String make = null; 
    private int screenSize = 0; 
    private boolean power = false;
    
    private final int MIN_VOLUME = 0; 
    private final int MAX_VOLUME = 100; 
    private int volume = MIN_VOLUME; 
    
    private final int MIN_CHANNEL = 0; 
    private final int MAX_CHANNEL = 999; 
    private int channel = MIN_CHANNEL;
    
    
    public TV(String make, int screenSize){
        this.make = make; 
        this.screenSize = screenSize; 
    }

    @Override
    public boolean powerOnOff() {
        power = !power; 
        System.out.println(make +  " " + screenSize + " inch TV power" 
                + (power ? "on." : "off."));
        return power; 
    }

    @Override
    public int volumeUp(int increment) {
        if(!power){                             //if the power is off
            return 0;                           //nothing works
        }
        
        //set volume - must not be greater than the maximum
        volume += increment;
        volume = min(volume, MAX_VOLUME);
        System.out.println(make + " " + screenSize + " inch TV volume level: "
                + volume);
        return volume; 
    }

    @Override
    public int volumeDown(int decrement) {
        if(!power){
            return 0; 
        }
        
        volume -= decrement; 
        volume = max(volume, MIN_VOLUME);
        System.out.println(make + " " + screenSize + " inch TV volume level: "
                + volume);
        return volume; 
    }

    @Override
    public void mute() {
        if(!power){
            return; 
        }
        
        volume = MIN_VOLUME; 
        System.out.println(make + " " + screenSize + " inch TV volume level: "
                + volume);
    }

    @Override
    public int setChannel(int newChannel) {
       if(!power){
           return 0; 
       }
       
       //Channel must be from MIN_CHANNEL to MAX_CHANNEL
       if(newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL){
           channel = newChannel;
       }
       
        System.out.println(make + " " + screenSize + " inch TV tuned tp channel: "
                + channel);
        
        return channel; 
    }

    @Override
    public int channelUp() {
        if(!power){
            return 0; 
        }
        
        //Wrap channel up to MIN_CHANNEL when the MAX_CHANNEL is reached 
        if(channel < MAX_CHANNEL)
            ++channel; 
        else channel = MIN_CHANNEL;
        
        return channel; 
    }

    @Override
    public int channelDown() {
        if(!power){
            return 0; 
        }
        
        channel = channel > MIN_CHANNEL ? --channel : MAX_CHANNEL; 
        System.out.println(make + " " + screenSize + " inch TV tuned to channel: "
                + channel);
        
        return channel; 
    }
    
}
