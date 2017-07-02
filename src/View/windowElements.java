package View;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class windowElements extends JPanel implements ActionListener
{
	public void WindowElements(ArrayList<JButton> buttons)
	{
		setFocusable(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	} 
}
