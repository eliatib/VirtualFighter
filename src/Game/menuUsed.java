package Game;

import java.util.ArrayList;
import javax.swing.JButton;

public class menuUsed {
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	window W = new window();
	public void menuChoice()
	{
		buttons.clear();
		buttons.add(new JButton("Fighter"));
		buttons.add(new JButton("Healer"));
		buttons.add(new JButton("Tank"));
		buttons.add(new JButton("Alea"));
		buttons.add(new JButton("Normal"));
		buttons.add(new JButton("Hard"));
		W.window(buttons);
	}
	
	public void menuFight(){}
	
	public void menuRetry(){}
	
}
