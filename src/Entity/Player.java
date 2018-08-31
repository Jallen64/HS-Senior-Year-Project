package Entity;


//import package Tilemap;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Player {

	
	//player attributes 
	private boolean shoot; 
	private boolean killed;
	private Color c;
	private int x;
	private int y;
	private boolean selected; 
	
	//animations
	/*private ArrayList<BufferedImage[]>sprites;
	
	//keeps count of frame amount per action KEEP IN ORDER
	private final int[] numFrames = 
	{
		2,1,1,2
	};
	
	//animation actions
	private static final int IDLE=0;
	private static final int DEATH=1;
	private static final int SHOOT=2;
	private static final int WIN=3;
	*/
	
	
	public void select()
	{
		selected = true;
	}
	
	public void deSelect()
	{
		selected = false; 
	}
	
	
	
	public void kill()
	{
		killed = true; 
	}
	
	public void live()
	{
		killed = false; 
	}
	public void draw(Graphics2D g, Color c, int x, int y)
	{
		
		
		
		if (selected == true)
		{
			g.setColor(new Color(255,215,0));
		}
		else
		{
			g.setColor(c);
		}
		
		
		
		
		if (killed == true)
		{
			g.setColor(new Color(0,0,0));
		}
		else
		{
			g.setColor(c);
		}
		
		g.fillOval(x, y, 25, 25);
		g.setColor(c);
		g.fillOval(x + 3, y + 3, 19, 19);
	}
	
}
