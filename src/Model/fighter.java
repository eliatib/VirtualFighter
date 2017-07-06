package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class fighter extends entity {

	characImage CI = new characImage(); 
	
	public fighter(int x, int y, int id, int Life,int FLife, int Dmg) {
		super(x, y, id, Life,FLife, Dmg);
	}
	
	public int getId()
	{
		return super.getId();
	}
	
	public int getLife()
	{
		return super.getLife();
	}
	
	public int getFLife()
	{
		return super.getFLife();
	}
	
	public int getDmg()
	{
		return super.getDmg();
	}
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/damager1.png"), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 65, null);
		}
	}
	
	public void drawReverse(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/damager1Flip.png"), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), 825-i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), 825-i*64, 65, null);
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
	
	public Image getFighterImg(String image)
	{
		ImageIcon ic = new ImageIcon(image);
		return ic.getImage();	
	}
	
}
