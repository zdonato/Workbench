// Player class. 
import java.util.Random; 
import java.util.TreeMap; 
import java.util.Scanner; 

public class Player{
	// Initialize variables. 
	private int maxDmg; 
	private String name; 
	private int health; 
	private static TreeMap<String, String> food = new TreeMap<String, String>();
	
	// Constructor. 
	public Player(int md, String n, int h){
		this.maxDmg = md;  
		this.name = n; 
		this.health = h; 
	} // End Constructor. 
	
	// Method dmgDealt for receiving damage. 
	public void dmgDealt(int damage){
		health -= damage; 
	} // End dmgDealth. 
	
	// Method heal for healing the player. 
	public void heal(String foodName){
		String f = food.get(foodName); 
		int n = Integer.parseInt(f); 
		health = health + n; 
	} // End heal. 
	
	// Method getHealth to return the health of the player. 
	public double getHealth(){
		return health;  
	} // End getHealth. 
	
	// Method getName. 
	public String getName(){
		return name; 
	} // End getName.	
	
	// Method getMaxDmg.
	public int getMaxDmg(){
		return maxDmg; 
	} // End getMaxDmg. 
	
	public static void main(String[] args){
		food.put("Lobster", "240"); 
		food.put("Shark", "500"); 
		food.put("Shrimp", "100"); 
	}
}