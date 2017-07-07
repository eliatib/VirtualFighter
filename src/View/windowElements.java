package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import Game.difficulty;
import Game.menuUsed;
import Game.stat;
import Model.*;


public class windowElements extends JPanel implements ActionListener
{
	ArrayList<entity> entities = new ArrayList<entity>();
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	private int X,Y,idEntity;
	private int menu,Action,Difficulty=1;
	difficulty D = new difficulty();
	String Dif = "ALEA",Result = "";
	menuUsed MU = new menuUsed();
	stat stat = new stat();
	JLabel background;
	
	public windowElements(ArrayList<entity> entities,ArrayList<JButton> buttons,int X,int Y,int menu)
	{
		this.setLayout(null);
		this.entities=entities;
		this.buttons=buttons;
		this.menu=menu;
		this.X=X;
		this.Y=Y;
		setFocusable(true);	
		
		if(entities.size()>1)
		{Dif="FIGHT";}
		
		for (int i = 0; i < buttons.size(); i++)
		{
			JButton tempButton = buttons.get(i);
			if (i<3)
				{
				tempButton.setBounds((X/3)*i,Y-80,X/3,50);
				if (menu==2 || menu==3 || menu==4)
					{
					tempButton.setBounds(X/2-175+(190*i),Y/2-25,150,50);
					}
				}
			else if(i==3)
				{
				tempButton.setBounds(X-150, 0, X/6, 50);
				}
			else if(i==8)
			{
			tempButton.setBounds(X-300, 0, X/6, 50);
			}
			else
				{
				tempButton.setBounds((X/4)*(i-4),Y-130,X/4,50);
				}
			tempButton.addActionListener(this);
			this.add(tempButton);
		}
		ImageIcon ic = new ImageIcon("image/FDB1.jpg");
		background = new JLabel(ic);
		background.setBounds(0, 0, 900, 900);
		this.add(background);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		for (int i = 0; i < entities.size(); i++)
		{
			entity tempPlayer = entities.get(i);
			if (i==0)
				{
				tempPlayer.draw(g2d);
				}
			else
				{
				tempPlayer.drawReverse(g2d);
				}
		}
		if (menu==2 || menu==3 || menu==4)
			{
			if (menu==2){Result = "YOU WIN";}
			if (menu==3){Result = "YOU LOSE";}
			if (menu==4){Result = "D R A W";}
			g.setColor(Color.WHITE);
			g.setFont(new Font("Monospaced",Font.BOLD,96));
			g.drawString(Result, 250, 350);
			}
		else
			{
			g.setColor(Color.WHITE);
			g.setFont(new Font("Monospaced",Font.BOLD,32));
			g.drawString(Dif, 400, 50);
			}
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource() == buttons.get(0))
		{
			if (menu==0)
			{
			Difficulty=1;
			Dif="ALEA";
			}
			if (menu==1)
			{
			Action=1;
			D.Fight(Difficulty, Action, entities);
			}
			if (menu==2)
			{
			System.exit(1);
			}
		}
		if(arg0.getSource() == buttons.get(1))
		{
			if (menu==0)
			{
			Difficulty=2;
			Dif="NORMAL";
			}
			if (menu==1)
			{
			Action=2;
			D.Fight(Difficulty, Action, entities);
			}
			if (menu==2 || menu==3)
			{
			SwingUtilities.windowForComponent(this).dispose();
			MU.menuChoice();
			}
		}
		if (menu<2)
		{
			if(arg0.getSource() == buttons.get(2))
			{
				if (menu==0)
				{
				Difficulty=3;
				Dif="HARD";
				}
				if (menu==1)
				{
				Action=3;
				D.Fight(Difficulty, Action, entities);
				}
			}
			
			if (menu==0){
				if(arg0.getSource() == buttons.get(3))
					{ 
					if (idEntity!=0)
					{
						SwingUtilities.windowForComponent(this).dispose();
						menu=1;
						MU.menuFight(idEntity);
						MU.getIdChoiceAI();
						Dif="FIGHT";
						}
					}
				if(arg0.getSource() == buttons.get(4))
					{
					entities.clear();
			 		entities.add(new fighter(X/2-68,Y/2-84,1,3,3,2));
			 		idEntity=1;
					}
				if(arg0.getSource() == buttons.get(5))
					{
					entities.clear();
			 		entities.add(new healer(X/2-108,Y/2-88,2,4,4,1));
			 		idEntity=2;
					}
				if(arg0.getSource() == buttons.get(6))
					{
					entities.clear();
			 		entities.add(new tank(X/2-85,Y/2-45,3,5,5,1));
			 		idEntity=3;
					}
				if(arg0.getSource() == buttons.get(7))
					{
					entities.clear();
					entities.add(new vampire(X/2-76,Y/2-84,4,4,4,2));
					idEntity=4;
					}
				if(arg0.getSource() == buttons.get(8))
				{
				stat.takeVariable();
				stat.print();
				}
			}
		}
		repaint();
	}

}

