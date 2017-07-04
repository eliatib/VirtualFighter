package Game;


import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import Model.*;
import View.*;

public class window extends JFrame{
	
	int X=900,Y=900;
	
	public void window(ArrayList<JButton> buttons,ArrayList<entity> entities) 
	{
		this.setTitle("VirtualFighter");
	    this.setSize(X,Y);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.setContentPane(new windowElements(entities,buttons,X,Y));
	    this.setVisible(true);   
	}
}
