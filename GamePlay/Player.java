// Player class. 
import java.util.Random; 
import java.util.TreeMap; 
import java.util.Scanner; 

public class Player{
	// Initialize variables. 
	private int maxDmg; 
	private String name; 
	private static int health; 
	private static TreeMap<String, String> food = new TreeMap<String, String>();
	private int dmg; 
	private Random generator = new Random();  
	
	// Constructor. 
	public Player(int md, String n, int h){
		this.maxDmg = md;  
		this.name = n; 
		this.health = h; 
	} // End Constructor. 
	
	// Method chooseMove for textual interface. 
	public void chooseMove(){
		Scanner scan = new Scanner(System.in); 
		System.out.println("Choose a move by typing an option from the list below: (Type 0 to quit)"); 
		System.out.println("Attack | Heal | Pass");
		String choice = scan.next(); 
		if ("Attack".equals(choice) || "attack".equals(choice)){
			dmg = generator.nextInt(maxDmg);
			dmgDealt(dmg); 
			System.out.println("Your current health is: " + getHealth()); 
		} else if ("Heal".equals(choice) || "heal".equals(choice)){
			System.out.println("Choose what to heal with: (Type 0 to quit)"); 
			System.out.println("Lobster | Shark | Shrimp"); 
			String foodChoice = scan.next(); 
			if ("0".equals(foodChoice)){
				health = 0; 
			} else {
				heal(foodChoice); 
				System.out.println(getHealth()); 
			}
		} else if ("0".equals(choice)){
			health = 0; 
		} else {
			System.out.println("Invalid Command. Choose again."); 
		}
	} // End chooseMove. 
	
	// Method dmgDealt for receiving damage. 
	public void dmgDealt(int damage){
		health -= damage; 
	} // End dmgDealth. 
	
	// Method heal for healing the player. 
	public void heal(String foodName){
		String f = food.get(foodName); 
		double n = Integer.parseInt(f); 
		health += n; 
	} // End heal. 
	
	// Method getHealth to return the health of the player. 
	public double getHealth(){
		return health;  
	} // End getHealth. 
	
	public String getName(){
		return name; 
	}
	
	// Main method. 
	public static void main(String[] args){
		food.put("Lobster", "240"); 
		food.put("Shark", "500"); 
		food.put("Shrimp", "100"); 
		Player Zach = new Player(100, "Zach", 1000); 
		Player Liz = new Player(100, "Liz", 1000); 
		Player currPlayer = Zach; 
		while (health > 0){
			currPlayer.chooseMove(); 
			if (currPlayer.getName().equals(Zach)){
				currPlayer = Liz; 
			} else {
				currPlayer = Zach; 
			}
		}
		
	}
}