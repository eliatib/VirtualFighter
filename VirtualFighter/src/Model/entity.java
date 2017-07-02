package Model;

import java.awt.Graphics2D;

public class entity {
	protected int x,y,Life,Power,Id;
	
	public void Entity(int x, int y, int Life, int Power, int Id)
	{
		this.x = x;
		this.y = y;
		this.Life = Life;
		this.Power = Power;
		this.Id = Id;
	}
	
	public void draw(Graphics2D g2d)
	{
		
	}
}
