import java.util.Random; 
import java.util.TreeMap; 

public class Attacker{
	private double maxDmg; 
	private String name; 
	private double health; 
	private static TreeMap<String, String> food = new TreeMap<String, String>(); 
	food.put("Lobster", "240"); 
	food.put("Shark", "400"); 
			
	public Attacker(double md, String n, double h){
		this.maxDmg = md;  
		this.name = n; 
		this.health = h; 
	}
	
	public void dmgDealt(double dmg){
		health -= dmg; 
	}
	
	public void heal(String foodName){
		String f = food.get(foodName); 
		double n = Double.parseDouble(f); 
		health += n; 
	}
	
	public void getHealth(){
		System.out.println(health);  
	}
	
	public static void main(String[] args){
		Attacker Zach = new Attacker(200, "Zach", 1000); 
		Zach.dmgDealt(400); 
		Zach.getHealth(); 
		Zach.heal("Lobster"); 
		Zach.getHealth(); 
	}
}