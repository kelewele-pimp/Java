/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Cards;

/**
 *
 * @author desmond
 */
public class TryDeal {
    
    public static void main(String[] args) {
        CardDeck deck = new CardDeck(); 
        deck.shuffle();
        
        Hand myHand = deck.dealHand(5).sort(); 
        Hand yourHand = deck.dealHand(5).sort(); 
        
        System.out.println("\nMy hand is: \n" + myHand);
        System.out.println("\nYour hand is: \n" + yourHand);
    }
}
