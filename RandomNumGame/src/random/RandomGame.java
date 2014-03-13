package random;

// Imports.
import javax.swing.*;
import java.awt.Event.*;
import java.awt.Color.*;
import java.awt.*; 
import java.util.Random;


/**
 * A game in which the user tries to guess a random number.
 * @author Zachary Donato
 * Date: 3.12.14
 * Revisions: 
 */

public class RandomGame extends JFrame{
	// Initialize variables.
	private static final long serialVersionUID = 1L;
	private JLabel guessLabel, result, randomNum, title; 
	private JTextField guess; 
	private JButton submit; 
	
	// Constructor.
	
	public RandomGame(){
		// Set layout and declare variables.
		setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints(); 
		getContentPane().setBackground(Color.gray);
		
		// Set up the JLabels, textfield, and button.
		JLabel title = new JLabel("Welcome to the Random Number Game!"); 
		
		
		
	}
	
	
}