package Model;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class fighter extends entity { //daughter class of entity

	characImage CI = new characImage(); 
	
	public fighter(int x, int y, int id, int Life,int FLife, int Dmg) {
		super(x, y, id, Life,FLife, Dmg); //see entity constructor
	}
	
	//see entity
	
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
	
	public void draw(Graphics2D g2d) //draw the fighter entity
	{
		g2d.drawImage(getFighterImg("image/fighter/fighter.png"), x, y, null);
		super.drawInf(g2d);
	}
	
	public void drawReverse(Graphics2D g2d) //idem for AI
	{
		g2d.drawImage(getFighterImg("image/fighter/fighterFlip.png"), x, y, null);
		super.drawInfR(g2d);
	}
	
	//idem that draw and drawReverse method but for the fighter Action (Atk, Def, special Atk)
	
	public void drawAtk(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/fighter/fighterAtk.png"), x+200, y-50, null);
		super.drawInf(g2d);
	}
	
	public void drawAtkReverse(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/fighter/fighterAtkFlip.png"), x-200, y-50, null);
		super.drawInfR(g2d);
	}
	
	public void drawDef(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/fighter/fighterDef.png"), x+200, y, null);
		super.drawInf(g2d);
	}
	
	public void drawDefReverse(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/fighter/fighterDefFlip.png"), x-200, y, null);
		super.drawInfR(g2d);
	}
	
	public void drawSpe(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/fighter/fighterSpe.png"), x+200, y-50, null);
		super.drawInf(g2d);
	}
	
	public void drawSpeReverse(Graphics2D g2d)
	{
		g2d.drawImage(getFighterImg("image/fighter/fighterSpeFlip.png"), x+200, y-50, null);
		super.drawInfR(g2d);
	}
		
	public Image getFighterImg(String image) //get fighter images
	{
		ImageIcon ic = new ImageIcon(image);
		return ic.getImage();	
	}
	
}
