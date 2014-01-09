// Player class. 
import java.util.Random; 
import java.util.TreeMap; 

public class Player{
	// Initialize variables. 
	private double maxDmg; 
	private String name; 
	private double health; 
	private static TreeMap<String, String> food = new TreeMap<String, String>();
	
	// Constructor. 
	public Player(double md, String n, double h){
		this.maxDmg = md;  
		this.name = n; 
		this.health = h; 
	} // End Constructor. 
	
	// Method dmgDealt for receiving damage. 
	public void dmgDealt(double dmg){
		health -= dmg; 
	} // End dmgDealth. 
	
	// Method heal for healing the player. 
	public void heal(String foodName){
		String f = food.get(foodName); 
		double n = Double.parseDouble(f); 
		health += n; 
	} // End heal. 
	
	// Method getHealth to return the health of the player. 
	public double getHealth(){
		return health;  
	} // End getHealth. 
	
	// Main method. 
	public static void main(String[] args){
		food.put("Lobster", "240"); 
		food.put("Shark", "500"); 
		Player Zach = new Player(200, "Zach", 1000); 
		Zach.dmgDealt(400); 
		System.out.println(Zach.getHealth()); 
		Zach.heal("Lobster"); 
		System.out.println(Zach.getHealth()); 
	}
}