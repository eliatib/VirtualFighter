package Model;

import java.awt.Graphics2D;

public class entity {
	protected int x,y,id,Life,FLife,Dmg;
	characImage CI = new characImage();
	
	public entity(int x, int y, int id, int Life,int FLife, int Dmg)
	{
		this.x = x;
		this.y = y;
		this.id = id;
		this.Life = Life;
		this.FLife = FLife;
		this.Dmg = Dmg;
	}
	
	public void draw(Graphics2D g2d){}
	
	public void drawReverse(Graphics2D g2d){}
	
	public void drawInf(Graphics2D g2d)
	{
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), i*64, 65, null);
		}
	}
	
	public void drawInfR(Graphics2D g2d)
	{
		for (int i=0;i<Life;i++)
		{
			g2d.drawImage(CI.getLifeImg(), 825-i*64, 0, null);
		}
		
		for (int i=0;i<Dmg;i++)
		{
			g2d.drawImage(CI.getDmgImg(), 825-i*64, 65, null);
		}
	}
	
	public void drawAtk(Graphics2D g2d){}
	
	public void drawAtkReverse(Graphics2D g2d){}
	
	public void drawDef(Graphics2D g2d){}
	
	public void drawDefReverse(Graphics2D g2d){}
	
	public void drawSpe(Graphics2D g2d){}
	
	public void drawSpeReverse(Graphics2D g2d){}
	
	public void drawDead(Graphics2D g2d){}
	
	public void drawDeadReverse(Graphics2D g2d){}
	
	public int getId()
	{
		return id;
	}
	
	public int getLife()
	{
		return Life;
	}
	
	public int getFLife()
	{
		return FLife;
	}
	
	public int getDmg()
	{
		return Dmg;
	}
}
