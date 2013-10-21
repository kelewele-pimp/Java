/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversions;

/**
 *
 * @author desmond
 */
public interface RemoteControl {
    boolean powerOnOff(); 
    int volumeUp(int increment);
    int volumeDown(int decrement); 
    void mute(); 
    int setChannel(int channel); 
    int channelUp(); 
    int channelDown(); 
}
