/**
 *  Hand for the Player in the BlackJack game. 
 *  @author Zachary Donato
 *  Date: 1.24.13
 *  Revisions: 
 *
*/

import java.util.ArrayList;

public class Hand{
	// Initialize variables. 
	private ArrayList<Card> hand = new ArrayList<Card>(); 
	private byte handScore, hs; 
	
	// Constructor. 
	public Hand(){
		// Create 2 cards to start off the hand with. 
		Card card1 = new Card(); 
		Card card2 = new Card(); 
		// Add the two cards to the hand ArrayList.
		hand.add(card1); 
		hand.add(card2);
		handScore = setScore(); 
	} // End Constructor. 
	
	/**
	 * Method for adding a card to the hand ArrayList. Updates the handScore as well. 
	 * @param nc The new Card to be added. 
	 */
	public void addCard(Card nc){
		hand.add(nc); 
		handScore = setScore(); 
	} 
	
	/** 
	 * Returns the value of the card at the given index. 
	 * @param index The index of the desired card. 
	 * @return The value of the card at index index. 
	 */
	public int getValueOfCard(int index){
		return hand.get(index).getValue();  
	} 
	
	/**
	 * Displays all the cards in the hand with their name and suit. 
	 */
	public void displayHand(){
		for (Card c : hand){
			if (hand.indexOf(c) == (hand.size()-1)){
				System.out.print(c.getName() + " of " + c.getSuit()); 
			} else { 
				System.out.print(c.getName() + " of " + c.getSuit() + ", ");
			}
		}
		System.out.println(); 
	} 
	
	/**
	 * Returns the score of the hand. 
	 * @return The score of the hand. 
	 */
	public int getHandScore(){
		return handScore; 
	}
	
	/**
	 * Returns the size of the hand. 
	 * @return The size of hand. 
	 */
	public int getHandSize(){
		return hand.size(); 
	}
	
	/**
	 * Determines the score of the hand by adding all the values of the cards. 
	 * @return The score of the hand. 
	 */
	private byte setScore(){ 
		hs = 0; 
		for (Card c : hand){
			hs += c.getValue(); 
		}
		return hs; 
	} 
	
	public static void main(String[] args){
		Hand hand1 = new Hand(); 
		hand1.displayHand(); 
		System.out.println("Score: " + hand1.getHandScore()); 
		hand1.addCard(new Card()); 
		hand1.displayHand(); 
		System.out.println("Score: " + hand1.getHandScore()); 
	}
	
}