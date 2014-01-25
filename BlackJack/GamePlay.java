/**
 *	GamePlay class for the BlackJack game. 
 *	@author Zachary Donato 
 *	Date: 1.24.14
 *	Revisions: 
 *	
*/ 

import java.util.ArrayList; 
import java.util.Scanner;

public class GamePlay{ 
	// Initialize variables. 
	private static ArrayList<Player> players = new ArrayList<Player>(); 
	private static int numPlayers = 2; 
	private static int[] scores = new int[numPlayers]; 
	private static String[] names = new String[numPlayers];
	private static byte playerCount = 0; 
	
	/**
	 * 
	 * @param p An ArrayList containing the players of the game. 
	 * @return The name of the winning player.
	 */
	public static void getWinner(ArrayList<Player> p){
		// Add the scores of each player to the scores array. 
		for (int i = 0; i < p.size(); i++){
			// If the player has busted, skip over them and DO NOT add their score. 
			if (p.get(i).hasBusted()){
				continue; 
			} else { // Add the score of the player if they have NOT busted. 
				scores[i] = p.get(i).playerHand.getHandScore();
				names[i] = p.get(i).getNameOfPlayer(); 
			}
		}
		// Set the initial max score to the value at the first index. 
		int maxScore = scores[0]; 
		// Max variable to hold the index of the greatest score. Initially 0. 
		int maxIndex = 0;  
		for (int j = 0; j < scores.length; j++){
			if (scores[j] > maxScore){
				// If the score is greater than the current max, replace the max with the new index. 
				maxIndex = j; 
			}
		}
		// Print the name of the player with the highest score. 
		System.out.println("The winner of the game is " + names[maxIndex] + ". Congratulations!"); 
	} // End getWinner.
	
	/**
	 * Method to add 1-5 players to the game. 
	 */
	private static void addPlayers(){
		System.out.println("Welcome to the game. How many players will there be? (1-5)"); 
		Scanner scan = new Scanner(System.in);
		// Find the number of players. Parse as int from String.
		numPlayers = Integer.parseInt(scan.next()); 
		if (numPlayers == 0){
			return; 
		} else {
			while(playerCount != numPlayers){
				System.out.println("What is the name of the player?");
				// Get the name of the player. Then create each one. 
				String play = scan.next(); 
				if ("0".equals(play)){
					break; 
				} else {
					Player player = new Player(play); 
					players.add(player); 
					playerCount ++; 
				} // End else. 
			} // End while. 
		} // End else. 
	} // End addPlayers. 
	
	/**
	 * Method that will run hitOrStay on each player in the players ArrayList. 
	 * @param al An ArrayList of players to loop through. 
	 */
	private static void runGame(ArrayList<Player> al){
		// Loop through the players and run hitOrStay on each. 
		for (Player p: players){
			p.hitOrStay(); 
		}
	}
	
	// Main method that will runs the game. 
	public static void main(String[] args){
		 addPlayers(); 
		 System.out.println(); 
		 System.out.println("Moving to the game... ");
		 runGame(players); 
		 System.out.println("Calculating the winner... "); 
		 getWinner(players); 
	}
}