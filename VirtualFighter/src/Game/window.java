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
		windowElements WE = new windowElements();
	    this.setTitle("test");
	    this.setSize(900,900);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.black);
	    container.setLayout(new BorderLayout());
	    container.add(WE, BorderLayout.CENTER);
		for (int i = 0; i < buttons.size(); i++)
		{
			JButton tempButton = buttons.get(i);
			container.add(tempButton, BorderLayout.SOUTH);
		}
	    this.setContentPane(container);
	    this.setVisible(true);   
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		 
	}


}
