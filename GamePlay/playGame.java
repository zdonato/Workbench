import java.util.Random; 
import java.util.TreeMap;
import java.util.Scanner; 

public class playGame {
	private static TreeMap<String, String> food = new TreeMap<String, String>();
	static boolean loopCheck = true; 
	static boolean playCheck = true;
	private static int dmg; 
	private static Random generator = new Random(); 
	
	public static void main(String[] args) {
		// Add items to food to use for healing. 
		food.put("Lobster", "240"); 
		food.put("Shark", "500"); 
		food.put("Shrimp", "200"); 
		// Create two players. 
		Player Zach = new Player(1000, "Zach", 1000); 
		Player Liz = new Player(1000, "Liz", 1000);
		// Variables to keep tract of who deals and receives damage. 
		Player currPlayer = Zach; 
		Player other = Liz; 
		// While loop to create the textual interface of the game. 
		while (loopCheck){
			System.out.println(currPlayer.getName() + " it is your turn."); 
			Scanner scan = new Scanner(System.in); 
			System.out.println("Choose a move by typing an option from the list below: (Type 0 to quit)"); 
			System.out.println("Attack | Heal | Pass");
			String choice = scan.next(); 
			if ("Attack".equals(choice) || "attack".equals(choice)){
				dmg = generator.nextInt(currPlayer.getMaxDmg());
				System.out.println("You dealt " + dmg +" damage to " + other.getName() ); 
				other.dmgDealt(dmg); 
				System.out.println("Your current health is: " + currPlayer.getHealth()); 
				System.out.println(other.getName() + "'s current health is: " + other.getHealth()); 
				playCheck = true; 
			} else if ("Heal".equals(choice) || "heal".equals(choice)){
				System.out.println("Choose what to heal with: (Type 0 to quit)"); 
				System.out.println("Lobster | Shark | Shrimp"); 
				Scanner foodScan = new Scanner(System.in); 
				String foodChoice = foodScan.next(); 
				if ("0".equals(foodChoice)){
					loopCheck = false; 
				} else if (!food.containsKey(foodChoice)) {
					System.out.println("That food is not available. Choose again."); 
					playCheck = false; 
				} else {
					currPlayer.heal(foodChoice); 
					System.out.println(currPlayer.getHealth()); 
					playCheck = true; 
				}
			} else if ("0".equals(choice)){
				loopCheck = false; 
			} else if ("Pass".equals(choice) || "pass".equals(choice)){
				System.out.println("You choose to pass."); 
			} else {
				System.out.println("Invalid Command. Choose again."); 
				playCheck = false;
			}
			if (currPlayer.getHealth() < 0){
				System.out.println("Congratulations! " + other.getName() + " wins!");
				break;
			} else if (other.getHealth() < 0){
				System.out.println("Congratulations! " + currPlayer.getName() + " wins!"); 
				break; 
			}
			if (currPlayer.equals(Zach) && playCheck){
			currPlayer = Liz; 
			other = Zach; 
			} else if(currPlayer.equals(Liz) && playCheck){
				currPlayer = Zach; 
				other = Liz; 
			}
		}
	}
}