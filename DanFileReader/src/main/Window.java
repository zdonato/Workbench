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
	private JTextField fileContentField; 
	private JButton save, close; 
	
	public Window(){
		
		setLayout(new GridBagLayout()); 
		GridBagConstraints g = new GridBagConstraints(); 
		
		fileNameLabel = new JLabel("File Name: "); 
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0; 
		g.gridy = 0; 
		add(fileNameLabel, g); 
		
		contentLabel = new JLabel("Contents: ");
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0; 
		g.gridy = 1; 
		add(contentLabel, g); 
		
		fileContentField = new JTextField(100); 
		fileContentField.setPreferredSize(new Dimension(100,100)); 
		g.fill = GridBagConstraints.HORIZONTAL; 
		g.gridx = 0; 
		g.gridy = 2;
		add(fileContentField, g); 
	}
	
	public static void main(String[] args){
		
		Window GUI = new Window(); 
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		GUI.setVisible(true); 
		GUI.setSize(400, 400); 
		GUI.setTitle("File Reader"); 
	}
}
