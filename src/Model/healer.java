package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class healer extends entity{

	characImage CI = new characImage(); 
	int Life=4;
	int Dmg=1;
	
	public healer(int x, int y) {
		super(x, y);
	}
	
	public void draw(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg(), x, y, null);
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 65, null);
		}
	}
	
	public int getHealerLife()
	{
		return Life;
	}
	
	public int getHealerDmg()
	{
		return Dmg;
	}
	
	public Image getHealerImg()
	{
		ImageIcon ic = new ImageIcon("image/healer1.png");
		return ic.getImage();	
	}
	
}
