/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversions;

import static java.lang.Math.random;

/**
 *
 * @author desmond
 */
public class TryRemoteControl {
    
    public static void main(String[] args) {
        RemoteControl remote = null; 
        
        for(int i = 0; i < 10; ++i){
            //Create either a TV or DVD player at random
            if(random() < 0.5){
                //Random choice of TV or DVD player/Recorder at random
                remote = new TV(random() < 0.5 ? "Sony" : "Hitachi",
                        random() < 0.5 ? 46 : 40);
            } else {
                remote = new DVDPlayer(random() < 0.5 ? "Panasonic" : "JVC"); 
            }
            
            //Now operate it, whatever it is; 
            remote.powerOnOff();
            remote.channelUp();
            remote.volumeUp(5 * i);
        }
    }
    
}
