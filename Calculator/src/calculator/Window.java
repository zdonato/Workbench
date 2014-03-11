package calculator; 

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Window class to contain the GUI for the calculator.
 * @author Zachary Donato
 * Date: 3.10.14
 * Revisions: 
 */

public class Window extends JFrame{
	// Initialize data members. 
	private static final long serialVersionUID = 1L;
	private JLabel root1, root2; 
	private JButton submit;
	private JTextField a, b, c; 
	private Calculator calc = new Calculator(); 
	
	// Set up the constructor for the window. 
	public Window(){
		setLayout(new FlowLayout()); 
		
		// Add text fields for the coefficients.
		a = new JTextField("a", 15); 
		b = new JTextField("b", 15); 
		c = new JTextField("c", 15); 
		add(a); 
		add(b); 
		add(c);
		
		// Add the submit button.
		submit = new JButton("Submit");
		add(submit); 
		
		// Add the labels for roots but keep them empty for now. 
		root1 = new JLabel(""); 
		root2 = new JLabel(""); 
		add(root1); 
		add(root2);
		
		// Create an event to listen for submit click. 
		Event e = new Event(); 
		submit.addActionListener(e); 
	}
	
	public class Event implements ActionListener {
		
		// Calculate the roots when submit is pressed.
		public void actionPerformed(ActionEvent e){
			root1.setText(calc.getRoot1(Double.parseDouble(a.getText()), Double.parseDouble(a.getText()), Double.parseDouble(a.getText())));
		}
		
	}

	
	public static void main(String args[]){
		Window window = new Window(); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setSize(300, 300); 
		window.setTitle("Quadratic Root Finder"); 
	}
	
}
