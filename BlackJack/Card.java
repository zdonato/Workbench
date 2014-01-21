// Developer: Zachary Donato 
// Date Created: 1.21.13
// Revisions: 
//     Date				Reason
//   
// 

import java.util.Random; 

public class Card{
	// Initialize variables. 
	private String suit, name; 
	private int value, rawCardValue; 
	private Random generator = new Random(); 
	
	// Constructor. 
	public Card(){
		this.rawCardValue = generator.nextInt(53); 
		this.value = setValue(rawCardValue % 13);
		this.name = setName(rawCardValue % 13); 
		this.suit = setSuit(value); 
	} // End Constructor.
	
	// Method to get the name of the card. 
	public String getName(){
		return name; 
	} // End getName.
	
	// Method to get the value of the card. 
	public int getValue(){
		return value; 
	} // End getValue. 
	
	// Method to get the suit of the card. 
	public String getSuit(){
		return suit; 
	} // End getSuit. 
	
	// Private Method for testing to get the rawCardValue. 
	private int getRawCardValue(){
		return rawCardValue; 
	} // End getRawCardValue. 
	
	// Private method for getting the correct value of a card. EXPECTS modulus operation to have been applied.  
	private int setValue(int v){ 
		// If the value % 13 of the card is 0 or above 10, it has a value of 10. 
		if (v >= 10 || v == 0){
			return 10;
		} else if ( v == 1 ){ // This is the Ace, value of 11. 
			return 11;  
		} else { // All other cards have the value of their number. 
			return v; 
		}
	} // End setValue. 
	
	// Private method that determines the Name of the card. 
	private String setName(int v){
		// EXPECTS v to have already had the modulus operation applied. 
		// Gives the name of the card based on its number.
		// Special cases for Jack, Queen, King, Ace. 
		if (v == 1){
			return "Ace";
		} else if (v == 11){
			return "Jack";
		} else if (v == 12){
			return "Queen"; 
		} else if (v == 0){
			return "King"; 
		} else {
			return String.valueOf(v); 
		}
	} // End setNameOf. 
	
	// Private method that determines the Suit of the card. 
	private String setSuit(int v){
		// EXPECTS v to have already had the modulus operation applied. 
		// Determines the suit based on the number of the card. 
		if (v <= 13){
			return "Hearts";
		} else if (v > 13 && v <= 26){
			return "Diamonds"; 
		} else if (v > 26 && v <= 39){
			return "Spades"; 
		} else { 
			return "Clubs"; 
		}
	} // End setSuitOf. 
	
	public static void main(String[] args){
		Card card1 = new Card(); 
		System.out.println(card1.getRawCardValue()); 
		System.out.println(card1.getValue()); 
		System.out.println(card1.getName());
		System.out.println(card1.getSuit());
		System.out.println("Your card is a " + card1.getName() + " of " + card1.getSuit());
		System.out.println("This card has a value of: " + card1.getValue());
	}
}
