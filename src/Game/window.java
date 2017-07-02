package Game;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import View.windowElements;

public class window extends JFrame{
	
	private JPanel container = new JPanel();

	public void window(ArrayList<JButton> buttons) 
	{
		int X=900,Y=900;
		windowElements WE = new windowElements();
	    this.setTitle("test");
	    this.setSize(X,Y);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    container.setBackground(Color.black);
	    container.setLayout(null);
	    container.add(WE);
		for (int i = 0; i < buttons.size(); i++)
		{
			JButton tempButton = buttons.get(i);
			if (i<3)
				{
				tempButton.setBounds((X/3)*i,Y-80,X/3,50);
				}
			else
				{
				tempButton.setBounds((X/3)*(i-3),Y-130,X/3,50);
				}
			container.add(tempButton);
		}
	    this.setContentPane(container);
	    this.setVisible(true);   
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		 
	}


}
