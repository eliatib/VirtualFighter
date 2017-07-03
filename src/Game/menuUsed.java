package Game;

import java.util.ArrayList;
import javax.swing.JButton;

public class menuUsed {
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	window W = new window();
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
		W.window(buttons);
	}
	
	public void menuFight(){}
	
	public void menuRetry(){}
	
}
