package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class tank extends entity{

	characImage CI = new characImage(); 
	
	public tank(int x, int y, int id, int Life,int FLife, int Dmg) {
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
		g2d.drawImage(getTankImg("image/tank/tank.png"), x, y, null);
		super.drawInf(g2d);
	}
	
	public void drawReverse(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankFlip.png"), x, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawAtk(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankAtk.png"), x+200, y, null);
		super.drawInf(g2d);
	}
	
	public void drawAtkReverse(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankAtkFlip.png"), x-200, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawDef(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankDef.png"), x+200, y, null);
		super.drawInf(g2d);
	}
	
	public void drawDefReverse(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankDefFlip.png"), x-200, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawSpe(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankSpe.png"), x+140, y, null);
		super.drawInf(g2d);
	}
	
	public void drawSpeReverse(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankSpeFlip.png"), x-180, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawDead(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankDead.png"), x, y, null);
		super.drawInf(g2d);
	}
	
	public void drawDeadReverse(Graphics2D g2d)
	{
		g2d.drawImage(getTankImg("image/tank/tankDeadFlip.png"), x, y, null);
		super.drawInfR(g2d);
	}
	
	public Image getTankImg(String image)
	{
		ImageIcon ic = new ImageIcon(image);
		return ic.getImage();	
	}
	
}
