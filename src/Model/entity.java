package Model;

import java.awt.Graphics2D;

public class entity {
	protected int x,y,id,Life,Dmg;
	
	public entity(int x, int y, int id, int Life, int Dmg)
	{
		this.x = x;
		this.y = y;
		this.id = id;
		this.Life = Life;
		this.Dmg = Dmg;
	}
	
	public void draw(Graphics2D g2d){}
	
	public void drawReverse(Graphics2D g2d){}
	
	public int getId()
	{
		return id;
	}
	
	public int getLife()
	{
		return Life;
	}
	
	public int getDmg()
	{
		return Dmg;
	}
}
