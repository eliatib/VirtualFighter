package Game;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import Model.*;
import View.window;
import View.windowElements;

public class menuUsed {
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	ArrayList<entity> entities = new ArrayList<entity>();
	Random r = new Random();
	window W = new window();
	private int idChoice,idChoiceAI;
	public void menuChoice()
	{
		buttons.clear();
		JButton button1,button2,button3,button4,button5,button6,button7,button8;
		button1 = new JButton("Alea");
		buttons.add(button1);
		button2 = new JButton("Normal");
		buttons.add(button2);
		button3 = new JButton("Hard");
		buttons.add(button3);
		button4 = new JButton("Play");
		buttons.add(button4);
		button5 = new JButton("Fighter");
		buttons.add(button5);
		button6 = new JButton("Healer");
		buttons.add(button6);
		button7 = new JButton("Tank");
		buttons.add(button7);
		button8 = new JButton("Vampire");
		buttons.add(button8);
		W.window(buttons,entities);
	}
	
	public void menuFight(int id_entity)
	{
		buttons.clear();
		JButton button1,button2,button3;
		button1 = new JButton("Attack");
		buttons.add(button1);
		button2 = new JButton("Defence");
		buttons.add(button2);
		button3 = new JButton("Special");
		buttons.add(button3);
		idChoice=id_entity;
		idChoiceAI=r.nextInt(5-1)+1;
		choice(idChoice,100);
		choice(idChoiceAI,635);
		W.window(buttons,entities);
	}
	
	public int getIdChoiceAI() {
		return idChoiceAI;
	}

	public void menuRetry(){}
	
	public void choice(int idChoice,int X)
	{
		if (idChoice==1)
		{
			entities.add(new fighter(X,900/2-84));
		}
		if (idChoice==2)
		{
			entities.add(new healer(X,900/2-88));
		}
		if (idChoice==3)
		{
			entities.add(new tank(X,900/2-45));
		}
		if (idChoice==4)
		{
			entities.add(new vampire(X,900/2-84));
		}
	}
}
