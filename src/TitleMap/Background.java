package TitleMap;

import Main.GamePanel;

import java.awt.image.*;

import javax.imageio.ImageIO;

import Main.GamePanel;

import java.awt.*;

public class Background {

	private BufferedImage image;
	
	private double x;
	private double y;
	private double dx;
	private double dy; 
	
	//rate at which background scrolls
	private double moveScale;
	
	public Background(String s, double ms)
	{
		//This imports resource files
		try{
			image = ImageIO.read(
					//this is a resource now because it is apart of the build path
					//IF REPLICATING BE SURE THAT THE RESOURCE FOLDER IS APART OF THE BUILD PATH
					getClass().getResourceAsStream(s)
					);
			moveScale = ms;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void setPosition(double x, double y)
	{
		//Reset if background goes off the screen
		this.x= (x*moveScale) % GamePanel.WIDTH;
		this.y= (y * moveScale) % GamePanel.HEIGHT;;
		
	}
	
	//this is to make the background scroll automatically
	public void setVector(double dx, double dy)
	{
		this.dx=dx;
		this.dy=dy;
	}
	
	//not necessary but is needed if I need to scroll the background
	public void update()
	{
		x+=dx;
		y+=dy;
		
	}
	
	//draws the background
	public void draw(Graphics2D g){
		g.drawImage(image, (int)x, (int)y, null );
		
		//feeds in more background to the right (or left) of the screen\
		if(x<0) {
			g.drawImage(image, (int)x + GamePanel.WIDTH,(int)y,null);
		}
		if (x>0) {
			g.drawImage(image,(int)x - GamePanel.WIDTH, (int)y, null);
		}
	}
	
}
