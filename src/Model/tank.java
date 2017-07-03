package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class tank extends entity{

	characImage CI = new characImage(); 
	int Life=5;
	int Dmg=1;
	
	public tank(int x, int y) {
		super(x, y);
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg(), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 65, null);
		}
	}
	
	public int getTankLife()
	{
		return Life;
	}
	
	public int getTankDmg()
	{
		return Dmg;
	}
	
	public Image getTankImg()
	{
		ImageIcon ic = new ImageIcon("image/tank1.png");
		return ic.getImage();	
	}
	
}
