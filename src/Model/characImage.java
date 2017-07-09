package Model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class characImage {

	public Image getLifeImg() //get the Life image
	{
		ImageIcon ic = new ImageIcon("image/Life.png");
		return ic.getImage();
	}
	public Image getDmgImg() //get the Dmg image
	{
		ImageIcon ic = new ImageIcon("image/Dmg.png");
		return ic.getImage();
	}
}
