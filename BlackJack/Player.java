/**
 * 	Player class to play the BlackJack game. 
 * 	@author Zachary Donato 
 *  Date: 1.24.13
 *  Revisions: 
 *  
*/

import java.util.Scanner; 

public class Player{
	// Initialize variables. 
	protected Hand playerHand; 
	private String name; 
	
	// Constructor.
	public Player(String n){
		playerHand = new Hand(); 
		this.name = n; 
	} // End Constructor. 
	
	/** 
	 * Displays the cards in each hand by calling the displayHand method in the Hand class. 
	 */
	public void getHand(){
		playerHand.displayHand(); 
	}
	
	/**
	 * Returns the name of the player. 
	 * @return The name of the player. 
	 */
	public String getNameOfPlayer(){
		return name; 
	} 
	
	/** 
	 * Function to ask the user if they want to hit (add a new card) or stay (end the hand with their current score.) While loop executes
	 * as long as the size of the hand is less than 5, the maximum amount of cards allowed. Immediately prints out BlackJack if the player
	 * has BlackJack. 
	 */
	public void hitOrStay(){
		// Check if the player has Blackjack on the first time through. If not, proceed to the while loop for hitting or staying. 
		if (hasBlackJack()){
			System.out.print(getNameOfPlayer() + "'s hand: "); 
			getHand(); 
			System.out.println("Congratulations. BlackJack!"); 
		} else {
			while(playerHand.getHandSize() <= 5){
				Scanner scan = new Scanner(System.in); 
				System.out.print(getNameOfPlayer() + "'s hand: "); 
				getHand(); 
				System.out.println("Your score:  " + playerHand.getHandScore()); 
				System.out.println("Do you choose to hit or stay? "); 
				String move = scan.next(); 
				if ("hit".equals(move) || "Hit".equals(move) || "h".equals(move)){
					Card newCard = new Card(); 
					System.out.println("You're dealt a " + newCard.getName() + " of " + newCard.getSuit());
					System.out.println(); 
					playerHand.addCard(newCard); 
				} else if ("stay".equals(move) || "Stay".equals(move) || "s".equals(move)){
					System.out.println("You chose to stay. Your final score is: " + playerHand.getHandScore()); 
					System.out.println(); 
					break; 
				} else if ("0".equals(move)){
					break; 
				} else { 
					System.out.println("Invalid command. Choose again.");
				}
				
				if (hasBusted()){
					System.out.println("Sorry you busted. Your score was " + playerHand.getHandScore() +"."); 
					System.out.println(); 
					break; 
				}
			} // End while. 
		} // End else. 
	} // End hitOrStay. 
	
	/**
	 * Method to check if the player has BlackJack. Only applies to the first two cards dealt. 
	 * @return True if the player has BlackJack, false otherwise. 
	 */ 
	protected boolean hasBlackJack(){
		if ((playerHand.getValueOfCard(0) == 10 && playerHand.getValueOfCard(1) == 11) || (playerHand.getValueOfCard(0) == 11 && playerHand.getValueOfCard(1) == 10)){
			return true; 
		} else {
			return false; 
		}
	} 
	
	/**
	 * Checks if the player has busted (their score is over 21). 
	 * @return True if the player has busted; false otherwise. 
	 */
	protected boolean hasBusted(){
		if (playerHand.getHandScore() > 21){
			return true; 
		} else {
			return false; 
		}
	} 
	
	public static void main(String[] args){
		Player zach = new Player("Zach"); 
		Player liz = new Player("Liz"); 
		zach.hitOrStay();
		System.out.println(" ");  
		liz.hitOrStay(); 
		System.out.println(" "); 
	}
}