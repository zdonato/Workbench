package main;

import java.util.Scanner.*; 
import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @author Zachary Donato
 * Window class to serve as the GUI. 
 * Date Created: 4.22.14 
 */

public class Window extends JFrame {
	
	private JLabel fileNameLabel, contentLabel; 
	private JPanel fileContentPanel; 
	private JTextField fileContentField, fileName; 
	private JButton save, close; 
	
	public Window(){
		
		setLayout(new GridBagLayout()); 
		GridBagConstraints g = new GridBagConstraints(); 
		Event e = new Event(); 
		
		fileNameLabel = new JLabel("File Name: "); 
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0; 
		g.gridy = 0; 
		add(fileNameLabel, g); 
		
		fileName = new JTextField(10);
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 1; 
		g.gridy = 0; 
		add(fileName, g); 
		
		contentLabel = new JLabel("Contents: ");
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0; 
		g.gridy = 1; 
		add(contentLabel, g); 
		
		//fileContentPanel = new JPanel(); 
		//fileContentPanel.setLayout(new FlowLayout()); 
		fileContentField = new JTextField(20); 
		fileContentField.setPreferredSize(new Dimension(20,20)); 
		//fileContentPanel.add(fileContentField); 
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 1; 
		g.gridy = 1;
		add(fileContentField, g); 
		
		save = new JButton("Save"); 
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0; 
		g.gridy = 2; 
		add(save, g);
		
		close = new JButton("Close");
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 1;
		g.gridy = 2;
		add(close, g);
		
	}
	
	public class Event implements ActionListener{
		// Find a way to close when button press.
		public void actionPerformed(ActionEvent e){
			
		}
	}
	
	
	public static void main(String[] args){
		
		Window GUI = new Window(); 
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		GUI.setVisible(true); 
		GUI.setSize(400, 400); 
		GUI.setTitle("File Reader"); 
	}
}
