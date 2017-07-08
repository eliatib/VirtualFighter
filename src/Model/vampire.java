package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class vampire extends entity{

	characImage CI = new characImage(); 
	
	public vampire(int x, int y, int id, int Life, int FLife, int Dmg) {
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
		g2d.drawImage(getVampireImg("image/vampire/vampire.png"), x, y, null);
		super.drawInf(g2d);
	}
	
	public int getVampireLife()
	{
		return Life;
	}
	
	public int getVampireDmg()
	{
		return Dmg;
	}
	
	public void drawReverse(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireFlip.png"), x, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawAtk(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireAtk.png"), x+200, y, null);
		super.drawInf(g2d);
	}
	
	public void drawAtkReverse(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireAtkFlip.png"), x-200, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawDef(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireDef.png"), x+200, y, null);
		super.drawInf(g2d);
	}
	
	public void drawDefReverse(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireDefFlip.png"), x-200, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawSpe(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireSpe.png"), x+160, y, null);
		super.drawInf(g2d);
	}
	
	public void drawSpeReverse(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireSpeFlip.png"), x-180, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawDead(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireDead.png"), x, y, null);
		super.drawInf(g2d);
	}
	
	public void drawDeadReverse(Graphics2D g2d)
	{
		g2d.drawImage(getVampireImg("image/vampire/vampireDeadFlip.png"), x, y, null);
		super.drawInfR(g2d);
	}
	
	public Image getVampireImg(String image)
	{
		ImageIcon ic = new ImageIcon(image);
		return ic.getImage();	
	}
	
}
