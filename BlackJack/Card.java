// Developer: Zachary Donato 
// Date Created: 1.21.13
// Revisions: 
//     Date				Reason
//   
// 

import java.util.Random; 

public class Card{
	private String suit, name; 
	private int value, rawCardValue; 
	private Random generator = new Random(); 
	
	// Constructor. 
	public Card(){
		this.rawCardValue = generator.nextInt(53); 
		this.value = setValue(rawCardValue % 13);
		this.name = setName(rawCardValue % 13); 
		this.suit = setSuit(value); 
	}
	
	// Method to get the name of the card. 
	public String getName(){
		return name; 
	}
	
	// Method to get the value of the card. 
	public int getValue(){
		return value; 
	}
	
	// Method to get the suit of the card. 
	public String getSuit(){
		return suit; 
	}
	
	// Private Method for testing to get the rawCardValue. 
	private int getRawCardValue(){
		return rawCardValue; 
	}
	
	// Private method for getting the correct value of a card. Expects modulus operation to have been applied.  
	private int setValue(int rv){ 
		if (rv >= 10 || rv == 0){
			return 10;
		} else if ( rv == 1 ){
			return 11; 
		} else {
			return rv; 
		}
	}
	
	// Private method that determines the Name of the card. 
	private String setName(int v){
		// Gives the name of the card based on its number after having the modulus operation applied. 
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
