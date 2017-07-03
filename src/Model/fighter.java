package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class fighter extends entity {

	characImage CI = new characImage(); 
	int Life=3;
	int Dmg=2;
	
	public fighter(int x, int y) {
		super(x, y);
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg(), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 65, null);
		}
	}
	
	public int getFighterLife()
	{
		return Life;
	}
	
	public int getFighterDmg()
	{
		return Dmg;
	}
	
	public Image getFighterImg()
	{
		ImageIcon ic = new ImageIcon("image/damager1.png");
		return ic.getImage();	
	}
	
}
