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
public class CardDeck {
    
    private Stack<Card> deck = new Stack<>(); 
    
    //Create a deck of 52 cards
    public CardDeck(){
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.push(new Card(rank, suit)); 
            }
        }
    }
    
    //Deal a hand
    public Hand dealHand(int numCards){
        if(deck.size() < numCards){
            System.err.println("Not enough cards left on the deck!");
            System.exit(1);
        }
        
        Hand hand = new Hand();
        for (int i = 0; i < numCards; i++) {
            hand.add(deck.pop());
        }
        return hand; 
    }
    
    //Shufle the deck
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
