/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Cards;

import Collections.Cards.Rank;

/**
 *
 * @author desmond
 */
public class Card implements Comparable<Card> {
    private final Suit suit;
    private final Rank rank;
    
    public Card(Rank rank, Suit suit){
        this.rank = rank; 
        this.suit = suit; 
    }
    
    @Override
    public String toString(){
        return rank + " of " + suit; 
    }

    @Override
    public int compareTo(Card card) {
       if(suit.equals(card.suit)){
           if(rank.equals(card.rank)){
               return 0;
           }
           return rank.compareTo(card.rank) < 0 ? -1 : 1; 
       } else {
           return suit.compareTo(card.suit) < 0 ? -1 : 1; 
       }
    }
}
