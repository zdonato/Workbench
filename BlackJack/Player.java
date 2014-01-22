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
	private boolean busted = false;
	private String name; 
	
	// Constructor.
	public Player(String n){
		playerHand = new Hand(); 
		name = n; 
	} // End Constructor. 
	
	// Method to get the cards in the hand. 
	public void getHand(){
		playerHand.displayHand(); 
	} // End getHand. 
	
	// Method hitOrStay. While loop execute until card count > 5, busted = true, or Player decides to stay. 
	public void hitOrStay(){
		while(busted == false && playerHand.getHandSize() <= 5){
			Scanner scan = new Scanner(System.in); 
			getHand(); 
			System.out.println("Your score:  " + playerHand.getHandScore()); 
			System.out.println("Do you choose to hit or stay? "); 
			String move = scan.next(); 
			if ("hit".equals(move) || "Hit".equals(move) || "h".equals(move)){
				Card newCard = new Card(); 
				System.out.println("You're dealt a " + newCard.getValue() + " of " + newCard.getSuit());
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
		}
	}
	
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
		zach.hitOrStay(); 
	}
	
	
}