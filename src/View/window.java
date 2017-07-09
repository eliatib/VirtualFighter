package View;


import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import Model.*;
import View.*;

public class window extends JFrame{
	
	int X=900,Y=900; //define the window size
	
	public void window(ArrayList<JButton> buttons,ArrayList<entity> entities,int menu) 
	{
		this.setTitle("VirtualFighter"); //define the window name
	    this.setSize(X,Y); //define the window size
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //define the window close type
	    this.setLocationRelativeTo(null);  //define the window spawn location
	    this.setResizable(false); //define that the window can't be resize
	    this.setContentPane(new windowElements(entities,buttons,X,Y,menu));  //define the window content
	    this.setVisible(true);   //set visible the window
	}
}
