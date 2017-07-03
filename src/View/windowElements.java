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

import Model.*;


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
			else if(i==3)
				{
				tempButton.setBounds(X-150, 0, X/6, 50);
				}
			else
				{
				tempButton.setBounds((X/4)*(i-4),Y-130,X/4,50);
				}
			tempButton.addActionListener(this);
			this.add(tempButton);
		}
	}
	public void actionPerformed(ActionEvent arg0)
	{
	 	entities.clear();
		if(arg0.getSource() == buttons.get(4))
		{
		 entities.add(new fighter(X/2-68,Y/2-84));
		}
		if(arg0.getSource() == buttons.get(5))
		{
		 entities.add(new healer(X/2-108,Y/2-88));
		}
		if(arg0.getSource() == buttons.get(6))
		{
		 entities.add(new tank(X/2-85,Y/2-45));
		}
		if(arg0.getSource() == buttons.get(7))
		{
		 entities.add(new vampire(X/2-76,Y/2-84));
		}
		repaint();
	}
}

