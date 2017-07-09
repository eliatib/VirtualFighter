package Game;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import Model.*;
import View.window;
import View.windowElements;

public class menuUsed {
	ArrayList<JButton> buttons = new ArrayList<JButton>();// create a ArrayList who contain all the buttons of each menu 
	ArrayList<entity> entities = new ArrayList<entity>(); // create a ArrayList who contain entities who need to be display in each menu 
	Random r = new Random();
	window W = new window();
	private int menu,idChoice,idChoiceAI;
	String Result;
	public void menuChoice()
	{
		buttons.clear(); //clear the ArrayList buttons to display only the buttons of this menu
		menu=0;
		JButton button1,button2,button3,button4,button5,button6,button7,button8,button9;
		button1 = new JButton("Alea"); //define all buttons of the menu and their name
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
		button9 = new JButton("Stat");
		buttons.add(button9);
		W.window(buttons,entities,menu); //initialize the window creation depending of the buttons, the entities and the menu to display.
	}
	
	public void menuFight(int id_entity)
	{
		buttons.clear(); //idem that the menuChoice
		menu=1;
		JButton button1,button2,button3;
		button1 = new JButton("Attack");
		buttons.add(button1);
		button2 = new JButton("Defence");
		buttons.add(button2);
		button3 = new JButton("Special");
		buttons.add(button3);
		idChoice=id_entity;
		idChoiceAI=r.nextInt(5-1)+1;
		choice(idChoice,100); // see choice method
		choice(idChoiceAI,635); // idem
		W.window(buttons,entities,menu); //idem that the menuChoice
	}
	
	public int getIdChoiceAI() {
		return idChoiceAI; //get the id of the AI character to now which character it is
	}

	public void menuRetry(int Result) 
	{
		buttons.clear(); //idem that menuChoice
		if(Result==1){menu=2;}
		if(Result==2){menu=3;} //choose which menu display depending of the result
		if(Result==3){menu=4;}
		JButton button1,button2;
		button1 = new JButton("Quit"); //idem that menuChoice
		buttons.add(button1);
		button2 = new JButton("Retry");
		buttons.add(button2);
		W.window(buttons,entities,menu); //idem that menuChoice
	}

	public void choice(int idChoice,int X) //choose which entity display depending of the entity id and his coordinate X 
	{
		if (idChoice==1)
		{
			entities.add(new fighter(X,900/2-84,1,3,3,2)); //add entity to the Arraylist entities
		}
		if (idChoice==2)
		{
			entities.add(new healer(X,900/2-88,2,4,4,1)); //idem
		}
		if (idChoice==3)
		{
			entities.add(new tank(X,900/2-45,3,5,5,1)); //idem
		}
		if (idChoice==4)
		{
			entities.add(new vampire(X,900/2-84,4,4,4,2)); //idem
		}
	}

}
