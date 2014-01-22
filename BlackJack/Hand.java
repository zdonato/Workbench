// Developer: Zachary Donato 
// Date Created: 1.21.14
// Revisions: 
//      Date              Reason
// 

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
	
	// Method to add a card to the hand. Will also update the handScore.
	public void addCard(Card nc){
		hand.add(nc); 
		handScore = setScore(); 
	} // End addCard. 
	
	// Method to get each individual card in the hand and its value. 
	public int getValueOfCard(int index){
		return hand.get(index).getValue();  
	} // End getValueOfCard. 
	
	// Method to display the hand. 
	public void displayHand(){
		for (Card c : hand){
			if (hand.indexOf(c) == (hand.size()-1)){
				System.out.print(c.getName() + " of " + c.getSuit()); 
			} else { 
				System.out.print(c.getName() + " of " + c.getSuit() + ", ");
			}
		}
		System.out.println(); 
	} // End displayHand. 
	
	// Method to print the value of the hand. 
	public byte getHandScore(){
		return handScore; 
	} // End getHandScore. 
	
	public int getHandSize(){
		return hand.size(); 
	}
	
	// Method to calculate the score of the hand. 
	private byte setScore(){ 
		hs = 0; 
		for (Card c : hand){
			hs += c.getValue(); 
		}
		return hs; 
	} // End setScore. 
	
	public static void main(String[] args){
		Hand hand1 = new Hand(); 
		hand1.displayHand(); 
		System.out.println("Score: " + hand1.getHandScore()); 
		hand1.addCard(new Card()); 
		hand1.displayHand(); 
		System.out.println("Score: " + hand1.getHandScore()); 
	}
	
}