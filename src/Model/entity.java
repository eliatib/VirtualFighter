package Model;

import java.awt.Graphics2D;

public class entity {
	protected int x,y,id,Life,FLife,Dmg;
	characImage CI = new characImage();
	
	public entity(int x, int y, int id, int Life,int FLife, int Dmg) //constructor who define the characteristic of each entity for thedaughter classes
	{
		this.x = x; //coordinate x
		this.y = y; //coordinate y
		this.id = id; //entity id
		this.Life = Life; //entity life
		this.FLife = FLife; //entity maximum life
		this.Dmg = Dmg; //entity Dmg
	}
	
	public void draw(Graphics2D g2d){} //see in daughter class
	
	public void drawReverse(Graphics2D g2d){} //idem
	
	public void drawAtk(Graphics2D g2d){} //idem
	
	public void drawAtkReverse(Graphics2D g2d){} //idem
	
	public void drawDef(Graphics2D g2d){} //idem
	
	public void drawDefReverse(Graphics2D g2d){} //idem
	
	public void drawSpe(Graphics2D g2d){} //idem
	
	public void drawSpeReverse(Graphics2D g2d){} //idem
	
	public void drawDead(Graphics2D g2d){} //idem
	
	public void drawDeadReverse(Graphics2D g2d){} //idem
	
	public void drawInf(Graphics2D g2d) //draw information of the entity
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
	
	public void drawInfR(Graphics2D g2d) //same that drawInf but for the AI
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
	
	//all getter to get entity information
	
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
