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

	public Card(){
		rawCardValue = generator.nextInt(53); 
		this.value = rawCardValue % 13; 
		if (value == 1){
			this.name = "Ace";
		} else if (value == 11){
			this.name = "Jack";
		} else if (value == 12){
			this.name = "Queen"; 
		} else if (value == 0){
			this.name = "King"; 
		} 
		
	}
	public static void main(String[] args){
		System.out.println(52 % 13); 
	}
}
