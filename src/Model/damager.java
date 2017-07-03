package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class damager extends entity {

	public damager(int x, int y) {
		super(x, y);
	}

	public void update()
	{
		
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getPlayerImg(), x, y, null);
	}
	
	public Image getPlayerImg()
	{
		ImageIcon ic = new ImageIcon("C:/Users/titou/git/VirtualFighter/image/damager1.png");
		return ic.getImage();	
	}
}
