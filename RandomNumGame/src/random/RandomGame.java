package random;

// Imports.
import java.awt.Event.*;
import java.awt.Color.*; 
import java.util.Random;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


/**
 * A game in which the user tries to guess a random number.
 * @author Zachary Donato
 * Date: 3.12.14
 * Revisions: 
 */

public class RandomGame extends JFrame{
	// Initialize variables.
	private static final long serialVersionUID = 1L;
	private JLabel guessLabel, randomNum, randomLabel, title, result; 
	private JTextField guess; 
	private JButton submit; 
	
	// Constructor.
	
	public RandomGame(){
		// Set layout and declare variables.
		setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints(); 
		getContentPane().setBackground(Color.gray);
		Event e = new Event();
		
		// Set up the JLabels, textfield, and button.
		title = new JLabel("Welcome to the Random Number Game!"); 
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0; 
		g.gridy = 0;
		add(title, g); 
		
		guessLabel = new JLabel("Guess: ");
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0;
		g.gridy = 1;
		add(guessLabel,g);
		
		guess = new JTextField(10); 
		g.fill = GridBagConstraints.HORIZONTAL;
		g.gridx = 1;
		g.gridy = 1;
		add(guess, g);
		
		guess.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent fe){
				guess.selectAll();
			}
			
			public void focusLost(FocusEvent arg0){
				
			}
		});
		
		randomLabel = new JLabel("Random: ");
		g.fill = GridBagConstraints.HORIZONTAL;
		g.gridx = 0; 
		g.gridy = 2;
		add(randomLabel, g);
		
		randomNum = new JLabel(""); 
		g.fill = GridBagConstraints.HORIZONTAL;
		g.gridx = 1; 
		g.gridy = 2; 
		add(randomNum, g);
		
		submit = new JButton("Submit"); 
		g.gridx = 0;
		g.gridy = 3;
		add(submit, g);
		
		result = new JLabel("");
		g.fill = GridBagConstraints.HORIZONTAL;
		g.gridx = 0;
		g.gridy = 4;
		add(result, g);
		
		submit.addActionListener(e);
		
	}
	
	public class Event implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			// Set up to generate the random number and check if the person won. 
		}
	}
	
	public static void main(String[] args){
		RandomGame window = new RandomGame(); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setSize(500, 300); 
		window.setTitle("Random Number Game!");
		
	}
}