package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import Model.damager;
import Model.entity;

public class windowElements extends JPanel implements ActionListener
{
	ArrayList<entity> entities = new ArrayList<entity>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	private int X,Y;
	
	public windowElements(ArrayList<entity> entities,ArrayList<JButton> buttons,int X,int Y)
	{
		this.entities=entities;
		this.buttons=buttons;
		this.X=X;
		this.Y=Y;
		setFocusable(true);	
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		this.setBackground(Color.black);
		this.setLayout(null);
		for (int i = 0; i < entities.size(); i++)
		{
			entity tempPlayer = entities.get(i);
			tempPlayer.draw(g2d);
		}
		
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
			tempButton.addActionListener(this);
			this.add(tempButton);
		}
	}

public void actionPerformed(ActionEvent arg0)
	{
	 	entities.clear();
		if(arg0.getSource() == buttons.get(0))
		{
		 entities.add(new damager(X/2,Y/2));
		}
		repaint();
	}
}

