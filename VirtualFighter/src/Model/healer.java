package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class healer extends entity{
	 //idem that fighter class but for the healer entity
	characImage CI = new characImage(); 

	
	public healer(int x, int y, int id, int Life,int FLife, int Dmg) {
		super(x, y, id, Life, FLife, Dmg);
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
		g2d.drawImage(getHealerImg("image/healer/healer.png"), x, y, null);
		super.drawInf(g2d);
	}
	
	public void drawReverse(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("image/healer/healerFlip.png"), x, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawAtk(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("image/healer/healerAtk.png"), x+90, y, null);
		super.drawInf(g2d);
	}
	
	public void drawAtkReverse(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("image/healer/healerAtkFlip.png"), x-190, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawDef(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("image/healer/healerDef.png"), x+140, y, null);
		super.drawInf(g2d);
	}
	
	public void drawDefReverse(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("image/healer/healerDefFlip.png"), x-200, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawSpe(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("image/healer/healerSpe.png"), x+90, y, null);
		super.drawInf(g2d);
	}
	
	public void drawSpeReverse(Graphics2D g2d)
	{
		g2d.drawImage(getHealerImg("image/healer/healerSpeFlip.png"), x-190, y, null);
		super.drawInfR(g2d);
	}
	
	public Image getHealerImg(String image)
	{
		ImageIcon ic = new ImageIcon(image);
		return ic.getImage();	
	}
	
}
