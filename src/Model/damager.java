package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class damager extends entity {

	int Life=3;
	int Dmg=2;
	
	public damager(int x, int y) {
		super(x, y);
	}

	public void update()
	{
		
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getPlayerImg(), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(getDmgImg(), i*64, 65, null);
		}
	}
	
	public Image getPlayerImg()
	{
		ImageIcon ic = new ImageIcon("image/damager1.png");
		return ic.getImage();	
	}
	
	public Image getLifeImg()
	{
		ImageIcon ic = new ImageIcon("image/Life.png");
		return ic.getImage();
	}
	public Image getDmgImg()
	{
		ImageIcon ic = new ImageIcon("image/Dmg.png");
		return ic.getImage();
	}
}
