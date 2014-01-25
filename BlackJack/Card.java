/** 
 * 	Card for the cards of the Hand in the BlackJack game. 
 *  @author Zachary Donato 
 *  Date: 1.24.14
 *  Revisions: 
 * 
*/

import java.util.Random; 

public class Card{
	// Initialize variables. 
	private String suit, name; 
	private int value, rawCardValue; 
	private Random generator = new Random(); 
	
	// Constructor. 
	public Card(){
		rawCardValue = generator.nextInt(52) + 1; 
		value = setValue(rawCardValue % 13);
		name = setName(rawCardValue % 13); 
		suit = setSuit(rawCardValue); 
	} // End Constructor.
	
	/**
	 * Returns the name of the card. 
	 * @return The name of the Card. 
	 */
	public String getName(){
		return name; 
	} 
	
	/** 
	 * Returns the value of the card. 
	 * @return The value of the card.
	 */ 
	public int getValue(){
		return value; 
	} 
	
	/**
	 * Returns the suit of the card. 
	 * @return The suit of the card. 
	 */
	public String getSuit(){
		return suit; 
	} 
	
	/** 
	 * Method for testing purposes. 
	 * @return The raw value of the card before the modulus operation. 
	 */
	private int getRawCardValue(){
		return rawCardValue; 
	} 
	
	/**
	 * Determines the value of the card. 
	 * @param v The value of the card AFTER the modulus operation. 
	 * @return The value of the card based on the modulus operation. 
	 */ 
	private int setValue(int v){ 
		// If the value % 13 of the card is 0 or above 10, it has a value of 10. 
		if (v == 0 || v >= 11){
			return 10;
		} else if ( v == 1 ){ // This is the Ace, value of 11. 
			return 11;  
		} else { // All other cards have the value of their number. 
			return v; 
		}
	}
	
	/**
	 * Determines the name of the card. 
	 * @param v The value of the card AFTER the modulus operation. 
	 * @return The name of the card. 
	 */
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
	} 
	
	/**
	 * Determines the suit of the card. 
	 * @param v The raw value of the card. 
	 * @return The suit of the card, based on its raw value. 
	 */
	private String setSuit(int v){
		// Expects inputted v to be the rawCardValue.
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
	} 

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
