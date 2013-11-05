/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Cards;

import java.util.*;

/**
 *
 * @author desmond
 */
public class Hand {
    
    private Vector<Card> hand = new Vector<>(); 

    //Add a card to the hand
    public void add(Card card){
        hand.add(card);
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder(); 
        boolean first = true; 
        for (Card card : hand) {
            if(first){
                first = false; 
            } else {
                str.append(", "); 
            }
            str.append(card); 
        }
        return str.toString(); 
    }
    
    public Hand sort(){
        Collections.sort(hand);
        return this; 
    }
}
