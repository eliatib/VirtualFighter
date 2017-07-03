package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class vampire extends entity{

	characImage CI = new characImage(); 
	int Life=4;
	int Dmg=2;
	
	public vampire(int x, int y) {
		super(x, y);
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg(), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 65, null);
		}
	}
	
	public int getVampireLife()
	{
		return Life;
	}
	
	public int getVampireDmg()
	{
		return Dmg;
	}
	
	public Image getVampireImg()
	{
		ImageIcon ic = new ImageIcon("image/vampire1.png");
		return ic.getImage();	
	}
	
}
