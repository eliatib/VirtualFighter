package View;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class background extends JPanel{

	JLabel background;
	
	public void paint(Graphics g)
	{
		super.paint(g);
		ImageIcon ic = new ImageIcon("image/FDB1.jpg");
		background = new JLabel(ic);
		return
	}
}
