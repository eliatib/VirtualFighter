package Game;

import java.util.ArrayList;
import javax.swing.JButton;

public class menuUsed {
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	window W = new window();
	public void menuChoice()
	{
		buttons.clear();
		buttons.add(new JButton("test"));
		W.window(buttons);
	}
	
	public void menuFight(){}
	
	public void menuRetry(){}
	
}
