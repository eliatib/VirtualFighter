package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.*;
import View.windowElements;

public class window extends JFrame{
	
	ArrayList<entity> entities = new ArrayList<entity>();
	int X=900,Y=900;

	
	public void window(ArrayList<JButton> buttons) 
	{
		windowElements WE = new windowElements(entities,buttons,X,Y);
	    this.setTitle("test");
	    this.setSize(X,Y);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.setContentPane(WE);
	    this.setVisible(true);   
	}
	
}
