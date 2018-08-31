/*package Entity;

import java.awt.image.BufferedImage;

public class Animation {

	private BufferedImage[] frames;
	private int currentFrame;
	
	private long startTime;
	private long delay;
	
	//useful for one time things
	private boolean playedOnce;
	
	public void Animation()
	{
		playedOnce=false;
	}
	
	//this is how we set frames
	public void setFrames(BufferedImage [] frames)
	{
		this.frames = frames;
		currentFrame = 0;
		
		//sets start time
		startTime = System.nanoTime();
		playedOnce = false;
		
		
	}
	
	//gives the animation a delay
	public void setDelay(long d)
	{
		delay =d;
	}
	
	//manually sets the frame #
	public void setFrame(int i)
	{
		currentFrame = i;
	}
	
	//logic for moving to the next frame
	public void update()
	{
		//delay is -1 then there is no animation
		if(delay==-1) return;
		
		//finds how long since the last frame has been displayed
		long elapsed = (System.nanoTime()-startTime)/1000000;
		if(elapsed >delay)
		{
			//moves the next frame
			currentFrame++;
			startTime = System.nanoTime();
			
		}
		//finds if we go out of bounds and resetts
		if(currentFrame ==frames.length)
		{
			currentFrame=0;
			playedOnce=true;
			
		}
	}
	
	public int getFrame()
	{
		return currentFrame;
	}
	
	public BufferedImage getImage() 
	{
		return frames[currentFrame];
	}
	
	public boolean hasPlayedOnce()
	{
		return playedOnce; 
	}
}
*/
