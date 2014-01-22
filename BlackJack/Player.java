// Developer: Zachary Donato 
// Date Created: 1.21.13
// Revisions: 
//     Date				Reason
//   
// 

import java.util.Scanner; 

public class Player{
	// Initialize variables. 
	private Hand playerHand; 
	private String name; 
	
	// Constructor.
	public Player(String n){
		playerHand = new Hand(); 
		this.name = n; 
	} // End Constructor. 
	
	// Method to get the cards in the hand. 
	public void getHand(){
		playerHand.displayHand(); 
	} // End getHand. 
	
	// Method to get the name of the Player. 
	public String getNameOfPlayer(){
		return name; 
	} // End getNameofPlayer. 
	
	// Method hitOrStay. While loop execute until card count > 5, busted = true, or Player decides to stay. 
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
					System.out.println("You're dealt a " + newCard.getValue() + " of " + newCard.getSuit());
					System.out.println(); 
					playerHand.addCard(newCard); 
				} else if ("stay".equals(move) || "Stay".equals(move) || "s".equals(move)){
					System.out.println("You chose to stay. Your final score is: " + playerHand.getHandScore()); 
					break; 
				} else { 
					System.out.println("Invalid command. Choose again.");
				}
				
				if (hasBusted()){
					System.out.println("Sorry you busted. Your score was " + playerHand.getHandScore() +"."); 
					break; 
				}
			} // End while. 
		} // End else. 
	} // End hitOrStay. 
	
	// Private method to check if the player has blackJack. Only applies to the initial hand. 
	private boolean hasBlackJack(){
		if (playerHand.getValueOfCard(0) == 10 && playerHand.getValueOfCard(1) == 11){
			return true; 
		} else if (playerHand.getValueOfCard(0) == 11 && playerHand.getValueOfCard(1) == 10){
			return true; 
		} else {
			return false; 
		}
	} // End hasBlackJack.
	
	// Private method to check if the hand score is over 21.
	private boolean hasBusted(){
		if (playerHand.getHandScore() > 21){
			return true; 
		} else {
			return false; 
		}
	} // End hasBusted. 
	
	public static void main(String[] args){
		Player zach = new Player("Zach"); 
		Player liz = new Player("Liz"); 
		zach.hitOrStay();
		System.out.println(" ");  
		liz.hitOrStay(); 
		System.out.println(" "); 
	}
}