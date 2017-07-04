package Model;

import java.awt.Graphics2D;

public class entity {
	protected int x,y,Life,Power,Id;
	

	public entity(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics2D g2d){}
	
	public void drawReverse(Graphics2D g2d){}
}
